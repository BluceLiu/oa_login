package edu.tsinghua.entity;
import java.io.Serializable;

public class Gongzi implements Serializable{
private int gongziId;
private int userId;
private int chuqinQue;//缺勤
private int jiaban;//加班时长
private int gongziJiBie;//工资级别
private int gongziYing;//应发工资
private String   zhuangtai;//审批状态

public Gongzi() {
	super();
}

public Gongzi(int gongziId) {
	super();
	this.gongziId = gongziId;
}

public int getGongziId() {
	return gongziId;
}
public void setGongziId(int gongziId) {
	this.gongziId = gongziId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
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
public int getGongziJiBie() {
	return gongziJiBie;
}
public void setGongziJiBie(int gongziJiBie) {
	this.gongziJiBie = gongziJiBie;
}
public int getGongziYing() {
	return gongziYing;
}
public void setGongziYing(int gongziYing) {
	this.gongziYing = gongziYing;
}
public String getZhuangtai() {
	return zhuangtai;
}
public void setZhuangtai(String zhuangtai) {
	this.zhuangtai = zhuangtai;
}
public Gongzi(int gongziId, int userId, int chuqinQue, int jiaban, int gongziJiBie, int gongziYing, String zhuangtai) {
	super();
	this.gongziId = gongziId;
	this.userId = userId;
	this.chuqinQue = chuqinQue;
	this.jiaban = jiaban;
	this.gongziJiBie = gongziJiBie;
	this.gongziYing = gongziYing;
	this.zhuangtai = zhuangtai;
}
public Gongzi(int userId, int chuqinQue, int jiaban, int gongziJiBie, int gongziYing, String zhuangtai) {
	super();
	this.userId = userId;
	this.chuqinQue = chuqinQue;
	this.jiaban = jiaban;
	this.gongziJiBie = gongziJiBie;
	this.gongziYing = gongziYing;
	this.zhuangtai = zhuangtai;
}

}
