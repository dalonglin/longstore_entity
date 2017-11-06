package com.longstore.domain;

public class OrderPayCallbackRecord extends EntitySuper {
	private static final long serialVersionUID = 448239058067422110L;
	
	/**
	 * 支付类型，1：微信，2：支付宝
	 */
	private Integer payMode;
	/**
	 * 支付平台名称
	 */
	private String platName;
	/**
	 * 订单编号
	 */
	private String orderNo;
	/**
	 * 交易流水号
	 */
	private String tradeNo;
	/**
	 * 交易状态
	 */
	private String tradeStatus;
	/**
	 * 参数
	 */
	private String params;

	public OrderPayCallbackRecord() {
	}

	public Integer getPayMode() {
		return payMode;
	}
	public void setPayMode(Integer payMode){
		this.payMode = payMode;
	}
	public String getPlatName() {
		return platName;
	}
	public void setPlatName(String platName){
		this.platName = platName;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo){
		this.orderNo = orderNo;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo){
		this.tradeNo = tradeNo;
	}
	public String getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(String tradeStatus){
		this.tradeStatus = tradeStatus;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params){
		this.params = params;
	}

}