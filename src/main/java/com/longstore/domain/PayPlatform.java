package com.longstore.domain;

public class PayPlatform extends EntitySuper {
	private static final long serialVersionUID = 8196273775664153902L;
	
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 类型，1：pc，2：wap，3：app
	 */
	private Integer type;
	/**
	 * 配置，json格式
	 */
	private String config;
	/**
	 * 状态，-1:删除，1：可用
	 */
	private Integer status;

	public PayPlatform() {
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
	public String getConfig() {
		return config;
	}
	public void setConfig(String config){
		this.config = config;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}

}