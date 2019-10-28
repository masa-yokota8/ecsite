<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemList</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>商品一覧</p>
		</div>
		<div>
		<s:if test="itemInfoList == null">
				<h3>商品情報はありません。</h3>
		</s:if>
		<s:elseif test="message == null">
			<h3>商品情報</h3>
			<table border="1">
					<tr>
						<th>商品番号</th>
						<th>商品名</th>
						<th>値段</th>
						<th>在庫</th>
						<th>記入日</th>
						<th>詳細</th>
					</tr>
					<s:iterator value="itemInfoList">
					<tr>
						<td><s:property value="itemId" /></td>
						<td><s:property value="itemName" /></td>
						<td><s:property value="itemPrice" /></td>
						<td><s:property value="itemStock" /></td>
						<td><s:property value="insertDate" /></td>
						<td><a href="<s:url action='ItemDetailsAction'><s:param name='itemId' value='%{itemId}'/></s:url>">詳細</a></td>
					</tr>
					</s:iterator>
			</table>
			<s:form action="ItemListDeleteConfirmAction">
								<s:submit value="削除"/>
			</s:form>
		</s:elseif>
		管理者画面に戻る場合は<a href="<s:url action='AdminAction'/>">こちら</a>

		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>