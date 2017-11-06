package com.longstore.domain;

public class OrderGoods extends EntitySuper {
	private static final long serialVersionUID = -3503984770771724129L;
	
	/**
	 * 订单ID
	 */
	private Integer orderId;
	/**
	 * sku ID
	 */
	private Integer skuId;
	/**
	 * 商品ID
	 */
	private Integer goodsId;
	/**
	 * 商品名称
	 */
	private String goodsDesc;
	/**
	 * sku 描述
	 */
	private String skuDesc;
	/**
	 * 自定义商品源链接
	 */
	private String goodsUrl;
	/**
	 * 单价
	 */
	private Double price;
	/**
	 * 购买数量
	 */
	private Integer num;

	public OrderGoods() {
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId){
		this.skuId = skuId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId){
		this.goodsId = goodsId;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc){
		this.goodsDesc = goodsDesc;
	}
	public String getSkuDesc() {
		return skuDesc;
	}
	public void setSkuDesc(String skuDesc){
		this.skuDesc = skuDesc;
	}
	public String getGoodsUrl() {
		return goodsUrl;
	}
	public void setGoodsUrl(String goodsUrl){
		this.goodsUrl = goodsUrl;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num){
		this.num = num;
	}

}