package com.longstore.domain;

public class GoodsSku extends EntitySuper {
	private static final long serialVersionUID = -7776723050011645176L;
	
	/**
	 * 商品id
	 */
	private Integer goodsId;
	/**
	 * 商品属性id
	 */
	private Integer propertyId;
	/**
	 * 商品属性值id
	 */
	private Integer propertyValueId;
	/**
	 * 总库存
	 */
	private Integer stock;
	/**
	 * 已售库存
	 */
	private Integer sellStock;
	/**
	 * 占用库存
	 */
	private Integer occupyStock;
	/**
	 * 状态，-1：删除，1：正常
	 */
	private Integer status;

	public GoodsSku() {
	}

	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId){
		this.goodsId = goodsId;
	}
	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId){
		this.propertyId = propertyId;
	}
	public Integer getPropertyValueId() {
		return propertyValueId;
	}
	public void setPropertyValueId(Integer propertyValueId){
		this.propertyValueId = propertyValueId;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock){
		this.stock = stock;
	}
	public Integer getSellStock() {
		return sellStock;
	}
	public void setSellStock(Integer sellStock){
		this.sellStock = sellStock;
	}
	public Integer getOccupyStock() {
		return occupyStock;
	}
	public void setOccupyStock(Integer occupyStock){
		this.occupyStock = occupyStock;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}

}