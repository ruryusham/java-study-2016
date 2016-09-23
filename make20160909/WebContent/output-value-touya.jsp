<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta charset="utf-8">
<title>HTML Controls</title>
<style type="text/css">
table, td, th {
	border: 1px black solid;
	border-collapse: collapse;
	padding: 4px;
}
label.caution {
	color: red;
}
</style>
</head>
<body>
<table>
	<tr>
		<th>コントロール名</th>
		<th>入力値</th>
	</tr>
	<tr>
		<td>テキストボックス</td>
		<td><%= request.getParameter("text") %></td>
	</tr>
	<tr>
		<td>チェックボックス</td>
		<td>
			<% String[] sports = request.getParameterValues("sports"); %>
			<%
				if (sports != null) {
					for (int i = 0; i < sports.length; i++) {
			%>
						<%= sports[i] %><br>
			<%
					}
				}
			%>
		</td>
	</tr>
	<tr>
		<td>ラジオボタン</td>
		<td><%= request.getParameter("fruit") %></td>
	</tr>
	<tr>
		<td>プルダウン</td>
		<td><%= request.getParameter("week") %></td>
	</tr>
	<tr>
		<td>ファイル（※余力のある人はアップロードをしてみよう！）</td>
		<td></td>
	</tr>
	<tr>
		<td>日付<label class="caution">（※HTML5）</label></td>
		<td><%= request.getParameter("date") %></td>
	</tr>
	<tr>
		<td>スライダー<label class="caution">（※HTML5）</label></td>
		<td><%= request.getParameter("slider") %></td>
	</tr>
	<tr>
		<td>数値<label class="caution">（※HTML5）</label></td>
		<td><%= request.getParameter("num") %></td>
	</tr>
	<tr>
		<td>色<label class="caution">（※HTML5）</label></td>
		<td><%= request.getParameter("color") %></td>
	</tr>
</table>
</body>
</html>