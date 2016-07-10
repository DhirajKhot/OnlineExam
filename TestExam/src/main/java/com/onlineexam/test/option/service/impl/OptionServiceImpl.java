/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.option.service.impl;

import org.springframework.stereotype.Service;

import com.onlineexam.test.common.dao.OnlineExamDAO;
import com.onlineexam.test.common.service.OnlineExamAbstractService;
import com.onlineexam.test.option.bean.Option;
import com.onlineexam.test.option.service.OptionService;

/**
 * @author Dhiraj Khot
 *
 */
@Service
public class OptionServiceImpl extends OnlineExamAbstractService<Integer, Option> implements OptionService {

	@Override
	public OnlineExamDAO<Option> getDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Option get(Integer optionId) {
		
		Option option = new Option();
		option.setId(optionId);
		if (optionId.equals(1)) {
			option.setValue("Mumbai");
		} else if (optionId.equals(2)) {
			option.setValue("Delhi");
		} else if (optionId.equals(3)) {
			option.setValue("Bangalore");
		} else if (optionId.equals(4)) {
			option.setValue("Hyderabad");
		}
		
		return option;
	}
	
}
