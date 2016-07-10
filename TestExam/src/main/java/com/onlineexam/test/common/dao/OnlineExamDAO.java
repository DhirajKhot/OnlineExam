/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.common.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Dhiraj Khot
 *
 */
public interface OnlineExamDAO<E> {

	public E create(@Param("bean") E e);
	
	public E update(@Param("bean") E e);
	
	public E get(@Param("id") Serializable e);
	
	public List<E> get(@Param("ids") List<? extends Serializable> ids);
}
