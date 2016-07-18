/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.question.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.test.common.dao.OnlineExamDAO;
import com.onlineexam.test.common.service.OnlineExamAbstractService;
import com.onlineexam.test.option.bean.Option;
import com.onlineexam.test.question.bean.Question;
import com.onlineexam.test.question.dao.QuestionDAO;
import com.onlineexam.test.question.service.QuestionService;
import com.onlineexam.test.questionoptionassociation.bean.QuestionOptionAssociation;
import com.onlineexam.test.questionoptionassociation.service.QuestionOptionAssociationService;

/**
 * @author Dhiraj Khot
 *
 */
@Service
public class QuestionServiceImpl extends OnlineExamAbstractService<Integer, Question> implements QuestionService {

	@Autowired
	private QuestionOptionAssociationService questionOptionAssociationService;

	@Autowired
	private QuestionDAO questionDao;

	@Override
	public OnlineExamDAO<Question> getDao() {
		return questionDao;
	}

	@Override
	public Question get(Integer questionId) {
		Question question = super.get(questionId);
		setOptionsAndCorrectAnswer(question);
		return question;
	}

	private void setOptionsAndCorrectAnswer(Question question) {

		List<Option> options = new ArrayList<Option>();
		List<Option> correctOptions = new ArrayList<Option>();
		List<QuestionOptionAssociation> questionOptionAssociations = questionOptionAssociationService
				.getByQuestionId(question.getId());

		for (QuestionOptionAssociation association : questionOptionAssociations) {
			options.add(association.getOption());
			if (association.getIsCorrect()) {
				correctOptions.add(association.getOption());
			}
		}
		question.setOptions(options);
		question.setCorrectAnswers(correctOptions);
	}
}
