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
    <title>Categoria:</title>
</head>
<jsp:include page='../templates/navbar.jsp'/>
<body>
	<div class="container">
	<h1></h1>
			<hr>
	<h2>Crear categoria</h2>
		<form:form method="post" action="/categoria/login" modelAttribute="categoria">
			<input type="hidden" name="_method" value="put">
			<form:label path="nombre" class="col-sm-2 col-form-label">Nombre:</form:label>
			<form:input type="text" path="nombre" class="form-control"/>
			<br>
			<form:label path="descripcion" class="col-sm-2 col-form-label">Descripcion:</form:label>
			<form:input type="text" path="descripcion" class="form-control"/>
			<br>
			
			<a href="/producto" class="btn btn-success" role="button" data-bs-toggle="button">Limpiar</a>
			<input type="submit" class="btn btn-primary" value="Crear categoria">

		</form:form>
	
		<br>
		<hr>
		<h2>Categorias existentes</h2>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Descripcion</th>
		      <th scope="col">Acciones</th>
		      </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaCategorias}" var="categoria" >
			    <tr>
			      <th scope="row">${categoria.getId()}</th>
			      <td>${categoria.getNombre()}</td>
			      <td>${categoria.getDescripcion()}</td>
			      <td>
			        <a href="/categoria/${categoria.getId()}/editar" class="btn btn-primary" role="button" data-bs-toggle="button">Editar</a>
			      
			      </td>
			      <td>
				      <form action="/categoria/eliminar" method="get">
				      	<input type="hidden" name="id" value="${categoria.getId()}">
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