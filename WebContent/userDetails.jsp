<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>詳細情報</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>詳細情報</p>
		</div>
		<h3>詳細情報</h3>
		<table border="1">
			<tr>
				<th>ID番号</th>
				<th>ログインID</th>
				<th>パスワード</th>
				<th>ユーザー名</th>
				<th>登録日</th>
			</tr>

			<s:iterator value="uiDTOList">
			<tr>
				<td><s:property value="user_Id"/></td>
				<td><s:property value="login_Id"/></td>
				<td><s:property value="login_Pass"/></td>
				<td><s:property value="user_Name"/></td>
				<td><s:property value="insert_Date"/></td>


			</tr>
			</s:iterator>
		</table>
		<s:if test="admin_Flg == null">
			<s:form action="UserDeleteConfirmAction">
				<s:hidden name="login_Id" value="%{login_Id}"/>
				<s:submit value="削除" escape="false"/>
			</s:form>
		</s:if>
		<div>
			<p>ユーザー一覧画面にもどる<a href="<s:url action='UserListAction'/>">こちら</a>
			<p>管理者画面にもどる<a href="<s:url action='AdminAction'/>">こちら</a>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>