<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="cl.desafiolatam.login.ProcesaLogin"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuario Logeado</title>
</head>
<body>
Has Ingresado como  <%=request.getParameter("usuario") %> 
<br></br>
<form method="get" action="/ProyectoFactura/Factura">

	<div class="row">
		   <div class="col-md-12 login-from-row">
		      <button class="btn btn-info submit">Ir al desafio calculo de 10%</button>
		   </div>
</body>
</html>