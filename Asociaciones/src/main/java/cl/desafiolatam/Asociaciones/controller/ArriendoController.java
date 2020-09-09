package cl.desafiolatam.Asociaciones.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.desafiolatam.Asociaciones.model.Arriendo;
import cl.desafiolatam.Asociaciones.model.DTO.ArriendoDTO;
import cl.desafiolatam.Asociaciones.service.ArriendoService;
import cl.desafiolatam.Asociaciones.service.ClienteService;
import cl.desafiolatam.Asociaciones.service.PeliculaService;

@Controller
@RequestMapping("arriendos")
public class ArriendoController {
	
	@Autowired
	private ArriendoService arriendoService;
	@Autowired
	private PeliculaService peliculaService;
	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ModelAndView arriendos(Model model) {
		ModelAndView modelAndView = new ModelAndView("arriendos");
		modelAndView.addObject("arriendo", new Arriendo());
		model.addAttribute("peliculas", peliculaService.findAll().getPeliculas());
		model.addAttribute("clientes", clienteService.findAll().getClientes());
		return modelAndView;
	}

	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Arriendo arriendo) {
		ArriendoDTO respuestaServicio = arriendoService.add(arriendo);
		if (respuestaServicio.getCodigo().equals("0")) {
			return new RedirectView("/SistemaArriendo");
		} else {
			return new RedirectView("/arriendos");
		}
	}
}
