package cl.desafiolatam.sesion.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.desafiolatam.sesion.usuario.model.Usuario;


@WebServlet ("/SistemaWeb")
public class Sesion1  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
HttpSession session = null ;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (req.getSession()==null) {
			session = req.getSession(true);
		}else {
			session = req.getSession();
		}
		session.setAttribute("nombre", "Jesus");
		session.setAttribute("apellido", "Seiler");
		session.setAttribute("usuario", "Seiler18");		
		session.setAttribute("clave","1234");
		session.setAttribute("edad", "26");
		session.setAttribute("email","ichbinseiler@gmail.com");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(session.getAttribute("nombre").toString());
		usuario.setApellido(session.getAttribute("apellido").toString());
		usuario.setEdad(session.getAttribute("edad").toString());
		usuario.setMail(session.getAttribute("email").toString());
		
		session.setAttribute("objeto", usuario);
		req.getRequestDispatcher("/login1.jsp").forward(req, resp);
		

		
	
	}
	}


