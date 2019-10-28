<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemListDelete</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>ItemListDelete</p>
		</div>
		<s:if test="message == '削除できました'">
			<h3><s:property value="message"/></h3>

		<div id="text-right">
			<p>管理者画面へ戻る場合は<a href='<s:url action="AdminAction"/>'>こちら</a>
		</div>
		</s:if>
	</div>
	<div id="footer">
	</div>
</body>
</html>