package com.internousdev.ecsite.dto;

public class UserInfoDTO {

	private String user_Id;
	private String login_Id;
	private String login_Pass;
	private String user_Name;
	private String insert_Date;
	private String adminFlag;

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getLogin_Id() {
		return login_Id;
	}

	public void setLogin_Id(String login_Id) {
		this.login_Id = login_Id;
	}

	public String getLogin_Pass() {
		return login_Pass;
	}

	public void setLogin_Pass(String login_Pass) {
		this.login_Pass = login_Pass;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getInsert_Date() {
		return insert_Date;
	}

	public void setInsert_Date(String insert_Date) {
		this.insert_Date = insert_Date;
	}

	public String getAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}
}
