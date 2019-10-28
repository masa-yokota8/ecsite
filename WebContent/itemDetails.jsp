<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemDetails</title>
</head>
<body>
	<div id="header">
	</div>
	<div id = "main">
		<div id="top">
			<p>itemDetails</p>
		</div>
		<h3>詳細情報</h3>
		<table border="1">

			<tr>
				<th>商品ID</th>
				<th>商品名</th>
				<th>値段</th>
				<th>在庫数</th>
				<th>記入日</th>
			</tr>
			<s:iterator value="iiDTOList"/>
			<tr>
				<td><s:property value="itemId"/></td>
				<td><s:property value="itemName"/></td>
				<td><s:property value="itemPrice"/></td>
				<td><s:property value="itemStock"/></td>
				<td><s:property value="insertDate"/></td>
			</tr>
		</table>
		<s:form action="ItemDeleteConfirmAction">
			<s:hidden name="itemId" value="%{itemId}"/>
			<s:submit value="削除"/>
		</s:form>
		<div>
			<p>商品一覧画面にもどる<a href="<s:url action='ItemListAction'/>">こちら</a>
			<p>管理者画面にもどる<a href="<s:url action='AdminAction'/>">こちら</a>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>