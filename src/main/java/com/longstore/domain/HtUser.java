package com.longstore.domain;

import java.util.Date;

public class HtUser extends EntitySuper {
	private static final long serialVersionUID = -2721145907703015768L;
	
	/**
	 * 用户名称
	 */
	private String name;
	/**
	 * 手机号码
	 */
	private String telephone;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 头像地址
	 */
	private String avatar;
	/**
	 * 1：男，2：女，3：其他
	 */
	private Integer sex;
	/**
	 * 用户状态，-1：删除，1：激活
	 */
	private Integer status;
	/**
	 * 注册时间
	 */
	private Date registTime;

	public HtUser() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex){
		this.sex = sex;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime){
		this.registTime = registTime;
	}

}