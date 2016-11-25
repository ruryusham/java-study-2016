<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body>
<table border="1" style='border-spacing: 0;border-collapse: collapse;'>
	<tbody>
		<tr>
			<th>ユーザーID</th>
			<td><input type="text"/></td>
		</tr>
		<tr>
			<th>名前</th>
			<td><input type="text"/></td>
		</tr>
		<tr>
			<th>苗字</th>
			<td><input type="text"/></td>
		</tr>
		<tr>
			<th>年齢</th>
			<td><input type="number"/></td>
		</tr>
		<tr>
			<th>性別</th>
			<td>
				<input type="radio" id="male"/><label for="male">男</label>
				<input type="radio" id="female"/><label for="female">女</label>
			</td>
		</tr>
	</tbody>
</table>
<br>
<div>
	<button type="button" id="btnCreate">登録</button>
	<button type="button" id="btnReturn" onclick="location.href='user-list'">戻る</button>
</div>
</body>
</html>