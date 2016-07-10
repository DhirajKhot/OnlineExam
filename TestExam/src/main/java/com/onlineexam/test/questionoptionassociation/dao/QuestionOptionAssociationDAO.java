/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.questionoptionassociation.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.onlineexam.test.common.dao.OnlineExamDAO;
import com.onlineexam.test.questionoptionassociation.bean.QuestionOptionAssociation;

/**
 * @author Dhiraj Khot
 *
 */
public interface QuestionOptionAssociationDAO extends OnlineExamDAO<QuestionOptionAssociation> {
	
	public List<QuestionOptionAssociation> getOptionsForQuestion(@Param("id") Serializable id);

}
