/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.common.bean;

/**
 * @author Dhiraj Khot
 *
 */
public enum MarksEnum {

	HALF_MARK(0.5), ONE_MARK(1d), TWO_MARKS(2d);
	
	private Double marks;
	
	private MarksEnum(Double marks) {
		this.marks = marks;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	
	
}
