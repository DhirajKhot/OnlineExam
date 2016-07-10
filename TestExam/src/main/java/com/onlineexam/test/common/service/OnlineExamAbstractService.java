/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.common.service;

import java.io.Serializable;

import com.onlineexam.test.common.bean.OnlineExamEntity;
import com.onlineexam.test.common.bean.PageSupporter;
import com.onlineexam.test.common.dao.OnlineExamDAO;

/**
 * @author Dhiraj Khot
 *
 */
public abstract class OnlineExamAbstractService<ID extends Serializable, ENTITY extends OnlineExamEntity<ID>>
		implements OnlineExamService<ID, ENTITY> {

	public ENTITY get(ID entityIdToGet) {

		OnlineExamDAO<ENTITY> dao = getDao();
		ENTITY record = dao.get(entityIdToGet);
		return record;
	}

	public ENTITY create(ENTITY entityToCreate) {
		// TODO Auto-generated method stub
		return null;
	}

	public ENTITY update(ENTITY entityToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(ID entityIdToDelete) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageSupporter<ENTITY> search() {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract OnlineExamDAO<ENTITY> getDao();
}
