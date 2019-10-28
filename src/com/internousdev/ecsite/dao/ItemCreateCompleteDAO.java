package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;
public class ItemCreateCompleteDAO {

	public void createItem(String item_name, String item_price, String item_stock) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql="insert into item_info_transaction(item_names, item_price, item_stock, insert_date) values(?, ?, ?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_name);
			ps.setString(2, item_price);
			ps.setString(3, item_stock);
			ps.setString(4, dateUtil.getDate());
			ps.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			con.close();
		}
	}
}
