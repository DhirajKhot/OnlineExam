/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.common.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 *
 */
public class PageSupporter<T> {

	public PageSupporter(){
        metaData = new HashMap<String,Object>();
    }
    
	private Map<String,Object> metaData;	
	private List<T> items;
	

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}	

	
	public Map<String,Object> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String,Object> metaData) {
        this.metaData = metaData;
    }

    @Override
	public String toString() {
		return "PageSupporter [ items=" + items + "]";
	}		
}
