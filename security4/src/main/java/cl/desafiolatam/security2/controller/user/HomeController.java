package cl.desafiolatam.security2.controller.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.desafiolatam.security2.dto.DetalleDTO;
import cl.desafiolatam.security2.facade.UserFacade;

@Controller
public class HomeController {
	@Autowired
	private UserFacade userFacade;
	@GetMapping("/user")
	public ModelAndView home(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("/user/home");
		
		String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
		userFacade.setUsuarioConectado(currentUserName);
		modelAndView.addObject("userName", userFacade.getUsuarioConectado().getNombre());
		
		modelAndView.addObject("detalle", new DetalleDTO());
		modelAndView.addObject("valores", session.getAttribute("valores"));
		return modelAndView;
	}

	@PostMapping("/users")
	public RedirectView home(HttpSession session, @ModelAttribute DetalleDTO detalles) {
		List<DetalleDTO> valores = new ArrayList<>();
		if (session.getAttribute("valores") != null)
			valores.addAll((List<DetalleDTO>) session.getAttribute("valores"));
		valores.add(detalles);
		session.setAttribute("valores", valores);
		return new RedirectView("/user");
	}
}
