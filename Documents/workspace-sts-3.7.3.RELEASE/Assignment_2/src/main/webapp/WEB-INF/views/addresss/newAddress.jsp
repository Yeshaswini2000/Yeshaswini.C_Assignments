<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="newAddress" method="post">
		<table>
			<tr>
				<td>Street</td>
				<td><input type="text" name="street"></td>

				<td>City</td>
				<td><input type="text" name="city"></td>
				
				<td>State</td>
				<td><input type="text" name="state"></td>
				
				<td>ZipCode</td>
				<td><input type="text" name="zipCode"></td>
				
				
				
				

				
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Save" /></td>
				<td><input type="submit" name="submit" value="Cancel" /></td>
			</tr>
		</table>
	</form>

</body>
</html>