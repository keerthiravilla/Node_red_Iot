package com.SPMProject.backend.entityModel;

import javax.persistence.*;

@Entity
@IdClass(UserRoleId.class)
@Table(name = "user_roles")
public class UserRole
{
	@Id
	private long user_id;

	@Id
	private long role_id;

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