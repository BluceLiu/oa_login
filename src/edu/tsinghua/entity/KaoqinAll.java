package edu.tsinghua.entity;
import java.io.Serializable;

public class KaoqinAll implements Serializable{
private  int   kaoqinAllId;
private int yue;//月份
private int bumenId;//部门id
private int userId;
private int chuqinYing;//应出勤天�?
private int chuqinShi;//实际出勤天数
private int chuqinQue;//缺勤天数
private int jiaban;//加班
public int getKaoqinAllId() {
	return kaoqinAllId;
}
public void setKaoqinAllId(int kaoqinAllId) {
	this.kaoqinAllId = kaoqinAllId;
}
public int getYue() {
	return yue;
}
public void setYue(int yue) {
	this.yue = yue;
}
public int getBumenId() {
	return bumenId;
}
public void setBumenId(int bumenId) {
	this.bumenId = bumenId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getChuqinYing() {
	return chuqinYing;
}
public void setChuqinYing(int chuqinYing) {
	this.chuqinYing = chuqinYing;
}
public int getChuqinShi() {
	return chuqinShi;
}
public void setChuqinShi(int chuqinShi) {
	this.chuqinShi = chuqinShi;
}
public int getChuqinQue() {
	return chuqinQue;
}
public void setChuqinQue(int chuqinQue) {
	this.chuqinQue = chuqinQue;
}
public int getJiaban() {
	return jiaban;
}
public void setJiaban(int jiaban) {
	this.jiaban = jiaban;
}
public KaoqinAll(int kaoqinAllId, int yue, int bumenId, int userId, int chuqinYing, int chuqinShi, int chuqinQue,
		int jiaban) {
	super();
	this.kaoqinAllId = kaoqinAllId;
	this.yue = yue;
	this.bumenId = bumenId;
	this.userId = userId;
	this.chuqinYing = chuqinYing;
	this.chuqinShi = chuqinShi;
	this.chuqinQue = chuqinQue;
	this.jiaban = jiaban;
}
public KaoqinAll() {
	super();
}


}
