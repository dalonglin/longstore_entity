package com.longstore.domain;

import java.util.Date;

public class UserThirdInfo extends EntitySuper {
	private static final long serialVersionUID = 3107013220705414104L;
	
	/**
	 * 用户信息ID
	 */
	private Integer userId;
	/**
	 * 三方帐号类型，1：微信，2：QQ
	 */
	private Integer type;
	/**
	 * 三方帐号id
	 */
	private String account;
	/**
	 * open id
	 */
	private String openid;
	/**
	 * 注册时间
	 */
	private Date registTime;

	public UserThirdInfo() {
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type){
		this.type = type;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account){
		this.account = account;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid){
		this.openid = openid;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime){
		this.registTime = registTime;
	}

}