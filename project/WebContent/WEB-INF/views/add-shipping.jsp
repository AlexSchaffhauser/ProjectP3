<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Shipping</title>
</head>
<body>
	<header>
		<h1 align="center">Add Shipping Details</h1>
	</header>
	<div align="center">
		<form:form action="updateShipping" method="post" 
			modelAttribute="shippedproduct">
			<table>
					<form:hidden path="id" />
					<form:hidden path="name" />
					<form:hidden path="price" />
					<form:hidden path="category" />
				<tr>
					<td>Address Line</td>
					<td><form:input path="shipping.address" /></td>
				</tr>
				<tr>
					<td>ZIP</td>
					<td><form:input path="shipping.zip" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><form:input path="shipping.country" /></td>
				</tr>
				<tr>

				<tr>
					<td colspan="2"><input type="submit" value="Update Shipping"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>