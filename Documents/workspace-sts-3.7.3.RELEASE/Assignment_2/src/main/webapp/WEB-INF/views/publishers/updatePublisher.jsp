<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/publishers/updatePublisher/${publisher.id}" method="post">
		<input type="hidden" name="id" value="${publisher.id}">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${publisher.name}"></td>

				<td>Address</td>
				<td><input type="text" name="address" value="${publisher.address}"></td>

				<td>Pnumber</td>
				<td><input type="text" name="pnumber" value="${publisher.pnumber}"></td>
			<tr>
				<td><input type="submit" name="submit" value="Save" /></td>
				<td><input type="submit" name="submit" value="Cancel" /></td>
			</tr>
		</table>
	</form>


</body>
</html>