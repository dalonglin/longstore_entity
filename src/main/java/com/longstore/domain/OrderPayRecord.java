package com.longstore.domain;

import java.util.Date;

public class OrderPayRecord extends EntitySuper {
	private static final long serialVersionUID = 9165127551191789612L;
	
	/**
	 * 订单ID
	 */
	private Integer orderId;
	/**
	 * 支付平台名称
	 */
	private String platName;
	/**
	 * 支付时间
	 */
	private Date payTime;
	/**
	 * 交易流水号
	 */
	private String tradeNo;
	/**
	 * 支付状态，0：支付中，1：支付成功，2：支付失败
	 */
	private Integer payStatus;

	public OrderPayRecord() {
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	public String getPlatName() {
		return platName;
	}
	public void setPlatName(String platName){
		this.platName = platName;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime){
		this.payTime = payTime;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo){
		this.tradeNo = tradeNo;
	}
	public Integer getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Integer payStatus){
		this.payStatus = payStatus;
	}

}