package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
public class ItemDetailsDAO {

	public ItemInfoDTO selectDetails(String id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ItemInfoDTO IIDTO = new ItemInfoDTO();

		String sql = "select * from item_info_transaction where id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				IIDTO.setItemId(rs.getString("id"));
				IIDTO.setItemName(rs.getString("item_names"));
				IIDTO.setItemPrice(rs.getString("item_price"));
				IIDTO.setItemStock(rs.getString("item_stock"));
				IIDTO.setInsertDate(rs.getString("insert_date"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return IIDTO;
	}
}
