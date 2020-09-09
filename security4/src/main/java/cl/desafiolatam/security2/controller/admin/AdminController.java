package cl.desafiolatam.security2.controller.admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.desafiolatam.security2.facade.UserFacade;

@Controller
public class AdminController {
	@Autowired
	private UserFacade userFacade;
	@GetMapping("/admin")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("/admin/home");
		String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
		userFacade.setUsuarioConectado(currentUserName);
		modelAndView.addObject("userName", userFacade.getUsuarioConectado().getNombre());
		
		return modelAndView;
	}
}