package com.longstore.domain;

public class Article extends EntitySuper {
	private static final long serialVersionUID = 5401805142577934276L;
	
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 浏览次数
	 */
	private Integer viewCount;
	/**
	 * 评论次数
	 */
	private Integer reviewCount;
	/**
	 * 点赞次数
	 */
	private Integer dingCount;
	/**
	 * 状态，-1：删除，1：草稿，2：正常展示
	 */
	private Integer status;

	public Article() {
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content){
		this.content = content;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount){
		this.viewCount = viewCount;
	}
	public Integer getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(Integer reviewCount){
		this.reviewCount = reviewCount;
	}
	public Integer getDingCount() {
		return dingCount;
	}
	public void setDingCount(Integer dingCount){
		this.dingCount = dingCount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}

}