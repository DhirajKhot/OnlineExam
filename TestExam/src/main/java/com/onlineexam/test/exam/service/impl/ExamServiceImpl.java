/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.exam.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.onlineexam.test.common.bean.MarksEnum;
import com.onlineexam.test.common.dao.OnlineExamDAO;
import com.onlineexam.test.common.service.OnlineExamAbstractService;
import com.onlineexam.test.exam.bean.Exam;
import com.onlineexam.test.exam.service.ExamService;
import com.onlineexam.test.question.bean.Question;
import com.onlineexam.test.question.dao.QuestionDAO;
import com.onlineexam.test.question.service.QuestionService;

/**
 * @author Dhiraj Khot
 *
 */
@Service
public class ExamServiceImpl extends OnlineExamAbstractService<Integer, Exam> implements ExamService {

	@Value(value = "${exam.total.marks}")
	private Integer TOTAL_MARKS;

	@Value(value = "${exam.numberOfHalfMarkQuestions}")
	private Integer NUMBER_OF_HALF_MARK_QUESTIONS;

	@Value(value = "${exam.numberOfOneMarkQuestions}")
	private Integer NUMBER_OF_ONE_MARK_QUESTIONS;

	@Value(value = "${exam.numberOfTwoMarkQuestions}")
	private Integer NUMBER_OF_TWO_MARKS_QUESTIONS;

	@Autowired
	private QuestionDAO questionDAO;

	@Autowired
	private QuestionService questionService;
	
	private Map<Double, Integer> numberOfQuestionsMap = new HashMap<Double, Integer>();;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.onlineexam.test.common.service.OnlineExamAbstractService#getDao()
	 */
	@Override
	public OnlineExamDAO<Exam> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam create(Exam exam) {

		List<Question> examQuestions = new ArrayList<Question>();

		// Add half mark questions
		examQuestions.addAll(getQuestions(MarksEnum.HALF_MARK.getMarks()));

		// Add one mark questions
		examQuestions.addAll(getQuestions(MarksEnum.ONE_MARK.getMarks()));

		// Add two marks questions
		examQuestions.addAll(getQuestions(MarksEnum.TWO_MARKS.getMarks()));

		// Set exam questions
		exam.setQuestions(examQuestions);

		// set total marks
		exam.setTotalMarks(TOTAL_MARKS);

		return exam;
	}

	/**
	 * This method generates a list of random questions of a particular marks
	 * 
	 * @param marks
	 * @return
	 */
	private List<Question> getQuestions(Double marks) {

		List<Question> randomQuestions = new ArrayList<Question>();

		// Get list of questions of mark - marks from database
		List<Question> questions = questionDAO.getQuestionsByMarks(marks);
		populateNumberOfQuestionMap();
		if (!questions.isEmpty()) {
			Integer numberOfQuestions = numberOfQuestionsMap.get(marks);
			Random random = new Random();

			// Get random questions from the list obtained
			while (numberOfQuestions > 0) {
				Question question = questionService.get(questions.get(random.nextInt(questions.size())).getId());
				randomQuestions.add(question);
				questions.remove(question);
				numberOfQuestions = numberOfQuestions - 1;
			}
		}
		return randomQuestions;
	}

	private void populateNumberOfQuestionMap() {
		numberOfQuestionsMap.put(MarksEnum.HALF_MARK.getMarks(), NUMBER_OF_HALF_MARK_QUESTIONS);
		numberOfQuestionsMap.put(MarksEnum.ONE_MARK.getMarks(), NUMBER_OF_ONE_MARK_QUESTIONS);
		numberOfQuestionsMap.put(MarksEnum.TWO_MARKS.getMarks(), NUMBER_OF_TWO_MARKS_QUESTIONS);
	}

}
