package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
public class UserListDAO {

	public ArrayList<UserInfoDTO> getUserInfo() throws SQLException{
		ArrayList<UserInfoDTO> userListDTO = new ArrayList<UserInfoDTO>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		String sql = "select id, login_id, login_pass, user_name, insert_date, admin_flg from login_user_transaction";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				UserInfoDTO dto = new UserInfoDTO();
				dto.setUser_Id(rs.getString("id"));
				dto.setLogin_Id(rs.getString("login_id"));
				dto.setLogin_Pass(rs.getString("login_pass"));
				dto.setUser_Name(rs.getString("user_name"));
				dto.setInsert_Date(rs.getString("insert_date"));
				dto.setAdminFlag(rs.getString("admin_flg"));
				userListDTO.add(dto);
			}

		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return userListDTO;
	}
}
