package com.longstore.domain;

import java.util.Date;

public class OrderRefundRecord extends EntitySuper {
	private static final long serialVersionUID = -7583733392524386801L;
	
	/**
	 * 订单ID
	 */
	private Integer orderId;
	/**
	 * 退款编号
	 */
	private String refundNo;
	/**
	 * 退款金额
	 */
	private Double refundFee;
	/**
	 * 支付平台名称
	 */
	private String platName;
	/**
	 * 交易流水号
	 */
	private String tradeNo;
	/**
	 * 退款状态，0：退款中，1：退款成功，2：退款失败
	 */
	private Integer refundStatus;
	/**
	 * 退款时间
	 */
	private Date refundTime;
	/**
	 * 失败返回的结果
	 */
	private String refundMsg;

	public OrderRefundRecord() {
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	public String getRefundNo() {
		return refundNo;
	}
	public void setRefundNo(String refundNo){
		this.refundNo = refundNo;
	}
	public Double getRefundFee() {
		return refundFee;
	}
	public void setRefundFee(Double refundFee){
		this.refundFee = refundFee;
	}
	public String getPlatName() {
		return platName;
	}
	public void setPlatName(String platName){
		this.platName = platName;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo){
		this.tradeNo = tradeNo;
	}
	public Integer getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(Integer refundStatus){
		this.refundStatus = refundStatus;
	}
	public Date getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(Date refundTime){
		this.refundTime = refundTime;
	}
	public String getRefundMsg() {
		return refundMsg;
	}
	public void setRefundMsg(String refundMsg){
		this.refundMsg = refundMsg;
	}

}