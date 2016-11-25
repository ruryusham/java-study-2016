<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="bean.User"%>
<%
@SuppressWarnings("unchecked")
List<User> users = (List<User>) session.getAttribute("users");
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
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<link rel="stylesheet" href="">
<link rel="shortcut icon" href="">
</head>
<script>
$(document).ready(function() {
	$(".btnDelete").click(function() {
		alert($(this).data("id"));
	})
})
</script>
<body>
<div>
	<button type="button" onclick="location.href='user-create'">登録</button>
</div>
<br>
<table border="1" style='border-spacing: 0;border-collapse: collapse;'>
	<thead>
		<tr>
			<th>ユーザーID</th>
			<th>名前</th>
			<th>苗字</th>
			<th>年齢</th>
			<th>性別</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<% for (int i = 0; i < users.size(); i++) { %>
		<tr>
			<td><%= users.get(i).getUserId() %></td>
			<td><%= users.get(i).getFirstName() %></td>
			<td><%= users.get(i).getLastName() %></td>
			<td><%= users.get(i).getAge() %></td>
			<td><%= users.get(i).getSex() %></td>
			<td><button type="button" class="btnDelete" data-id="<%= users.get(i).getUserId() %>">削除</button></td>
		</tr>
	<% } %>
	</tbody>
</table>
</body>
</html>