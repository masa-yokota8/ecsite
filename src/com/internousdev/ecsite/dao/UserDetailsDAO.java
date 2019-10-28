package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
public class UserDetailsDAO {

	public UserInfoDTO selectUserDetails(String id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserInfoDTO dto = new UserInfoDTO();
		String sql = "select * from login_user_transaction where login_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setUser_Id(rs.getString("id"));
				dto.setLogin_Id(rs.getString("login_id"));
				dto.setLogin_Pass(rs.getString("login_pass"));
				dto.setUser_Name(rs.getString("user_name"));
				dto.setInsert_Date(rs.getString("insert_date"));
				dto.setAdminFlag(rs.getString("admin_flg"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return dto;
	}
}
