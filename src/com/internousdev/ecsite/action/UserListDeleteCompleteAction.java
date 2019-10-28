package com.internousdev.ecsite.action;
import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{

	private String message;
	public String execute() throws SQLException{
		String result= ERROR;
		UserListCompleteDAO userLC = new UserListCompleteDAO();
		int ret = userLC.deleteUserList();
		if (ret > 0){
			message = "削除に成功しました。";
			result = SUCCESS;
		}else if(ret <= 0) {
			message = "削除に失敗しました。";
		}

		return result;
	}

	public String getMessage() {
		return message;
	}
}
