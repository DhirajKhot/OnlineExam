/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.option.bean;

import com.onlineexam.test.common.bean.OnlineExamEntity;
import com.onlineexam.test.common.bean.OnlineExamSerializable;

/**
 * @author Dhiraj Khot
 *
 */
public class Option implements OnlineExamEntity<Integer>, OnlineExamSerializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8451053635708728048L;
	
	private Integer id;
	private String value;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Option other = (Option) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
	}
	
	@Override
	public String toString() {
		String str = "Option: id - " + id;
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
