<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserDeleteConfirm</title>
</head>
<body>
	<div id="header">
		</div>
		<div id="main">
			<div id="top">
				<p>UserDeleteComfirm</p>
			</div>
			<h3>ログインID[<s:property value="login_Id"/>]のユーザーを削除します。よろしいですか？</h3>
			<table>
				<tr>
					<td><s:form action="UserDeleteCompleteAction"><s:submit value="OK"/><s:hidden name="login_Id" value="%{login_Id}"/></s:form></td>
					<td><s:form action="UserDetailsAction"><s:submit value="キャンセル"/><s:hidden name="login_Id" value="%{login_Id}"/></s:form></td>
				</tr>
			</table>
		</div>
</body>
</html>