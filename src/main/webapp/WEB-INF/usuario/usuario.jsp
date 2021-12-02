<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Registro de usuarios:</title>
</head>
<jsp:include page='../templates/navbar.jsp'/>
<body>
	<div class="container">
	<h1></h1>
			<hr>
	<h2>Crear usuarios</h2>
		<form:form method="post" action="/usuario/registrar" modelAttribute="usuario">
			<input type="hidden" name="_method" value="put">
			<form:label path="nombre" class="col-sm-2 col-form-label">Nombre:</form:label>
			<form:input type="text" path="nombre" class="form-control"/>
			<br>
			<form:label path="email" class="col-sm-2 col-form-label">Email:</form:label>
			<form:input type="text" path="email" class="form-control"/>
			<br>
			<form:label path="password" class="col-sm-2 col-form-label">Password:</form:label>
			<form:input type="password" path="password" class="form-control"/>
			<br>			
			<a href="/usuario" class="btn btn-success" role="button" data-bs-toggle="button">Limpiar</a>
			<input type="submit" class="btn btn-primary" value="Crear usuario">

		</form:form>
	
		<br>
		<hr>
		<h2>Usuarios existentes</h2>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Email</th>
		      <th scope="col-2">Acciones</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaUsuarios}" var="usuario" >
			    <tr>
			      <th scope="row">${usuario.getId()}</th>
			      <td>${usuario.getNombre()}</td>
			      <td>${usuario.getEmail()}</td>
			       <td>
			        <a href="/usuario/${usuario.getId()}/editar" class="btn btn-primary" role="button" data-bs-toggle="button">Editar</a>
			      
			      </td>
			      <td>
				      <form action="/usuario/eliminar" method="get">
				      	<input type="hidden" name="id" value="${usuario.getId()}">
				      	<input class="btn btn-danger" type="submit" value="Eliminar">
				      </form>
			      </td>
			    </tr>
		    </c:forEach>
		  </tbody>
		</table>
	</div>
</body>

</html>