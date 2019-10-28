package com.internousdev.ecsite.action;
import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class ItemDeleteCompleteAction extends ActionSupport{

	private String itemId;
	private String message;

	public String execute() throws SQLException{
		ItemDeleteCompleteDAO idcDAO = new ItemDeleteCompleteDAO();
		String ret = idcDAO.itemDelete(itemId);
		String result = ERROR;
		if (ret.equals("success")){
			result = SUCCESS;
			message = "削除が完了しました";
		}

		return result;
	}

	public String getItemId(){
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMessage() {
		return message;
	}
}
