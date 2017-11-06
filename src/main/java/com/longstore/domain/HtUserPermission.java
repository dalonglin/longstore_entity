package com.longstore.domain;

public class HtUserPermission extends EntitySuper {
	private static final long serialVersionUID = -6389139542834038800L;
	
	/**
	 * 后台用户ID
	 */
	private Integer userId;
	/**
	 * 后台权限ID
	 */
	private Integer permissionId;

	public HtUserPermission() {
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId){
		this.permissionId = permissionId;
	}

}