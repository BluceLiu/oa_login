package edu.tsinghua.entity;

import java.io.Serializable;

public class HuibaoKuai implements Serializable{
	private int huibaoKuaiId;
	private int kuaijiId;
	private String huibaoTitle;
	private String  huibaoNeirong;
	private String huibaoHuifu;
	private String zhuangtai;
	
	
	public HuibaoKuai(String huibaoTitle, String huibaoNeirong) {
		super();
		this.huibaoTitle = huibaoTitle;
		this.huibaoNeirong = huibaoNeirong;
	}
	public int getHuibaoKuaiId() {
		return huibaoKuaiId;
	}
	public void setHuibaoKuaiId(int huibaoKuaiId) {
		this.huibaoKuaiId = huibaoKuaiId;
	}
	public int getKuaijiId() {
		return kuaijiId;
	}
	public void setKuaijiId(int kuaijiId) {
		this.kuaijiId = kuaijiId;
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
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		zhuangtai = zhuangtai;
	}
	public HuibaoKuai() {
		super();
	}
	public HuibaoKuai(int huibaoKuaiId, int kuaijiId, String huibaoTitle, String huibaoNeirong, String huibaoHuifu,
			String zhuangtai) {
		super();
		this.huibaoKuaiId = huibaoKuaiId;
		this.kuaijiId = kuaijiId;
		this.huibaoTitle = huibaoTitle;
		this.huibaoNeirong = huibaoNeirong;
		this.huibaoHuifu = huibaoHuifu;
		zhuangtai = zhuangtai;
	}
	public HuibaoKuai(int kuaijiId, String huibaoTitle, String huibaoNeirong, String huibaoHuifu, String zhuangtai) {
		super();
		this.kuaijiId = kuaijiId;
		this.huibaoTitle = huibaoTitle;
		this.huibaoNeirong = huibaoNeirong;
		this.huibaoHuifu = huibaoHuifu;
		zhuangtai = zhuangtai;
	}
	
	
}
