package cl.desafiolatam.ControlDestino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


import cl.desafiolatam.ControlDestino.model.Destino;
import cl.desafiolatam.ControlDestino.model.DTO.DestinoDTO;
import cl.desafiolatam.ControlDestino.service.DestinoService;
import cl.desafiolatam.ControlDestino.service.PasajeroService;



//● Método crearDestino para mostrar formulario de destino. (GET)
//● Método crearDestino para crear destino. (POST)
//● Método destinos para mostrar vista de destinos.

@Controller
@RequestMapping("destinos")
public class DestinoController {
	@Autowired
	private DestinoService destinoService;
	@Autowired
	private PasajeroService pasajeroService;
	
	//lista los destinos
	@GetMapping({ "/", "listarDestinos"})
	public ModelAndView listarDestinos() {
	ModelAndView modelAndView = new ModelAndView("listarDestinos");
	modelAndView.addObject("destinos",destinoService.findAll().getDestinos());
	return modelAndView;
	}
	
	//añade el objeto destino
	@GetMapping
	public ModelAndView destinos(Model model) {
		ModelAndView modelAndView = new ModelAndView("destinos");
		modelAndView.addObject("destino", new Destino());
		model.addAttribute("pasajeros", pasajeroService.findAll().getPasajeros());
		return modelAndView;
	}
	
	//agrega el destinoDTO
	@PostMapping("/agregar")
	public RedirectView crearDestino(@ModelAttribute Destino destino) {
		DestinoDTO respuestaServicio = destinoService.add(destino);
		if (respuestaServicio.getCodigo().equals("0")) {
			return new RedirectView("/SistemaPasajero");
		} else {
			return new RedirectView("/destinos");
		}
	}
	
	

	
}
