package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User() {
		super();
	}
	public User(int userId, String userName, int pasword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pasword = pasword;
	}
	public int getPasword() {
		return pasword;
	}
	public void setPasword(int pasword) {
		this.pasword = pasword;
	}
	String userName;
	int pasword;
}
