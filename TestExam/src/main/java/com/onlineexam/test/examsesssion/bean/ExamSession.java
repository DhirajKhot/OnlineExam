/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.examsesssion.bean;

import java.util.Map;

import com.onlineexam.test.common.bean.OnlineExamEntity;
import com.onlineexam.test.common.bean.OnlineExamSerializable;

/**
 * @author Dhiraj Khot
 *
 */
public class ExamSession implements OnlineExamEntity<Integer>, OnlineExamSerializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8052413734777957011L;
	
	private Integer currentQuestionNumber;
	private String optionChoosed;
	private Map<Integer, String> answerMap;
	
	public Integer getCurrentQuestionNumber() {
		return currentQuestionNumber;
	}
	public void setCurrentQuestionNumber(Integer currentQuestionNumber) {
		this.currentQuestionNumber = currentQuestionNumber;
	}
	public String getOptionChoosed() {
		return optionChoosed;
	}
	public void setOptionChoosed(String optionChoosed) {
		this.optionChoosed = optionChoosed;
	}
	public Map<Integer, String> getAnswerMap() {
		return answerMap;
	}
	public void setAnswerMap(Map<Integer, String> answerMap) {
		this.answerMap = answerMap;
	}
	
	

}
