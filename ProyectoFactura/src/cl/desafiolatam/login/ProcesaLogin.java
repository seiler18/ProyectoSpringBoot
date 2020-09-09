package cl.desafiolatam.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet ("/logear")
public class ProcesaLogin extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HttpSession session = null ;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession misesion = req.getSession();
		
		if (req.getSession()==null) {
			session = req.getSession(true);
		}else {
			session = req.getSession();
		}
		
		RequestDispatcher rd =
				//Nos permite volver al inicio
				req.getRequestDispatcher("/index.jsp");
				rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("usuario");
		String password = req.getParameter("clave");
		
		if(username.isEmpty() || password.isEmpty()) {
			
			RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
					rd.forward(req, resp);

		} else {
			if(username.equals("admin")  && (password.equals("admin"))) {
				HttpSession misesion = req.getSession();
				misesion.getAttribute(username);
				
				RequestDispatcher rd =
						//va a la pagina privada
						req.getRequestDispatcher("/IngresoValores.jsp");
						rd.forward(req, resp);
			} else {
				//te devuelve a otro jsp que te permite regresar al inicio
				RequestDispatcher rd =
						req.getRequestDispatcher("/error.jsp");
						rd.forward(req, resp);
	}
	
}
	}
}
