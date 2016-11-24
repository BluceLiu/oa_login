package edu.tsinghua.entity;

import java.io.Serializable;

public class HuibaoJing implements Serializable{
	private int huibaoJingId;
	private int jingliId;
	private String huibaoTitle;
	private String  huibaoNeirong;
	private String huibaoHuifu;
	private String Zhuangtai;
	public int getHuibaoJingId() {
		return huibaoJingId;
	}
	public void setHuibaoJingId(int huibaoJingId) {
		this.huibaoJingId = huibaoJingId;
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

	public HuibaoJing(int jingliId, String huibaoTitle, String huibaoNeirong, String huibaoHuifu, String zhuangtai) {
		super();
		this.jingliId = jingliId;
		this.huibaoTitle = huibaoTitle;
		this.huibaoNeirong = huibaoNeirong;
		this.huibaoHuifu = huibaoHuifu;
		Zhuangtai = zhuangtai;
	}
	public HuibaoJing(int huibaoJingId, int jingliId, String huibaoTitle, String huibaoNeirong, String huibaoHuifu,
			String zhuangtai) {
		super();
		this.huibaoJingId = huibaoJingId;
		this.jingliId = jingliId;
		this.huibaoTitle = huibaoTitle;
		this.huibaoNeirong = huibaoNeirong;
		this.huibaoHuifu = huibaoHuifu;
		Zhuangtai = zhuangtai;
	}
	public HuibaoJing() {
		super();
	}

	
	
}
