package com.internousdev.ecsite.action;
import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{

	private String message;
	public String execute() throws SQLException {
		String result = ERROR;
		ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();
		int ret = dao.deleteItemList();
		if (ret > 0) {
			result = SUCCESS;
			message = "削除できました";
		} else if(ret == 0) {
			message = "削除できませんでした";
		}

		return result;
	}

	public String getMessage() {
		return message;
	}
}
