package edu.tsinghua.entity;

import java.io.Serializable;

public class LoginInfo implements Serializable{
	private int loginInfoId;
	private int userId;
	private String loginInfoPwd;
	
	
	
	public int getLoginInfoId() {
		return loginInfoId;
	}
	public void setLoginInfoId(int loginInfoId) {
		this.loginInfoId = loginInfoId;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginInfoPwd() {
		return loginInfoPwd;
	}
	public void setLoginInfoPwd(String loginInfoPwd) {
		this.loginInfoPwd = loginInfoPwd;
	}
	public LoginInfo(int loginInfoId, int userId, String loginInfoPwd) {
		super();
		this.loginInfoId = loginInfoId;
		this.userId = userId;
		this.loginInfoPwd = loginInfoPwd;
	}
	public LoginInfo(int loginInfoId, String loginInfoPwd) {
		super();
		this.loginInfoId = loginInfoId;
		this.loginInfoPwd = loginInfoPwd;
	}
	public LoginInfo() {
		super();
	}
	
	

}
