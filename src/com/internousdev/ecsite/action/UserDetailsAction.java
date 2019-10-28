package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.UserDetailsDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDetailsAction extends ActionSupport{

	private List<UserInfoDTO> uiDTOList = new ArrayList<UserInfoDTO>();
	private String login_Id;
	private String admin_Flg;
	public String execute() throws SQLException{
		String result = SUCCESS;
		UserDetailsDAO uDDAO = new UserDetailsDAO();
		UserInfoDTO uIDTO = new UserInfoDTO();

		uIDTO = uDDAO.selectUserDetails(login_Id);
		if (uIDTO.getAdminFlag() != null){
			admin_Flg = "1";
		}
		uiDTOList.add(uIDTO);

		return result;
	}

	public List<UserInfoDTO> getUiDTOList(){
		return uiDTOList;
	}

	public String getLogin_Id() {
		return login_Id;
	}

	public void setLogin_Id(String login_Id) {
		this.login_Id = login_Id;
	}

	public String getAdmin_Flg(){
		return admin_Flg;
	}

	public void setAdmin_Flg(String admin_Flg){
		this.admin_Flg = admin_Flg;
	}
}
