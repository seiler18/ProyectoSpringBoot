<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Mantenimiento Usuario</title>
<script>

function submitFormAction(action,method){
	document.getElementById("frmAcciones").action = action;
	document.getElementById("frmAcciones").method = method;
	document.getElementById("frmAcciones").submit();
}



function deleteRow(){
	window.location.href = "/contactManager/deleteContact/?id=" +
	idSelect;
	}
</script>
</head>
<body>

<form:form id="frmAcciones" modelAttribute="contact">

<div>
<fieldset>
<legend>Mantenedor de Contactos</legend>
<table border="1">

<tr>
<td>Nombre: </td>
<td><form:input id="idNombre" path="nombre"/></td>
<td>Apellido Paterno: </td>
<td><form:input id="idApellidoPaterno" path="apellidoPaterno"/></td>
</tr>
<center>
<td>Apellido Materno: </td>
<td><form:input id="idApellidoMaterno" path="apellidoMaterno"/></td>
<tr>
<td>Dirección: </td>
<td><form:input  id="idDireccion" path="direccion"/></td>
<td>Teléfono: </td>
<td><form:input  id="idTelefono" path="telefono"/></td>
</tr>

<tr>
<td colspan="4">
<input type="button" value="Buscar" onclick="submitFormAction('/searchContact', 'get')"/>
<input type="button" value="Agregar" onclick="submitFormAction('/addContact', 'post')"/>
<input type="button" value="Eliminar" onclick="submitFormAction('/deleteContact', 'get')"/>
</td>
</tr>
</table>
</fieldset>
</div>
</form:form>
<br></br>
<center>
<legend>Lista de Contactos</legend>


<table id="tblContactos" style="width:70%" border="1"><h1>
<tr>
<td> </td>
<td>Id </td>
<td>Nombre </td>
<td>Apellido Paterno</td>
<td>Apellido Materno</td>
<td>Direccion</td>
<td>Telefono</td>
</tr>




<c:forEach items="${listaContactos}" var="contact">

<tr>
<td><input type="radio" id ="id" name="radio1" value=""checked></td>
<td><c:out value="${contact.getId()}"></c:out></td>
<td><c:out value="${contact.getNombre()}"></c:out></td>
<td><c:out value="${contact.getApellidoPaterno()}"></c:out></td>
<td><c:out value="${contact.getApellidoMaterno()}"></c:out></td>
<td><c:out value="${contact.getDireccion()}"></c:out></td>
<td><c:out value="${contact.getTelefono()}"></c:out></td>

</c:forEach></h1>
</table>
</center>

</body>
</html>
