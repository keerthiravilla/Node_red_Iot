package com.SPMProject.backend.entityModel;

import java.io.Serializable;

public class UserRoleId implements Serializable
{
	/**
	 *
	 */
	private static final long serialVersionUID = -9008114105618095675L;

	private long user_id;

	private long role_id;

	public UserRoleId() {
		
	}

	public UserRoleId(long user_id, long role_id) {
		this.user_id = user_id;
		this.role_id = role_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public long getRole_id() {
		return role_id;
	}

	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

}
