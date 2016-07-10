/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.questionoptionassociation.service;

import java.util.List;

import com.onlineexam.test.common.service.OnlineExamService;
import com.onlineexam.test.questionoptionassociation.bean.QuestionOptionAssociation;

/**
 * @author Dhiraj Khot
 *
 */
public interface QuestionOptionAssociationService extends OnlineExamService<Integer, QuestionOptionAssociation>{
	
	public List<QuestionOptionAssociation> getByQuestionId(Integer questionId);

}
