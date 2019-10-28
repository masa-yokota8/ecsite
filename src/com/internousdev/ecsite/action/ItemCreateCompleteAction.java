package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String item_name;
	private String item_price;
	private String item_stock;
	private Map<String, Object> session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException {
		itemCreateCompleteDAO.createItem(session.get("item_name").toString(), session.get("item_price").toString(), session.get("item_stock").toString());
		String result = SUCCESS;
		return result;
	}

	public String getItem_Name() {
		return item_name;
	}

	public void setItem_Name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_Price() {
		return item_price;
	}

	public void setItem_Price(String item_price){
		this.item_price = item_price;
	}

	public String getItem_Stock(){
		return item_stock;
	}

	public void setItem_Stock(String item_stock) {
		this.item_stock = item_stock;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
