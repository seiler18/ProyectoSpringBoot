package cl.desafiolatam.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet ("/Factura")
public class Factura extends HttpServlet{
	HttpSession session = null ;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession misesion = req.getSession();
		
		if (req.getSession()==null) {
			session = req.getSession(true);
		}else {
			session = req.getSession();
		}
		
		RequestDispatcher rd =
				//Nos permite volver al inicio
				req.getRequestDispatcher("/ingreso.jsp");
				rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PRECIOS
				final int PRECIO_VALVULAS = 120000;
				final int PRECIO_TURBO = 1700000;
				final int PRECIO_FRENOS= 760000;
				final int PRECIO_REFRI = 2300000;
				final int PRECIO_PLUMAS = 10000;
				
				// GET DATOS PERSONA
				String nombre = req.getParameter("nombre");
				String empresa = req.getParameter("empresa");
				String rut = req.getParameter("rut");
				String direccion = req.getParameter("direccion");
				String ciudad = req.getParameter("ciudad");
				String pais = req.getParameter("pais");
				
				req.setAttribute("nombre", nombre);
				req.setAttribute("empresa", empresa);
				req.setAttribute("rut", rut);
				req.setAttribute("direccion", direccion);
				req.setAttribute("ciudad", ciudad);
				req.setAttribute("pais", pais);
				
				// GET DATOS VENTA
				int valvulas = Integer.parseInt(req.getParameter("valvulas"));
				int turbo = Integer.parseInt(req.getParameter("turbo"));
				int frenos = Integer.parseInt(req.getParameter("frenos"));
				int refri = Integer.parseInt(req.getParameter("refri"));
				int plumas = Integer.parseInt(req.getParameter("plumas"));
				
				req.setAttribute("valvulas", valvulas);
				req.setAttribute("turbo", turbo);
				req.setAttribute("frenos", frenos);
				req.setAttribute("refri", refri);
				req.setAttribute("plumas", plumas);
				
				// CALCULOS
				req.setAttribute("totalValvulas", PRECIO_VALVULAS * valvulas);
				req.setAttribute("totalTurbo", PRECIO_TURBO * turbo);
				req.setAttribute("totalFrenos", PRECIO_FRENOS * frenos);
				req.setAttribute("totalRefri", PRECIO_REFRI * refri);
				req.setAttribute("totalPlumas", PRECIO_PLUMAS * plumas);
				
				// TOTAL
				req.setAttribute("valorNetoTotal", "totalValvulas" + "totalTurbo" + "totalFrenos" + "totalRefri" + "totalPlumas");
				
				RequestDispatcher rd = req.getRequestDispatcher("/infor.jsp");
				rd.forward(req, resp);
	}



}
