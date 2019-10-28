package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {

	private ArrayList<UserInfoDTO> userList = new ArrayList<UserInfoDTO>();
	private UserListDAO dao = new UserListDAO();
	private String admin;
	public String execute() throws SQLException{
		userList = dao.getUserInfo();
		if(userList.size() == 0){
			userList = null;
		} else if ((userList.size() == 1) && (userList.get(0).getAdminFlag().equals("1"))){
			admin = "1";
		} else {
			admin = null;
		}
		String result = SUCCESS;
		return result;
	}

	public ArrayList<UserInfoDTO> getUserList(){
		return userList;
	}

	public String getAdmin() {
		return admin;
	}
}
