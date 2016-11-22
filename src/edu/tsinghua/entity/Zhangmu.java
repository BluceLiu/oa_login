package edu.tsinghua.entity;
import java.io.Serializable;

public class Zhangmu implements Serializable{
private int zhangmuId;
private int  userId;//操作会计
private String time;//时间
private String  caozuo;//操作 （发工资，采购）
private int  jine;//金额
private int jieyu;//结余
public int getZhangmuId() {
	return zhangmuId;
}
public void setZhangmuId(int zhangmuId) {
	this.zhangmuId = zhangmuId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getCaozuo() {
	return caozuo;
}
public void setCaozuo(String caozuo) {
	this.caozuo = caozuo;
}
public int getJine() {
	return jine;
}
public void setJine(int jine) {
	this.jine = jine;
}
public int getJieyu() {
	return jieyu;
}
public void setJieyu(int jieyu) {
	this.jieyu = jieyu;
}
public Zhangmu(int zhangmuId, int userId, String time, String caozuo, int jine, int jieyu) {
	super();
	this.zhangmuId = zhangmuId;
	this.userId = userId;
	this.time = time;
	this.caozuo = caozuo;
	this.jine = jine;
	this.jieyu = jieyu;
}
public Zhangmu() {
	super();
}
}
