<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="cl.desafiolatam.sesion.usuario.model.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Bienvenidos Usuario : 
<%= request.getSession().getAttribute("usuario") %></br>

Nombre : <%=request.getSession().getAttribute("nombre") %></br>
Apellido : <%=request.getSession().getAttribute("apellido") %></br>
email : <%=request.getSession().getAttribute("email") %></br>
edad : <%=request.getSession().getAttribute("edad") %></br>

sus datos por objeto son : </br>

<% Usuario usuario = (Usuario)request.getSession().getAttribute("objeto"); %>
Nombre del usuario : <%= usuario.getNombre() %></br>
Apellido del usuario : <%=usuario.getApellido() %></br>
Edad del Usuario : <%=usuario.getEdad() %>



</body>
</html>