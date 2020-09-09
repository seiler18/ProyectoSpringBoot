package com.desafiolatam.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.desafiolatam.entidades.FormaDePagoDTO;
import com.desafiolatam.entidades.InscripcionDTO;
import com.desafiolatam.facade.Facade;

/**
 * Servlet implementation class UnicaInscripcion
 */
@WebServlet("/UnicaInscripcion")
public class UnicaInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UnicaInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Facade facade = new Facade();
		 
	      List<InscripcionDTO> idInsc = null;
	      //intentando obtener forma de pago List<FormaDePagoDTO> formaPago=null;
			try {
				idInsc = facade.obtieneInscripciones();
				//intentando obtener forma de pagoformaPago=facade.obtenerFormasDePago();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	       // el resultado lo adjunto como atributo en el request
	      request.setAttribute("idInsc", idInsc);
	    //intentando obtener forma de pago request.setAttribute("formaPago", formaPago);
	      
	       // redirecciono el control hacia la siguiente vista,
	       // es decir: hacia su servlet de pre-procesamiento
	      request.getRequestDispatcher("/UnicaInscripcion.jsp").forward(request, response);
	   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
