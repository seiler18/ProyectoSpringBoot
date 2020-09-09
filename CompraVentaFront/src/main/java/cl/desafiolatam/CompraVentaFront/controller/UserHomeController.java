package cl.desafiolatam.CompraVentaFront.controller;



import javax.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
//INGRESA AL USER
@RequestMapping("/user")
public class UserHomeController {

	@GetMapping
	public ModelAndView home(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("user/homeUser");
//		
//		String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
//		userService.setUsuarioConectado(currentUserName);
//		modelAndView.addObject("userName", userService.getUsuarioConectado().getNombre());
//		
//		modelAndView.addObject("detalle", new DetalleDTO());
//		modelAndView.addObject("valores", session.getAttribute("valores"));
		return modelAndView;
	}

	@GetMapping("/crearProducto")
	public ModelAndView crearProducto() {
		ModelAndView modelAndView = new ModelAndView("user/crearProducto");
		return modelAndView;
	}

	@GetMapping("/crearVenta")
	public ModelAndView listarProductos() {
		ModelAndView modelAndView = new ModelAndView("user/crearVenta");
		return modelAndView;
	}	
	
	
	@GetMapping("/listarVentas")
	public ModelAndView listarVentas() {
		ModelAndView modelAndView = new ModelAndView("user/listarVentas");
		return modelAndView;
	}	
	
	
	
	
	
//	@PostMapping("/users")
//	public RedirectView home(HttpSession session, @ModelAttribute DetalleDTO detalles) {
//		List<DetalleDTO> valores = new ArrayList<>();
//		if (session.getAttribute("valores") != null)
//			valores.addAll((List<DetalleDTO>) session.getAttribute("valores"));
//		valores.add(detalles);
//		session.setAttribute("valores", valores);
//		
//		return new RedirectView("/user");
//	}
	
	

}
