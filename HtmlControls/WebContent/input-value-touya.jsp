<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<h1>HTMLの各種コントロール</h1>
<h3>別の画面へ入力した値を渡してみよう！</h3>
<form action="output-value-touya" method="post">
<table>
	<tr>
		<th>コントロール名</th>
		<th>コントロール</th>
	</tr>
	<tr>
		<td>テキストボックス</td>
		<td><input type="text" name="text"/></td>
	</tr>
	<tr>
		<td>チェックボックス</td>
		<td>
			<input type="checkbox" id="c1" name="sports" value="Basketball"><label for="c1">Basketball</label>
			<input type="checkbox" id="c2" name="sports" value="Baseball"><label for="c2">Baseball</label>
			<input type="checkbox" id="c3" name="sports" value="Football"><label for="c3">Football</label>
		</td>
	</tr>
	<tr>
		<td>ラジオボタン</td>
		<td>
			<input type="radio" id="r1" name="fruit" value="1"><label for="r1">Orange</label>
			<input type="radio" id="r2" name="fruit" value="2"><label for="r2">Apple</label>
			<input type="radio" id="r3" name="fruit" value="3"><label for="r3">Banana</label>
		</td>
	</tr>
	<tr>
		<td>プルダウン</td>
		<td>
			<select name="week">
				<option value="1">Sunday</option>
				<option value="2">Monday</option>
				<option value="3">Tuesday</option>
				<option value="4">Wedsnesday</option>
				<option value="5">Thursday</option>
				<option value="6">Friday</option>
				<option value="7">Satuday</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>ファイル（※余力のある人はアップロードをしてみよう！）</td>
		<td><input type="file" name="file"/></td>
	</tr>
	<tr>
		<td>日付<label class="caution">（※HTML5）</label></td>
		<td><input type="date" name="date"/></td>
	</tr>
	<tr>
		<td>スライダー<label class="caution">（※HTML5）</label></td>
		<td><input type="range" name="slider"></td>
	</tr>
	<tr>
		<td>数値<label class="caution">（※HTML5）</label></td>
		<td><input type="number" name="num"></td>
	</tr>
	<tr>
		<td>色<label class="caution">（※HTML5）</label></td>
		<td><input type="color" name="color"></td>
	</tr>
</table>
<input type="submit"/>
</form>
</body>
</html>