<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品登録確認画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>ItemConfirm</p>
		</div>
		<div>
			<h3>登録する内容は以下でよろしいでしょうか。</h3>
			<table>
				<s:form action="ItemCreateCompleteAction">
					<tr id="box">
						<td><label>商品名:</label></td><td><s:property value="session.item_name" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>値段:</label></td><td><s:property value="session.item_price" escape="false"/></td>
					</tr>
					<tr id="box">
						<td>個数:</td><td><s:property value="session.item_stock" escape="false"/></td>
					</tr>
					<tr>
						<td><s:submit value="完了"/></td>
					</tr>
				</s:form>
			</table>
		</div>
	</div>
</body>
</html>