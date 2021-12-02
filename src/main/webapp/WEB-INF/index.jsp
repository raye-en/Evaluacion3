<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<jsp:include page='templates/header.jsp'/>

<body>
<div class="container">
<h2>¡Bienvenidos!</h2>
 	<ul>
	 	<li><a href="/registro">Registrate</a></li>
	 	<li><a href="/login">Ingresa</a></li>
	 </ul>
</div>
<jsp:include page='templates/footer.jsp'/>
</body>
</html>