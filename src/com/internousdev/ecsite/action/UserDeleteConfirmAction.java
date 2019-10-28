package com.internousdev.ecsite.action;
import com.opensymphony.xwork2.ActionSupport;
public class UserDeleteConfirmAction extends ActionSupport{

	private String login_Id;
	public String execute() {
		return SUCCESS;
	}

	public String getLogin_Id(){
		return login_Id;
	}

	public void setLogin_Id(String login_Id) {
		this.login_Id = login_Id;
	}
}
