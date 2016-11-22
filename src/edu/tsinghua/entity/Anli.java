package edu.tsinghua.entity;

public class Anli {
	private int anliId;
	private String anliName;
	private String anliNeirong;
	
	
	public int getHuodongId() {
		return anliId;
	}
	public void setHuodongId(int anliId) {
		this.anliId = anliId;
	}
	public String getHuodongName() {
		return anliName;
	}
	public void setHuodongName(String anliName) {
		this.anliName = anliName;
	}
	public String getHuodongNeirong() {
		return anliNeirong;
	}
	public void setHuodongNeirong(String anliNeirong) {
		this.anliNeirong = anliNeirong;
	}
	public Anli() {
		super();
	}
	public Anli(String anliName, String anliNeirong) {
		super();
		this.anliName = anliName;
		this.anliNeirong = anliNeirong;
	}
	public Anli(int anliId, String anliName, String anliNeirong) {
		super();
		this.anliId = anliId;
		this.anliName = anliName;
		this.anliNeirong = anliNeirong;
	}
	
	
}
