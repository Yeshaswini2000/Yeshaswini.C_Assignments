<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/cars/updateCar/${car.id}" method="post">
		<input type="hidden" name="id" value="${car.id}">
		<table>
			<tr>
				<td>Make</td>
				<td><input type="text" name="make" value="${car.make}"></td>

				<td>Model</td>
				<td><input type="text" name="model" value="${car.model}"></td>

				<td>YearManufactured</td>
				<td><input type="text" name="yearManufactured"
					value="${car.yearManufactured}"></td>

				<td>Color</td>
				<td><input type="text" name="color" value="${car.color}"></td>

				<td>kms</td>
				<td><input type="text" name="kms" value="${car.kms}"></td>

				<td>Price</td>
				<td><input type="text" name="price" value="${car.price}"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Save" /></td>
				<td><input type="submit" name="submit" value="Cancel" /></td>
			</tr>
		</table>
	</form>

</body>
</html>