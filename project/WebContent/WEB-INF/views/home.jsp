<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<header>
		<h1 align="center">Shipping Organizer</h1>
	</header>
	<div align="center">
		<h2>Your Products</h2>
		<a href="addproduct">ADD PRODUCT</a>
		<table border="1">
			<tr>
				<th>Product Name</th>
				<th>Price</th>
				<th>Category</th>
			</tr>

			<c:forEach var="product" items="${prodList}">
				<tr>
					<td><c:out value="${product.name}"></c:out></td>
					<td>$<c:out value="${product.price}"></c:out></td>
					<td><c:out value="${product.category}"></c:out></td>
					<td><a href="shipproduct?productId=${product.id}">SHIP</a></td>
					<td><a href="deleteproduct?productId=${product.id}">DELETE</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
	<div align="center">
		<h2>Shipped Products</h2>
		<table border="1">
			<tr>
				<th>Product Name</th>
				<th>Price</th>
				<th>Category</th>
				<th>Address</th>
				<th>ZIP</th>
				<th>Country</th>
			</tr>

			<c:forEach var="product" items="${shipList}">
				<tr>
					<td><c:out value="${product.name}"></c:out></td>
					<td>$<c:out value="${product.price}"></c:out></td>
					<td><c:out value="${product.category}"></c:out></td>
					<td><c:out value="${product.shipping.address}"></c:out></td>
					<td><c:out value="${product.shipping.zip}"></c:out></td>
					<td><c:out value="${product.shipping.country}"></c:out></td>
					<td><a href="deleteproduct?productId=${product.id}">DELETE</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>