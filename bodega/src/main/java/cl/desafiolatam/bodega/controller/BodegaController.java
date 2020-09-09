package cl.desafiolatam.bodega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.desafiolatam.bodega.dto.BodegaDTO;
import cl.desafiolatam.bodega.model.Bodega;
import cl.desafiolatam.bodega.service.BodegaService;

@Controller
@RequestMapping("/")
public class BodegaController {
	@Autowired
	private BodegaService bodegaService;

	@GetMapping
	public ModelAndView bodegas(Model model) {
		ModelAndView modelAndView = new ModelAndView("/user/bodega");
		modelAndView.addObject("bodega", new Bodega());
		model.addAttribute("bodegas", bodegaService.findAll().getBodegas());
		return modelAndView;
	}
	
	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Bodega bodega) {
		BodegaDTO respuestaServicio = bodegaService.add(bodega);
		if (respuestaServicio.getCodigo().equals("0")) {
			//return new RedirectView("/material");
			return new RedirectView("/");
		} else {
			return new RedirectView("/");
		}
	}
}
