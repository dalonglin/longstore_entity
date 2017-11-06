package com.longstore.domain;

public class HtPermission extends EntitySuper {
	private static final long serialVersionUID = 4417728391594615370L;
	
	/**
	 * 父权限ID，顶级为0
	 */
	private Integer parentId;
	/**
	 * 权限名称
	 */
	private String name;
	/**
	 * 权限类型，1：链接，2：按钮
	 */
	private Integer type;
	/**
	 * 链接相对地址
	 */
	private String url;
	/**
	 * 排序
	 */
	private Integer sort;

	public HtPermission() {
	}

	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type){
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}

}