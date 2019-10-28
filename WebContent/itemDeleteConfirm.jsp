<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemDeleteConfirm</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>ItemDeleteComfirm</p>
		</div>
		<h3>商品ID[<s:property value="itemId"/>]の商品を削除します。よろしいですか？</h3>
		<table>
			<tr>
				<td><s:form action="ItemDeleteCompleteAction"><s:submit value="OK"/><s:hidden name="itemId" value="%{itemId}"/></s:form></td>
				<td><s:form action="ItemDetailsAction"><s:submit value="キャンセル"/><s:hidden name="itemId" value="%{itemId}"/></</s:form></td>
			</tr>
		</table>
		</div>
</body>
</html>