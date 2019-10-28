package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.ItemDetailsDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class ItemDetailsAction extends ActionSupport{

	private String itemId;
	private List<ItemInfoDTO> iiDTOList = new ArrayList<ItemInfoDTO>();

	public String execute() throws SQLException{
		ItemDetailsDAO idDAO = new ItemDetailsDAO();
		ItemInfoDTO iiDTO = new ItemInfoDTO();
		String result = SUCCESS;

		iiDTO = idDAO.selectDetails(itemId);
		iiDTOList.add(iiDTO);

		return result;
	}

	public List<ItemInfoDTO> getIiDTOList(){
		return this.iiDTOList;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
}
