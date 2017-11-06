package com.longstore.domain;

public class GoodsProperty extends EntitySuper {
	private static final long serialVersionUID = 4082043044338633020L;
	
	/**
	 * 属性名称，如颜色
	 */
	private String name;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 状态，-1：删除，1：正常
	 */
	private Integer status;

	public GoodsProperty() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}

}