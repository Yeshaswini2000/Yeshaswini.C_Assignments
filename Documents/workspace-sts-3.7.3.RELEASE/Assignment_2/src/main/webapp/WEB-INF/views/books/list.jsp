<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<%@ taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="w-100" align="center">
	<h2>List of Books</h2>

	<table class="table  table-dark table-striped">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>whenPublished</td>
				<td>Editions</td>
				<td>ISBN</td>
				<td>Price</td>
				<td>Published_year</td>
				<td>Publiished_ID</td>
			</tr>
		</thead>

		<tbody>
			<b:forEach items="${books}" var="book">
				<tr>
					<td><a href="updateBook/${book.id }">${book.id }</a></td>
					<td>${book.name}</td>
					<td>${book.whenPublished}</td>
					<td>${handbook.editions}</td>
					<td>${handbook.isbn}</td>
					<td>${handbook.price}</td>
					<td>${handbook.published_year}</td>
					<td>${publisher.id}</td>
					
					
				</tr>
			</b:forEach>

		</tbody>

	</table>
</div>

</body>
</html>