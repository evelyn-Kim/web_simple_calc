<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>간단 계산기 화면</title>
</head>
<body>
	<h1>간단한 계산기</h1>
	<form action="action_calc">
		<input type="number" name="n1">
		<select name="op">
			<option>+</option>
			<option>-</option>
			<option>*</option>			
			<option>/</option>
		</select>
		<input type="number" name="n2">
		<input type="submit" name=" = ">
	</form>
</body>
</html>