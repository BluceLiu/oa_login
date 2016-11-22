package edu.tsinghua.entity;

public class Chanpin {
	private int chanpinId;
	private String chanpinName;
	private String chanpinNeirong;
	public int getHuodongId() {
		return chanpinId;
	}
	public void setHuodongId(int chanpinId) {
		this.chanpinId = chanpinId;
	}
	public String getHuodongName() {
		return chanpinName;
	}
	public void setHuodongName(String chanpinName) {
		this.chanpinName = chanpinName;
	}
	public String getHuodongNeirong() {
		return chanpinNeirong;
	}
	public void setHuodongNeirong(String chanpinNeirong) {
		this.chanpinNeirong = chanpinNeirong;
	}
	public Chanpin() {
		super();
	}
	public Chanpin(String chanpinName, String chanpinNeirong) {
		super();
		this.chanpinName = chanpinName;
		this.chanpinNeirong = chanpinNeirong;
	}
	public Chanpin(int chanpinId, String chanpinName, String chanpinNeirong) {
		super();
		this.chanpinId = chanpinId;
		this.chanpinName = chanpinName;
		this.chanpinNeirong = chanpinNeirong;
	}
	
	
}
