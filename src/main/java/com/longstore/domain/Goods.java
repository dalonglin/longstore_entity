package com.longstore.domain;

public class Goods extends EntitySuper {
	private static final long serialVersionUID = -7892016347475750175L;
	
	/**
	 * 商品分类ID
	 */
	private Integer categoryId;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 商品图片
	 */
	private String poster;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 价格
	 */
	private Double price;
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
	 * 状态，-1：删除，0：已下架，1：销售中，2：已售磬
	 */
	private Integer status;

	public Goods() {
	}

	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content){
		this.content = content;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price){
		this.price = price;
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