/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.questionoptionassociation.bean;

import com.onlineexam.test.common.bean.OnlineExamEntity;
import com.onlineexam.test.common.bean.OnlineExamSerializable;
import com.onlineexam.test.option.bean.Option;
import com.onlineexam.test.question.bean.Question;

/**
 * @author Dhiraj Khot
 *
 */
public class QuestionOptionAssociation implements OnlineExamEntity<Integer>, OnlineExamSerializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2216280069105361160L;
	private Question question;
	private Option option;
	private Boolean isCorrect;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	public Boolean getIsCorrect() {
		return isCorrect;
	}
	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
}
