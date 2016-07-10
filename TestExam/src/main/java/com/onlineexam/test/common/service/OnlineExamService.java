/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.common.service;

import java.io.Serializable;

import com.onlineexam.test.common.bean.OnlineExamEntity;
import com.onlineexam.test.common.bean.PageSupporter;

/**
 * @author Dhiraj Khot
 *
 */
public interface OnlineExamService<ID extends Serializable, ENTITY extends OnlineExamEntity<ID>> {

	public enum ServiceMethod{       
        create,update,delete,get,search
    }

	public ENTITY get(ID entityIdToGet);
	
	public PageSupporter<ENTITY> search();
	
	public ENTITY create(ENTITY entityToCreate);
	
	public ENTITY update(ENTITY entityToUpdate);
	
	public Boolean delete(ID entityIdToDelete);

}
