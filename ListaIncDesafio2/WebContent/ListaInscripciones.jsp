<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.desafiolatam.entidades.InscripcionDTO" %>
   <%@ page import="com.desafiolatam.entidades.FormaDePagoDTO" %>
<%@ page import="com.desafiolatam.entidades.InscripcionDTO" %>
<%@ page import="com.desafiolatam.daos.FormaDePagoDAO" %>
<%@ page import="java.util.List"%>
   <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Inscripcion</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js">
</script>
<script
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js">
</script>
</head>


<% //capturar la informacion



List<InscripcionDTO> idInsc = new ArrayList();
idInsc = (List)request.getAttribute("idInsc");
%>


<body>
<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="preInscripcion">Mantenedor De Cursos</a>
</div>
<ul class="nav navbar-nav">
<li class="active"><a href="preInscripcion">Home</a></li>
<li><a href="preInscripcion">Inscribir Cursos</a></li>
</ul>
</div>
</nav>



<div class="container">
	<p>Listado de Inscripciones</p>
	
	<table class="table table-dark">
  <thead>
 
    <tr>
      <th scope="col">Id Inscripcion</th>
      <th scope="col">Nombre</th>
      <th scope="col">Telefono</th>
      <th scope="col">Id Curso</th>
      <th scope="col">Nombre Curso</th>
      <th scope="col">Id Forma de Pago</th>
      <th scope="col">Nombre Forma de Pago</th>
    </tr>
   
  </thead>
  <tbody>
   <% for(InscripcionDTO dto : idInsc) 
	  
   { %>
  
    <tr>
      <td scope="row"><%=dto.getIdInsc() %></td>
      <td><%=dto.getNombre() %></td>
      <td><%=dto.getCelular() %></td>
      <td><%=dto.getIdCurso() %></td>
      <td><%=dto.getIdCurso() %></td><!nombre curso!>
      <td><%=dto.getIdFormaDePago()%></td>
      <td><%=dto.getIdFormaDePago()%></td><!nombre forma de pago!>
      
      
    </tr>
    
     <% } %>
     

     
  </tbody>
</table>

	
</div>
<p>Presione el boton para regresar al inicio</p>
<form action="/ListaIncDesafio2/preInscripcion" method="get"> 
<button class="btn btn-info submit">Volver al inicio</button>
</body>
</html>