package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserCreateCompleteDAO {

	public void createUser(String loginUserId, String loginUserPassword, String userName) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name, insert_date) VALUES(?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginUserPassword);
			ps.setString(3, userName);
			ps.setString(4, dateUtil.getDate());

			ps.execute();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

	public String bookingUser(String loginUserId) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String ret = "success";
		String sql = "SELECT * FROM login_user_transaction where login_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ret = "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return ret;
	}
}
