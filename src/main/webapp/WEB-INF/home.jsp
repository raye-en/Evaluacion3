<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page='templates/header.jsp'/>

<body>
	<jsp:include page='templates/navbar.jsp'/>
	<div class="container">
	<h1>Hola ${nombre_usuario} de id: ${usuario_id}</h1>
	<hr>
	
	</div>
	<jsp:include page='templates/footer.jsp'/>
</body>

</html>