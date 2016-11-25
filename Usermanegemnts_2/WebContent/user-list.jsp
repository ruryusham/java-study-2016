<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="usermanegement_2.User"%>
<%
@SuppressWarnings("unchecked")
List<User> users = (List<User>) request.getAttribute("users");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="">
<link rel="shortcut icon" href="">
</head>
<body>
<table border = "1"style='border-spacing: 0;border-collapse: collapse;'>
	<thead>
		<tr>
			<th>ユーザID</th>
			<th>苗字</th>
			<th>名前</th>
			<th>年齢</th>
			<th>性別</th>

		</tr>
	</thead>
	<tbody>
	<% for (int i = 0; i < users.size(); i++)  {%>

		<tr>
			<td><%= users.get(i).getUserid() %></td>
			<td><%= users.get(i).getFirstname() %></td>
			<td><%= users.get(i).getLastname() %></td>
			<td><%= users.get(i).getAge() %></td>
			<td><%= users.get(i).getSex() %></td>
			<td><button type="button" name="削除" value="aaa">
			<font size="2" color="#000000">削除</font>
			</button>
			</td>
		</tr>

	<%} %>
	</tbody>
</table>
</body>
</html>