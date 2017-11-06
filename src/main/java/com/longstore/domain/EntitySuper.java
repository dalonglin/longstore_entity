package com.longstore.domain;

import java.io.Serializable;

public class EntitySuper implements Serializable{
	private static final long serialVersionUID = -4230739175665682782L;
	
	/** 主键 */
	private Integer id;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}