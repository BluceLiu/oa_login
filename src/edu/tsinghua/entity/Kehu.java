package edu.tsinghua.entity;

public class Kehu {
	private int kehuId;
	private String kehuName;
	private String dizhi;
	private String lianxifangshi;
	public int getKehuId() {
		return kehuId;
	}
	public void setKehuId(int kehuId) {
		this.kehuId = kehuId;
	}
	public String getKehuName() {
		return kehuName;
	}
	public void setKehuName(String kehuName) {
		this.kehuName = kehuName;
	}
	public String getDizhi() {
		return dizhi;
	}
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	public Kehu(int kehuId, String kehuName, String dizhi, String lianxifangshi) {
		super();
		this.kehuId = kehuId;
		this.kehuName = kehuName;
		this.dizhi = dizhi;
		this.lianxifangshi = lianxifangshi;
	}
	public Kehu(String kehuName, String dizhi, String lianxifangshi) {
		super();
		this.kehuName = kehuName;
		this.dizhi = dizhi;
		this.lianxifangshi = lianxifangshi;
	}
	public Kehu() {
		super();
	}
	
	
	
}
