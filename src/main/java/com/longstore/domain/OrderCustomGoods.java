package com.longstore.domain;

import java.util.Date;

public class OrderCustomGoods extends EntitySuper {
	private static final long serialVersionUID = 6631508755027377865L;
	
	/**
	 * 客户ID
	 */
	private Integer userId;
	/**
	 * 商品链接
	 */
	private String url;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 商品图片
	 */
	private String poster;
	/**
	 * 商品图片
	 */
	private String poster1;
	/**
	 * 商品图片
	 */
	private String poster2;
	/**
	 * 商品图片
	 */
	private String poster3;
	/**
	 * 商品图片
	 */
	private String poster4;
	/**
	 * 价格
	 */
	private Double price;
	/**
	 * 客户备注
	 */
	private String remark;
	/**
	 * 系统备注
	 */
	private String systemRemark;
	/**
	 * 下单时间
	 */
	private Date orderTime;
	/**
	 * 订单状态，1：下单成功，2：生成正式单，3：已取消
	 */
	private Integer status;

	public OrderCustomGoods() {
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url){
		this.url = url;
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
	public String getPoster1() {
		return poster1;
	}
	public void setPoster1(String poster1){
		this.poster1 = poster1;
	}
	public String getPoster2() {
		return poster2;
	}
	public void setPoster2(String poster2){
		this.poster2 = poster2;
	}
	public String getPoster3() {
		return poster3;
	}
	public void setPoster3(String poster3){
		this.poster3 = poster3;
	}
	public String getPoster4() {
		return poster4;
	}
	public void setPoster4(String poster4){
		this.poster4 = poster4;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getSystemRemark() {
		return systemRemark;
	}
	public void setSystemRemark(String systemRemark){
		this.systemRemark = systemRemark;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime){
		this.orderTime = orderTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}

}