package edu.tsinghua.entity;

public class Bumen {
	private int bumenId;
	private String bumenName;
	private int jingLiId;
	
	
	
	public int getBumenId() {
		return bumenId;
	}
	public void setBumenId(int bumenId) {
		this.bumenId = bumenId;
	}
	public String getBumenName() {
		return bumenName;
	}
	public void setBumenName(String bumenName) {
		this.bumenName = bumenName;
	}
	public int getJingLiId() {
		return jingLiId;
	}
	public void setJingLiId(int jingLiId) {
		this.jingLiId = jingLiId;
	}
	public Bumen(int bumenId, String bumenName, int jingLiId) {
		super();
		this.bumenId = bumenId;
		this.bumenName = bumenName;
		this.jingLiId = jingLiId;
	}
	public Bumen(String bumenName, int jingLiId) {
		super();
		this.bumenName = bumenName;
		this.jingLiId = jingLiId;
	}
	public Bumen() {
		super();
	}

	
}
