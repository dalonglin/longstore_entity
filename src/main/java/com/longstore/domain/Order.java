package com.longstore.domain;

import java.util.Date;

public class Order extends EntitySuper {
	private static final long serialVersionUID = -7718012226255571352L;
	
	/**
	 * 订单唯一编码
	 */
	private String orderNo;
	/**
	 * 商品数量
	 */
	private Integer goodsNum;
	/**
	 * 总商品费用
	 */
	private Double amount;
	/**
	 * 运费
	 */
	private Double freight;
	/**
	 * 客户ID
	 */
	private Integer userId;
	/**
	 * 收件人姓名
	 */
	private String receiverName;
	/**
	 * 收件人电话
	 */
	private String telephone;
	/**
	 * 省份名称
	 */
	private String provinceName;
	/**
	 * 城市名称
	 */
	private String cityName;
	/**
	 * 邮寄地址
	 */
	private String address;
	/**
	 * 客户备注
	 */
	private String remark;
	/**
	 * 下单时间
	 */
	private Date orderTime;
	/**
	 * 订单状态，1：下单成功，2：待发货，3：已发货，4：已完成，5：已取消，6：已过期
	 */
	private Integer orderStatus;
	/**
	 * 支付状态，1：未支付，2：已支付
	 */
	private Integer paymentStatus;
	/**
	 * 退款金额
	 */
	private Double refundAmount;
	/**
	 * 退款状态，0：没有退款，1：部分退款，2：全部退款
	 */
	private Integer refundStatus;
	/**
	 * 快递公司名称
	 */
	private String expressCom;
	/**
	 * 运单号
	 */
	private String expressNo;
	/**
	 * 系统备注
	 */
	private String systemRemark;

	public Order() {
	}

	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo){
		this.orderNo = orderNo;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum){
		this.goodsNum = goodsNum;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount){
		this.amount = amount;
	}
	public Double getFreight() {
		return freight;
	}
	public void setFreight(Double freight){
		this.freight = freight;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName){
		this.receiverName = receiverName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime){
		this.orderTime = orderTime;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus){
		this.orderStatus = orderStatus;
	}
	public Integer getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(Integer paymentStatus){
		this.paymentStatus = paymentStatus;
	}
	public Double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Double refundAmount){
		this.refundAmount = refundAmount;
	}
	public Integer getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(Integer refundStatus){
		this.refundStatus = refundStatus;
	}
	public String getExpressCom() {
		return expressCom;
	}
	public void setExpressCom(String expressCom){
		this.expressCom = expressCom;
	}
	public String getExpressNo() {
		return expressNo;
	}
	public void setExpressNo(String expressNo){
		this.expressNo = expressNo;
	}
	public String getSystemRemark() {
		return systemRemark;
	}
	public void setSystemRemark(String systemRemark){
		this.systemRemark = systemRemark;
	}

}