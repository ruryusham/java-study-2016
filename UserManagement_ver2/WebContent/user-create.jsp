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
<form method="post">
<table border="1" style='border-spacing: 0;border-collapse: collapse;'>
	<tbody>
		<tr>
			<th>ユーザーID</th>
			<td><input type="text" name="UserId"/></td>
		</tr>
		<tr>
			<th>名前</th>
			<td><input type="text" name="FirstName"/></td>
		</tr>
		<tr>
			<th>苗字</th>
			<td><input type="text" name="LastName"/></td>
		</tr>
		<tr>
			<th>年齢</th>
			<td><input type="number" name="Age"/></td>
		</tr>
		<tr>
			<th>性別</th>
			<td>
				<input type="radio" id="male" name="Sex" value="0"/><label for="male">男</label>
				<input type="radio" id="female" name="Sex" value="1"/><label for="female">女</label>
			</td>
		</tr>
		<tr>
			<th>出身校</th>
			<td><input type="text" name="AlmaMater"/></td>
		</tr>
	</tbody>
</table>
<br>
<div>
	<button type="submit" id="btnCreate">登録</button>
	<button type="button" id="btnReturn" onclick="location.href='user-list'">戻る</button>
</div>
</form>
</body>
</html>