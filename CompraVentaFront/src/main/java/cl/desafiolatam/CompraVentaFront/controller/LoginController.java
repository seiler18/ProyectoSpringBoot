package cl.desafiolatam.CompraVentaFront.controller;

import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller	
//INGRESA AL INICIO
@RequestMapping("/")
public class LoginController {
	@GetMapping("/login")
	public ModelAndView login(HttpSession session) {
		return new ModelAndView("login");
	}
	
//	@GetMapping("/validate")
//	public RedirectView validate(HttpSession session) {
//		SecurityContext sc = (SecurityContextImpl) session.getAttribute("SPRING_SECURITY_CONTEXT");
//		//System.out.println(sc.getAuthentication().getAuthorities().toString());
//		if(sc.getAuthentication().getAuthorities().toArray()[0].toString().equals("ROLE_USER")) {
//			return new RedirectView("/user");
//		}else if(sc.getAuthentication().getAuthorities().toArray()[0].toString().equals("ROLE_ADMIN")){
//			return new RedirectView("/admin");
//		}else {
//			return new RedirectView("/login?error=true");
//		}
//		
//	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		return new ModelAndView("login");
	}
	
	@GetMapping("/cerrarSesion")
	public ModelAndView cerrarSesion(){
		ModelAndView modelAndView = new ModelAndView("cerrarSesion");
		return modelAndView;
	}
	
}
	

