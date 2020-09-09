<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%	
	//------------DATOS EN DURO, PARA TRABAJARLOS DESPUES
	
	String nombre = (String)request.getAttribute("nombre");
	String empresa = (String)request.getAttribute("empresa");
	String rut = (String)request.getAttribute("rut");
	String direccion = (String)request.getAttribute("direccion");
	String ciudad = (String)request.getAttribute("ciudad");
	String pais = (String)request.getAttribute("pais");
	
 	int valvulasCant = (Integer)request.getAttribute("valvulas");
 	int turboCant = (Integer)request.getAttribute("turbo");
 	int frenosCant = (Integer)request.getAttribute("frenos");
 	int refriCant = (Integer)request.getAttribute("refri");
 	int plumasCant = (Integer)request.getAttribute("plumas");
	
	int valvulasTotal = (Integer)request.getAttribute("totalValvulas");
	int turboTotal = (Integer)request.getAttribute("totalTurbo");
	int frenosTotal = (Integer)request.getAttribute("totalFrenos");
	int refriTotal = (Integer)request.getAttribute("totalRefri");
	int plumasTotal = (Integer)request.getAttribute("totalPlumas");
	
	int valorNetoTotal = valvulasTotal + turboTotal + frenosTotal + refriTotal + plumasTotal;
	int total = (int)(valorNetoTotal - (valorNetoTotal * 0.1)); 
	
	//------------DATOS EN DURO, PARA TRABAJARLOS DESPUES
	%>
	
	
	
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<title>Factura</title>
<script
	src="
https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js
"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<link
	href="
https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css
"
	rel="stylesheet"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-body p-0">
                    <div class="row p-5">
                        <div class="col-md-6">
                        <h1>FACTURA CLIENTE</h1>
                        </div>
				
                        <div class="col-md-6 text-right">
							
							</div>
                    </div>

                    <hr class="my-5">

                    <div class="row pb-5 p-5">
                        <div class="col-md-6">
                            <p class="font-weight-bold mb-4">Informacion de cliente</p>
                            <p class="mb-1"> <%=nombre%></p>
                            <p class="mb-1"><%=empresa%></p>
                            <p class="mb-1"><%=rut%></p>
                            <p class="mb-1"><%=direccion%></p>
                            <p class="mb-1"><%=ciudad.toUpperCase()%>, <%=pais%></p>
                             <p class="mb-1"><%=pais%></p>
                            <p></p>
                            <p class="mb-1"></p>
                            <p class="mb-1"></p>
                        </div>

                        <div class="col-md-6 text-right">
                            <p class="font-weight-bold mb-4">Detalles de pago</p>
                            <p class="mb-1"><span class="text-muted">NUM FACTURA: </span> 1425782</p>
                            <p class="mb-1"><span class="text-muted">ID FACTURA: </span> 10253642</p>
                            <p class="mb-1"><span class="text-muted">TIPO PAGO: </span> Dinero</p>
                            <p class="mb-1"><span class="text-muted">EMPRESA: </span> Importadora</p>
                        </div>
                    </div>
<
                    <div class="row p-5">
                        <div class="col-md-12">
                            <table class="table table-striped table-dark">
									<thead>
										<tr>
											<th scope="col">ITEM</th>
											<th scope="col">DESCRIPCION</th>
											<th scope="col">VALOR UNIDAD</th>
											<th scope="col">CANTIDAD</th>
											<th scope="col">VALOR TOTAL</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>Valvulas Titanio</td>
											<td>Valvulas de carrera</td>
											<td>$120.000</td>
										    <td><%=valvulasCant%></td>
                                            <!-- VALOR TOTAL -->
                                            <td>$<%=valvulasTotal%></td>
											
										</tr>
										<tr>
											<td>Turbo Full Carrera</td>
											<td>Turbo de competicion multimarca</td>
											<td>$1.700.000</td>
											 <td><%=turboCant%></td>
                                            <td>$<%=turboTotal%></td>
										</tr>
										<tr>
											<td>Kit de Freno Competicion</td>
											<td>Juego de discos, balatas, caliper de competicion</td>
											<td>$760.000</td>
											 <td><%=frenosCant%></td>
                                            <td>$<%=frenosTotal%></td>
										</tr>
										<tr>
											<td>Sistema de refrigeracion</td>
											<td>Sistema enfriamiento motor Carrera</td>
											<td>$2.300.000</td>
											<td><%=refriCant%></td>
                                            <td>$<%=refriTotal%></td>
										</tr>
										<tr>
											<td>Plumillas Limpiaparabrisas standar</td>
											<td>plumillas para la lluvia</td>
											<td>$10.000</td>
										 <td><%=plumasCant%></td>
                                            <td>$<%=plumasTotal%></td>
										</tr>
									</tbody>
								</table>
                        </div>
                    </div>

                    <div class="d-flex flex-row-reverse bg-dark text-white py-2">
                        <div class="py-5 px-5 text-center">
                            <div class="mb-2">VALOR TOTAL</div>
                         	<div class="h2 font-weight-light">
                            	 $<%=total%>
                            </div>
                        </div>

                        <div class="py-5 px-5 text-center">
                            <div class="mb-2">Descuento</div>
                            <div class="h2 font-weight-light">10%</div>
                        </div>

                        <div class="py-5 px-5 text-center">
                            <div class="mb-2">VALOR TOTAL NETO</div>
                            <div class="h2 font-weight-light">
                            	$<%=valorNetoTotal%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="text-light mt-5 mb-5 text-center small">by : <a class="text-light" target="_blank" href="
http://totoprayogo.com
">totoprayogo.com</a></div>

</div>

</body>
</html>