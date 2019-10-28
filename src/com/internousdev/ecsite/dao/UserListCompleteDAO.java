package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListCompleteDAO {

	public int deleteUserList() throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int res = 0;
		String sql = "delete from login_user_transaction where admin_flg != '1' or admin_flg is null";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			res = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return res;
	}
}
