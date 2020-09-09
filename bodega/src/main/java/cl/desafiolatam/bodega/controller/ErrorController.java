package cl.desafiolatam.bodega.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
	@GetMapping("/recurso-prohibido")
	public ModelAndView error() {
		ModelAndView modelAndView = new ModelAndView("/error/prohibido");
		return modelAndView;
	}
}

