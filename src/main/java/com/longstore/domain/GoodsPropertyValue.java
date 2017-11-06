package com.longstore.domain;

public class GoodsPropertyValue extends EntitySuper {
	private static final long serialVersionUID = -1376539106158528550L;
	
	/**
	 * 属性id
	 */
	private Integer propertyId;
	/**
	 * 属性值名称，如红色
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

	public GoodsPropertyValue() {
	}

	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId){
		this.propertyId = propertyId;
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