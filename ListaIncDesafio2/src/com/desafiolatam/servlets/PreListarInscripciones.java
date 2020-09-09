package com.desafiolatam.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.desafiolatam.entidades.InscripcionDTO;
import com.desafiolatam.facade.Facade;

/**
 * Servlet implementation class PreListarInscripciones
 */
@WebServlet("/PreListarInscripciones")
public class PreListarInscripciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreListarInscripciones() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	       // invoco al facade para procesar la inscripcion
	      Facade facade = new Facade();
	      List<InscripcionDTO> idInsc = null;
	      
			try {
				idInsc = facade.obtieneInscripciones();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	       // el resultado lo adjunto como atributo en el request
	      request.setAttribute("idInsc", idInsc);
	      
	       // redirecciono el control hacia la siguiente vista,
	       // es decir: hacia su servlet de pre-procesamiento
	      request.getRequestDispatcher("/ListaInscripciones.jsp").forward(request, response);
	   }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
