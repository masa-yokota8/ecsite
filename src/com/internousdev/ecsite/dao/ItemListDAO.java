package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
public class ItemListDAO {

	public ArrayList<ItemInfoDTO> getItemInfo() throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ItemInfoDTO> IteminfoDTO = new ArrayList<ItemInfoDTO>();

		String sql = "select id, item_names, item_price, item_stock, insert_date from item_info_transaction";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemInfoDTO dto = new ItemInfoDTO();
				dto.setItemId(rs.getString("id"));
				dto.setItemName(rs.getString("item_names"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				IteminfoDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return IteminfoDTO;
	}
}
