package edu.tsinghua.entity;

import java.io.Serializable;

public class HuibaoYuan implements Serializable{
	private int huibaoYuanId;
	private int userId;
	private int jingliId;
	private String huibaoTitle;
	private String huibaoNeirong;
	private String huibaoHuifu;
	private String Zhuangtai;
	public int getHuibaoYuanID() {
		return huibaoYuanId;
	}
	public void setHuibaoYuanID(int huibaoYuanId) {
		this.huibaoYuanId = huibaoYuanId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getJingliId() {
		return jingliId;
	}
	public void setJingliId(int jingliId) {
		this.jingliId = jingliId;
	}
	public String getHuibaoTitle() {
		return huibaoTitle;
	}
	public void setHuibaoTitle(String huibaoTitle) {
		this.huibaoTitle = huibaoTitle;
	}
	public String getHuibaoNeirong() {
		return huibaoNeirong;
	}
	public void setHuibaoNeirong(String huibaoNeirong) {
		this.huibaoNeirong = huibaoNeirong;
	}
	public String getHuibaoHuifu() {
		return huibaoHuifu;
	}
	public void setHuibaoHuifu(String huibaoHuifu) {
		this.huibaoHuifu = huibaoHuifu;
	}
	public String getZhuangtai() {
		return Zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		Zhuangtai = zhuangtai;
	}
	public HuibaoYuan() {
		super();
	}
	public HuibaoYuan(int huibaoYuanId, int userId, int jingliId, String huibaoTitle, String huibaoNeirong,
			String huibaoHuifu, String zhuangtai) {
		super();
		this.huibaoYuanId = huibaoYuanId;
		this.userId = userId;
		this.jingliId = jingliId;
		this.huibaoTitle = huibaoTitle;
		this.huibaoNeirong = huibaoNeirong;
		this.huibaoHuifu = huibaoHuifu;
		Zhuangtai = zhuangtai;
	}
	public HuibaoYuan(int userId, int jingliId, String huibaoTitle, String huibaoNeirong, String huibaoHuifu,
			String zhuangtai) {
		super();
		this.userId = userId;
		this.jingliId = jingliId;
		this.huibaoTitle = huibaoTitle;
		this.huibaoNeirong = huibaoNeirong;
		this.huibaoHuifu = huibaoHuifu;
		Zhuangtai = zhuangtai;
	}
	
}
