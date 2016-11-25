<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="bean.User"%>
<%
@SuppressWarnings("unchecked")
List<User> users = (List<User>) request.getAttribute("users");
%>
<!DOCTYPE html>
<html>
<head>
<meta htto-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta charset= "utf-8">
<meta name= "description" content="">
<meta name= "author" content="">
<meta name= "viewport" content= "width=device-width, initial-scale=1">
<link rel= "stylesheet" href="">
<link rel= "shortcut icon" href= "">
</head>
<body>
<table border= "1" style= 'border-spacing: 0;border-collapse: collapse;'>
	<thead>
		<tr>
			<th>名前</th>
			<th>苗字</th>
			<th>年齢</th>
			<th>性別</th>
		</tr>tr>
	</thead>
	<tbody>
	<% for (int i = 0; i < users.size(); i++ ) { %>
		<tr>
			<td><%= users.get(i).getFirstName() %></td>
			<td><%= users.get(i).getLastName() %></td>
			<td><%= users.get(i).getAge() %></td>
			<td><%= users.get(i).getSex() %></td>
		</tr>
	<% } %>
	</tbody>
</table>
</body>
</html>