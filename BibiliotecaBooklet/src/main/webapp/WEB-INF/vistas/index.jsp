<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Biblioteca</title>
<script>
// function muestra_oculta(id){
// 	if (document.getElementById){ //se obtiene el id
// 	var el = document.getElementById(id); //se define la variable "el" igual a nuestro div
// 	el.style.display = (el.style.display == 'none') ? 'block' : 'none'; //damos un atributo display:none que oculta el div
// 	}
// 	}
// 	window.onload = function(){/*hace que se cargue la función lo que predetermina que div estará oculto hasta llamar a la función nuevamente*/
// 	muestra_oculta('contenido');/* "contenido_a_mostrar" es el nombre que le dimos al DIV */
// 	}

	//$(document).ready(function muestra_oculta();
// 	function setIdSelect(id){
// idSelect = id;
// }

	
	
function submitFormAction(action,method){
	document.getElementById("frmAcciones").action = action;
	document.getElementById("frmAcciones").method = method;
	document.getElementById("frmAcciones").submit();
	
}



</script>
</head>
<body>
<fieldset>
<center>
<form:form id="frmAcciones" modelAttribute="libro">


<div style="background-color:#cccccc; overflow: auto; font-weight: bold;">
<legend><h1>Biblioteca Booklet</h1></legend>

<table border="2">

<tr>
<td>Año de Publicación : </td>
<td><form:input id="idAnio" path="anio" value="Año del libro"/></td>
<td>Nombre del Libro : </td>
<td><form:input id="idTitulo" path="titulo"/></td>
</tr>
<tr>
<td>Autor del libro </td>
<td><form:input id="idAutor" path="autor"/></td>
<td>Imprenta: </td>
<td><form:input id="idImprenta" path="imprenta"/></td>
</tr>

<tr>
<td colspan="4"><center>
Disponibilidad:
 <form:select  path="disponibilidad">
    <form:option value="false"> No disponible</form:option>
    <form:option value="true">Disponible</form:option>
    </form:select>
</tr>


<tr>
<td colspan="4"><center>

<input type="button" value="Historial de Libros" onclick="submitFormAction('/listarLibros', 'post');muestra_oculta('contenido');"/>									
<input type="button" value="Agregar" onclick="submitFormAction('/agregarLibro', 'post')"/>
<input type="button" value="Eliminar" onclick="submitFormAction('/borrarLibro', 'get')"/>
</center></td>
</tr>

</table>

</div>
</form:form>
</center>
<br></br>


		<div id="contenido">
			<fieldset>
				<div style="background-color: #cccccc; overflow: auto;">
					<center>
						<img src="https://i.ibb.co/nrBNzh7/libro.png">





						<table id="TableLibros" style="width: 70%" border="2">
							<h1>
								Lista de Libros disponibles
								<tr style="font-weight: bold;">
									<td></td>
									<td>Id libro</td>
									<td>Año publicación</td>
									<td>Titulo del libro</td>
									<td>Autor</td>
									<td>Imprenta</td>
									<td>Disponibilidad</td>

								</tr>

								<c:forEach items="${listaLibros}" var="libro">

									<tr>
										<td><input type="radio" id="id" name="radio1" value=""
											checked></td>

										<td><c:out value="${libro.getId_libro()}"></c:out></td>
										<td><c:out value="${libro.getAnio()}"></c:out></td>
										<td><c:out value="${libro.getTitulo()}"></c:out></td>
										<td><c:out value="${libro.getAutor()}"></c:out></td>
										<td><c:out value="${libro.getImprenta()}"></c:out></td>

										<td><c:if test="${libro.isDisponibilidad() != false}">
												<font color="green">Disponible </font>
											</c:if> <c:if test="${libro.isDisponibilidad() != true}">
												<font color="red">No Disponible</font>
											</c:if></td>
								</c:forEach>
							</h1>

						</table>
					</center>
				</div>
			</fieldset>
		</div>
		
		
		</body>
</html>

