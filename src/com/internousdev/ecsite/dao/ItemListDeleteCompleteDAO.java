package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
public class ItemListDeleteCompleteDAO {

	public int deleteItemList() throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int ret = 0;

		String sql = "delete from item_info_transaction";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ret = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return ret;
	}
}
