package cl.desafiolatam.ControlDestino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.desafiolatam.ControlDestino.model.Bodega;

import cl.desafiolatam.ControlDestino.model.DTO.BodegaDTO;

import cl.desafiolatam.ControlDestino.service.BodegaService;

@Controller
@RequestMapping("bodegas")
public class BodegaController {
	@Autowired
	private BodegaService bodegaService;

	@GetMapping({ "/", "bodegas"})
	public ModelAndView bodegas() {
		ModelAndView modelAndView = new ModelAndView("listarBodegas");
		modelAndView.addObject("bodegas", bodegaService.findAll().getBodegas());
		return modelAndView;
	}
	
	
	@GetMapping
	public ModelAndView bodegas1() {
		ModelAndView modelAndView = new ModelAndView("listarBodegas");
		modelAndView.addObject("bodega", new Bodega());
		return modelAndView;
	}
	

	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Bodega bodega) {
		BodegaDTO respuestaServicio = bodegaService.add(bodega);
		if (respuestaServicio.getCodigo().equals("0")) {
			
			return new RedirectView("/listarBodegas");
		} else {
			return new RedirectView("/SistemPasajero");
		}
	}
}
