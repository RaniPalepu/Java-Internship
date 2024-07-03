package com.pace.bean;

public class User {
	String username,emailid;
	public User(String username,String emailid) {
		super();
		this.username=username;
		this.emailid=emailid;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailid;
	}
	public void setEmailId(String emailid) {
		this.emailid = emailid;
	}

}
