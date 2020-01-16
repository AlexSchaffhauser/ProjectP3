<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Product</title>
</head>
<body>
	<header>
		<h1>Add a Product</h1>
	</header>
	<div align="center">
		<form:form action="addProduct" method="post" modelAttribute="product">
			<table>
				<form:hidden path="id" />

				<tr>
					<td>Product Name</td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td>Price</td>
					<td><form:input path="price" /></td>
				</tr>

				<tr>
					<td>Category</td>
					<td><form:input path="category" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Add Product"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>