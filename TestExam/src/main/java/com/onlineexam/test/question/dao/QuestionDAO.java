/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.question.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.onlineexam.test.common.dao.OnlineExamDAO;
import com.onlineexam.test.question.bean.Question;

/**
 * @author Dhiraj Khot
 *
 */
public interface QuestionDAO extends OnlineExamDAO<Question> {

	public List<Question> getQuestionsByMarks(@Param("marks")Double marks);
}
