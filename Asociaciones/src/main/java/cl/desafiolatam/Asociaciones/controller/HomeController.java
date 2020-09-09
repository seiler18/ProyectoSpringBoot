package cl.desafiolatam.Asociaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.desafiolatam.Asociaciones.service.ArriendoService;

@Controller
public class HomeController {
@Autowired
private ArriendoService arriendoService;
@GetMapping({ "/", "SistemaArriendo"})
public ModelAndView clientes() {
ModelAndView modelAndView = new ModelAndView("home");
modelAndView.addObject("arriendos",
arriendoService.findAll().getArriendos());
return modelAndView;
}
}

