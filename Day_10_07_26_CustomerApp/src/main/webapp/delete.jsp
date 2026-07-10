<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
 
</head>
<body>
	<h1>Add Customer</h1>
 
	<form action="DeleteCustomerServlet">
		<div class="mb-3">
			<label for="cid" class="form-label">Customer Id</label>
			<input type="number" class="form-control" id="cid" name = "cid" value="<%=request.getParameter("cid")%>">
		</div>
		
	
		<button type="submit" class="btn btn-primary">Delete</button>
	</form>
 
</body>
</html>