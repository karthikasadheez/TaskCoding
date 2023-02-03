package com.n2s.ehc.karthika;

public class UserBean {
	private int optionValue;
	private String userId;
	private String userName;
	
	public int getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(int optionValue) {
		this.optionValue = optionValue;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserBean(int optionValue, String userId, String userName) {
		super();
		this.optionValue = optionValue;
		this.userId = userId;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserBean [optionValue=" + optionValue + ", userId=" + userId + ", userName=" + userName + "]";
	}
	
	
	

}