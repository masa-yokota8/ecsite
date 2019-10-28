package com.internousdev.ecsite.action;
import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class UserDeleteCompleteAction extends ActionSupport{

	private String login_Id;
	private String message;
	public String execute() throws SQLException {
		String ret;
		String result = ERROR;
		message = null;
		UserDeleteCompleteDAO udcDAO = new UserDeleteCompleteDAO();
		ret = udcDAO.userDelete(login_Id);
		if (ret.equals("success")){
			result = SUCCESS;
			message = "削除できました。";
		}
		return result;
	}

	public String getLogin_Id() {
		return login_Id;
	}

	public void setLogin_Id(String login_Id) {
		this.login_Id = login_Id;
	}

	public String getMessage(){
		return message;
	}
}
