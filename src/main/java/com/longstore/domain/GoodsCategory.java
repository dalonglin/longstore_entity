package com.longstore.domain;

public class GoodsCategory extends EntitySuper {
	private static final long serialVersionUID = 3775527889223529431L;
	
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 图片
	 */
	private String poster;
	/**
	 * 状态，-1：删除，1：正常
	 */
	private Integer status;

	public GoodsCategory() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster){
		this.poster = poster;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}

}