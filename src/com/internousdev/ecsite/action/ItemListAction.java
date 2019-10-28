package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class ItemListAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private ItemListDAO  itemListDAO = new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemInfoList = new ArrayList<ItemInfoDTO>();

	public String execute() throws SQLException {
		String result = SUCCESS;
		itemInfoList = itemListDAO.getItemInfo();
		if (!(itemInfoList.size() > 0)){
			itemInfoList=null;
		}
		session.put("itemInfoList", itemInfoList);

		return result;
	}

	public ArrayList<ItemInfoDTO> getItemInfoList() {
		return itemInfoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
