package cl.desafiolatam.demospring.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.desafiolatam.demospring.model.Persona;

@Controller
public class HolaMundoController {
	private static final Logger logger = LoggerFactory.getLogger(HolaMundoController.class);
	
	
	@Autowired
	private Persona persona;
	@RequestMapping("/helloworld")
 public String  hello(Model model) {
	 model.addAttribute("mensaje","hola mundo spring boot");
	 logger.error("error log");
	 logger.warn("error warn");
	 logger.info("log para infos");
	 logger.debug("para debug");
	 
	 persona.setNombre("Jesus Seiler");
	 persona.setEdad(35);
	 
	 model.addAttribute("persona", persona);
	return "HelloWorld";}
}
