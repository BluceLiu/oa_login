package edu.tsinghua.entity;

public class Xiangmu {
	private int xiangmuId;
	private int kehuId;
	private int userId;
	private String xiangmuName;
	private String xiangmuZhuangtai;
	
	
	public int getXiangmuId() {
		return xiangmuId;
	}
	public void setXiangmuId(int xiangmuId) {
		this.xiangmuId = xiangmuId;
	}
	public int getKehuId() {
		return kehuId;
	}
	public void setKehuId(int kehuId) {
		this.kehuId = kehuId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getXiangmuName() {
		return xiangmuName;
	}
	public void setXiangmuName(String xiangmuName) {
		this.xiangmuName = xiangmuName;
	}
	public String getXiangmuType() {
		return xiangmuZhuangtai;
	}
	public void setXiangmuType(String xiangmuZhuangtai) {
		this.xiangmuZhuangtai = xiangmuZhuangtai;
	}
	public Xiangmu() {
		super();
	}
	public Xiangmu(int xiangmuId, int kehuId, int userId, String xiangmuName, String xiangmuZhuangtai) {
		super();
		this.xiangmuId = xiangmuId;
		this.kehuId = kehuId;
		this.userId = userId;
		this.xiangmuName = xiangmuName;
		this.xiangmuZhuangtai = xiangmuZhuangtai;
	}
	
	
	
}
