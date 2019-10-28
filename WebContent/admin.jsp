<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>管理者画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
	<h1>管理者画面</h1>
		<div class="syouhin">
			<table>
				<tr>
					<td><h2>商品</h2><td>
				<tr>
				<tr>
					<td><s:form action="ItemCreateAction">
						<s:submit value="新規登録"/><td></s:form>
				</tr>
				<tr>
					<td><s:form action="ItemListAction">
						<s:submit value="一覧"/><td></s:form>
				</tr>
			</table>
		</div>
		<br>
		<div class="user">
			<table>
				<tr>
					<td><h2>ユーザー</h2><td>
				<tr>
				<tr>
					<td><s:form action="UserCreateAction">
						<s:submit value="新規登録"/><td></s:form>
				</tr>
				<tr>
					<td><s:form action="UserListAction">
						<s:submit value="一覧"/><td></s:form>
				</tr>
			</table>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>