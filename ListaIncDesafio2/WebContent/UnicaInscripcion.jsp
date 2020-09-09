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
<meta charset="ISO-8859-1">
<title>Inscripcion Exitosa</title>

<% //capturar la informacion



List<InscripcionDTO> idInsc;
idInsc = (List)request.getAttribute("idInsc");

int idInsc1 = (Integer)request.getAttribute("idInsc1");

List<FormaDePagoDTO> formaPago;
formaPago =(List)request.getAttribute("formaPago");
%>
</head>

<body>



<h1>Felicidades se logro inscribir con los siguientes datos :  </h1>
<%for(InscripcionDTO dto : idInsc) { %>
<p>Nombre Alumno : <%=dto.getNombre() %><br>
   Telefono Contacto : <%=dto.getCelular() %><br>
   Id Curso : <%=dto.getIdCurso() %><br>
   Id Pago : <%=dto.getIdFormaDePago() %><br>
   
</p>
<% } %>





<p>Presione el boton para regresar al inicio</p>
<form action="/ListaIncDesafio2/preInscripcion" method="get"> 
<button class="btn btn-info submit">Volver al inicio</button>
</form>
<form action="/ListaIncDesafio2/PreListarInscripciones" method="get"> 
<button class="btn btn-info submit">Ir a la lista de Inscritos</button>
</form>
</body>
</html>