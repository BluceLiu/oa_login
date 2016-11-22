package edu.tsinghua.entity;

public class UserType {
	private int UserTypeId;
	private String TypeName;
	
	
	public int getUserTypeId() {
		return UserTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		UserTypeId = userTypeId;
	}
	public String getTypeName() {
		return TypeName;
	}
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}
	public UserType(int userTypeId, String typeName) {
		super();
		UserTypeId = userTypeId;
		TypeName = typeName;
	}
	public UserType() {
		super();
	}
	public UserType(String typeName) {
		super();
		TypeName = typeName;
	}
	

}
