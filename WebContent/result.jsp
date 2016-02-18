<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Translated Text</title>
</head>
<body>
	<table>
		<tr>
			<td>Translated from English to ${outputLanguage}</td>
			<td></td>
		</tr>
		<tr>
			<td><textarea disabled rows="12" cols="150" name="text">${translatedText}</textarea>
			<td>
		</tr>
		<tr>
			<td>
				<button type="button" name="back" onclick="history.back()">back</button>
			</td>
		</tr>
	</table>

</body>
</html>