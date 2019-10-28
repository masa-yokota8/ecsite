<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserListDeleteConfirm</title>
</head>
<body>
<h3>管理者以外を削除します。よろしいですか？</h3>
	<table>

			<tr>
				<td><s:form action="UserListDeleteCompleteAction"><s:submit value="OK"/></s:form></td>
				<td><s:form action="AdminAction"><s:submit value="キャンセル"/></s:form></td>
			</tr>

	</table>
</body>
</html>