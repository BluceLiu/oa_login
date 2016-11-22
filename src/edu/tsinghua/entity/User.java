package edu.tsinghua.entity;

public class User {
	private int userId;
	private String userName;
	private int userTypeId;
	private int bumenId;
	private int  gongzijibie;
	
	
	public int getGongzijibie() {
		return gongzijibie;
	}
	public void setGongzijibie(int gongzijibie) {
		this.gongzijibie = gongzijibie;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private int gongZiJiBie;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public int getBumenId() {
		return bumenId;
	}
	public void setBumenId(int bumenId) {
		this.bumenId = bumenId;
	}
	public int getGongZiJiBie() {
		return gongZiJiBie;
	}
	public void setGongZiJiBie(int gongZiJiBie) {
		this.gongZiJiBie = gongZiJiBie;
	}
	public User(int userId, String userName, int userTypeId, int bumenId, int gongzijibie, int gongZiJiBie2) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userTypeId = userTypeId;
		this.bumenId = bumenId;
		this.gongzijibie = gongzijibie;
		gongZiJiBie = gongZiJiBie2;
	}
	public User(String userName, int userTypeId, int bumenId, int gongzijibie, int gongZiJiBie2) {
		super();
		this.userName = userName;
		this.userTypeId = userTypeId;
		this.bumenId = bumenId;
		this.gongzijibie = gongzijibie;
		gongZiJiBie = gongZiJiBie2;
	}
	
	
	
	

}
