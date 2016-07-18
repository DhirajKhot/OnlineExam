/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.exam.bean;

import java.util.List;

import com.onlineexam.test.common.bean.OnlineExamEntity;
import com.onlineexam.test.common.bean.OnlineExamSerializable;
import com.onlineexam.test.question.bean.Question;

/**
 * @author Dhiraj Khot
 *
 */
public class Exam implements OnlineExamEntity<Integer>, OnlineExamSerializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2989871159912863815L;
	
	private Integer id;
	private List<Question> questions;
	private Integer totalMarks;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

}
