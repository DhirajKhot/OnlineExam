/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.questionoptionassociation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.test.common.dao.OnlineExamDAO;
import com.onlineexam.test.common.service.OnlineExamAbstractService;
import com.onlineexam.test.questionoptionassociation.bean.QuestionOptionAssociation;
import com.onlineexam.test.questionoptionassociation.dao.QuestionOptionAssociationDAO;
import com.onlineexam.test.questionoptionassociation.service.QuestionOptionAssociationService;

/**
 * @author Dhiraj Khot
 *
 */
@Service
public class QuestionOptionAssociationServiceImpl extends OnlineExamAbstractService<Integer, QuestionOptionAssociation>
		implements QuestionOptionAssociationService {
	
	@Autowired
	private QuestionOptionAssociationDAO questionOptionAssociationDAO;
	
	@Override
	public OnlineExamDAO<QuestionOptionAssociation> getDao() {
		return questionOptionAssociationDAO;
	}
	
	public List<QuestionOptionAssociation> getByQuestionId(Integer questionId) {
		
		List<QuestionOptionAssociation> associationList = questionOptionAssociationDAO.getOptionsForQuestion(questionId);
		
		return associationList;
	}

}
