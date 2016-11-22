package edu.tsinghua.entity;

public class Huodong {
	private int huodongId;
	private String huodongName;
	private String huodongNeirong;
	public int getHuodongId() {
		return huodongId;
	}
	public void setHuodongId(int huodongId) {
		this.huodongId = huodongId;
	}
	public String getHuodongName() {
		return huodongName;
	}
	public void setHuodongName(String huodongName) {
		this.huodongName = huodongName;
	}
	public String getHuodongNeirong() {
		return huodongNeirong;
	}
	public void setHuodongNeirong(String huodongNeirong) {
		this.huodongNeirong = huodongNeirong;
	}
	public Huodong() {
		super();
	}
	public Huodong(String huodongName, String huodongNeirong) {
		super();
		this.huodongName = huodongName;
		this.huodongNeirong = huodongNeirong;
	}
	public Huodong(int huodongId, String huodongName, String huodongNeirong) {
		super();
		this.huodongId = huodongId;
		this.huodongName = huodongName;
		this.huodongNeirong = huodongNeirong;
	}
	
	
}
