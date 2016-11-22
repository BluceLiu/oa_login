package edu.tsinghua.entity;
import java.io.Serializable;
import java.sql.Date;

public class Kaoqin implements Serializable{
private  int kaoqinId;
private  Date   dakaTime;
private  int userId;
public int getKaoqinId() {
	return kaoqinId;
}
public void setKaoqinId(int kaoqinId) {
	this.kaoqinId = kaoqinId;
}
public Date getDakaTime() {
	return dakaTime;
}
public void setDakaTime(Date dakaTime) {
	this.dakaTime = dakaTime;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public Kaoqin(int kaoqinId, Date dakaTime, int userId) {
	super();
	this.kaoqinId = kaoqinId;
	this.dakaTime = dakaTime;
	this.userId = userId;
}
public Kaoqin() {
	super();
}
}
