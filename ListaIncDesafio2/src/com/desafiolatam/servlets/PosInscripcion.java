package com.desafiolatam.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//intentando obtener forma de pago import com.desafiolatam.entidades.FormaDePagoDTO;
import com.desafiolatam.entidades.InscripcionDTO;
import com.desafiolatam.facade.Facade;
@WebServlet("/posInscripcion")
public class PosInscripcion extends HttpServlet
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request
                       ,HttpServletResponse response)
                      throws ServletException, IOException
   {
      // obtengo los datos del formulario
      String nombre = request.getParameter("nombre");
      String celular = request.getParameter("telefono");
    //intentando obtener forma de pago String descripcion=request.getParameter("descripcion");
       // recordemos que los parametros siempre son cadenas
      int idCurso = Integer.parseInt(request.getParameter("idCurso"));
      int idFormaDePago = Integer.parseInt(request.getParameter("idFormaPago"));
      
       // instancio el DTO y le asigno los datos
      InscripcionDTO dto = new InscripcionDTO();
      dto.setNombre(nombre);
      dto.setCelular(celular);
      dto.setIdCurso(idCurso);
      dto.setIdFormaDePago(idFormaDePago);
      
      //probando un segundo dto a ver si me trae el valor forma de pago
//      FormaDePagoDTO dto2 = new FormaDePagoDTO();
//      dto2.setDescripcion(descripcion);
      
   
     
       // invoco al facade para procesar la inscripcion
      Facade facade = new Facade();
      int idInsc = 0;
		try {
			idInsc = facade.registrarInscripcion(dto);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
       // el resultado lo adjunto como atributo en el request
      request.setAttribute("idInsc", idInsc);
      request.setAttribute("idInsc1", idInsc); //para obtener un codigo de inscripcion
      
       // redirecciono el control hacia la siguiente vista,
       // es decir: hacia su servlet de pre-procesamiento
      request.getRequestDispatcher("/UnicaInscripcion").forward(request, response);
   }
}
