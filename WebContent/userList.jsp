<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>UserList</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>UserLsit</p>
		</div>
		<div>
			<s:if test="UserList == null">
				<h3>ユーザー情報はありません。</h3>
			</s:if>
			<s:elseif test="message == null">
				<h3>ユーザー情報</h3>
				<table border="1">
					<tr>
						<th>ID番号</th>
						<th>ログインID</th>
						<th>パスワード</th>
						<th>ユーザー名</th>
						<th>登録日</th>
						<th></th>
					</tr>
					<s:iterator value="userList">
						<tr>
							<td><s:property value="user_Id" /></td>
							<td><s:property value="login_Id" /></td>
							<td><s:property value="login_Pass" /></td>
							<td><s:property value="user_Name" /></td>
							<td><s:property value="insert_Date" /></td>
							<td><a href="<s:url action='UserDetailsAction'><s:param name='login_Id' value='%{login_Id}'/></s:url>">詳細</a></td>
						</tr>
					</s:iterator>
				</table>
			</s:elseif>
				<s:if test="Admin==null">
					<s:form action="UserListDeleteConfirmAction">
					<s:submit value="削除" />
					</s:form>
				</s:if>


			管理者画面に戻る場合は<a href="<s:url action='AdminAction'/>">こちら</a>

		</div>
	</div>
	<div id="footer"></div>
</body>
</html>