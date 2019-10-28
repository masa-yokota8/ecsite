package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private String itemPrice;
	private String itemStock;
	private Map<String, Object> session;
	private String errormessage;
	public String execute(){
		String result = SUCCESS;

		if (!(itemName.equals("")) && !(itemPrice.equals("")) && !(itemStock.equals(""))){
			session.put("item_name", itemName);
			session.put("item_price", itemPrice);
			session.put("item_stock", itemStock);
		} else {
			setErrorMessage("未入力の項目があります");
			result =ERROR;
		}

		return result;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public String getErrorMessage(){
		return errormessage;
	}

	public void setErrorMessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
