package com.hiber.MyHibernate;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Users {
	@Id
	private int id;
	private String username;
	private String role;
	@Column(name="createdAt")
	private Date dt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	/**
	 * @param id
	 * @param username
	 * @param role
	 * @param dt
	 */
	private Users(int id, String username, String role, Date dt) {
		super();
		this.id = id;
		this.username = username;
		this.role = role;
		this.dt = dt;
	}
	/**
	 * 
	 */
	private Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", role=" + role + ", dt=" + dt + "]";
	}
	
	
}
