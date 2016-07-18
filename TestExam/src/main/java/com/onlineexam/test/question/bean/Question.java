/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.question.bean;

import java.util.List;

import com.onlineexam.test.common.bean.OnlineExamEntity;
import com.onlineexam.test.common.bean.OnlineExamSerializable;
import com.onlineexam.test.option.bean.Option;

/**
 * @author Dhiraj Khot
 *
 */
public class Question implements OnlineExamEntity<Integer>, OnlineExamSerializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7526342644801047508L;
	
	private Integer id;
	private String questionData;
	private Integer marks;
	private List<Option> options;
	private List<Option> correctAnswers;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestionData() {
		return questionData;
	}
	public void setQuestionData(String questionData) {
		this.questionData = questionData;
	}
	
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public List<Option> getCorrectAnswers() {
		return correctAnswers;
	}
	public void setCorrectAnswers(List<Option> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
	}
	
	@Override
	public String toString() {
		String str = "Question: id - " + id;
		return str;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
