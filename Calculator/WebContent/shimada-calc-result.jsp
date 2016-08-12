<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>四則演算の結果</title>
</head>
<body>
<h1>四則演算の結果表示！</h1>
<table border="1">
	<tr>
		<td>和</td>
		<td><%= request.getAttribute("wa") %></td>
	</tr>
	<tr>
		<td>差</td>
		<td><%= request.getAttribute("sa") %></td>
	</tr>
	<tr>
		<td>積</td>
		<td></td>
	</tr>
	<tr>
		<td>商</td>
		<td></td>
	</tr>
</table>
</body>
</html>