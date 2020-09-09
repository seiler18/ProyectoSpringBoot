package cl.desafiolatam.sesion.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.desafiolatam.sesion.usuario.model.Usuario;

public class CrearUsuario extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		
		Usuario usuario = new Usuario();
		usuario.setNombre(session.getAttribute("nombre").toString());
		usuario.setApellido(session.getAttribute("apellido").toString());
		usuario.setEdad(session.getAttribute("edad").toString());
		usuario.setMail(session.getAttribute("email").toString());
		
		session.setAttribute("objeto", usuario);
	}
	

}
