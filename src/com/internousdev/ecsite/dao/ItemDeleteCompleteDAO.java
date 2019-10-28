package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
public class ItemDeleteCompleteDAO {

	public String itemDelete(String id) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String result = "error";
		String sql = "delete from item_info_transaction where id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			int ret = ps.executeUpdate();
			if (ret > 0) {
				result = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;
	}
}
