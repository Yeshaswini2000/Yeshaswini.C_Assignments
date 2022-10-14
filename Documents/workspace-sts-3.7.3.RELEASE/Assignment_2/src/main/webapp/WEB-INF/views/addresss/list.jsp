<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="w-100" align="center">
	<h2>List of AuthorsAddress</h2>

	<table class="table  table-dark table-striped">
		<thead>
			<tr>
				<td>Id</td>
				<td>Street</td>
				<td>City</td>
				<td>State</td>
				<td>ZipCode</td>
			
			</tr>
		</thead>

		<tbody>
			<b:forEach items="${addresss}" var="address">
				<tr>
					<td><a href="updateAddress/${address.id}">${address.id}</a></td>
					<td>${address.street}</td>
					<td>${address.state}</td>
					<td>${address.city}</td>
					<td>${address.zipCode}</td>
					
					
				</tr>
			</b:forEach>

		</tbody>

	</table>
</div>

</body>
</html>