<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="newCar" method="post">
		<table>
			<tr>
				<td>Make</td>
				<td><input type="text" name="make"></td>

				<td>Model</td>
				<td><input type="text" name="model"></td>
				
				<td>YearManufactured</td>
				<td><input type="text" name="yearManufactured"></td>

				<td>Color</td>
				<td><input type="text" name="color"></td>

				<td>kms</td>
				<td><input type="text" name="kms"></td>

				<td>Price</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Save" /></td>
				<td><input type="submit" name="submit" value="Cancel" /></td>
			</tr>
		</table>
	</form>
</body>
</html>