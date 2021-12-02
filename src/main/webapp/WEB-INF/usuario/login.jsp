<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page='../templates/header.jsp'/>

<body>
	<div class="container">
	<h1>Login</h1>
			<hr>
	<h2>Ingreso al sistema</h2>
	
		<form action="/usuario/login" method="post">
			<label for="email">Email:</label>
			<input type="text" class="form-control" name="email" placeholder="Ingresa tu email">
			<br>
			<label for="password">Password:</label>
			<input type="password" class="form-control" name="password" placeholder="Ingresa tu password">
			<br>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> 
			<input type="submit" class="btn btn-primary" value= "Ingresar">
		</form>
	</div>
	<jsp:include page='../templates/footer.jsp'/>
</body>

</html>