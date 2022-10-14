<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/addresss/updateAddress/${address.id}" method="post">
		<input type="hidden" name="id" value="${address.id}">
		<table>
			<tr>
				<td>Street</td>
				<td><input type="text" name="street" value="${address.street}"></td>

				<td>City</td>
				<td><input type="text" name="city" value="${address.city}"></td>
				
				<td>State</td>
				<td><input type="text" name="state" value="${address.state}"></td>
				
				<td>ZipCode</td>
				<td><input type="text" name="zipCode" value="${address.zipCode}"></td>

				
			<tr>
				<td><input type="submit" name="submit" value="Save" /></td>
				<td><input type="submit" name="submit" value="Cancel" /></td>
			</tr>
		</table>
	</form>

</body>
</html>