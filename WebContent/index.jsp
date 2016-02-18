<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Text Translator</title>
</head>
<body>
	<form action="Translate" method="post">
		<table>
			<tr>
				<td>From English to 
				<select name="outputLanguage">
						<option value="French">French</option>
						<option value="Dutch">Dutch</option>
						<option value="German">German</option>
						<option value="Spanish">Spanish</option>
				</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td><textarea rows="12" cols="150" name="text"></textarea></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Translate and Speech"/>
				</td>
			</tr>
		</table>


	</form>
</body>
</html>