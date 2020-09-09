package cl.desafiolatam.Asociaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import cl.desafiolatam.Asociaciones.model.Pelicula;
import cl.desafiolatam.Asociaciones.model.DTO.PeliculaDTO;
import cl.desafiolatam.Asociaciones.service.PeliculaService;

@Controller
@RequestMapping("peliculas")
public class PeliculaController {
	@Autowired
	private PeliculaService peliculaService;

	@GetMapping
	public ModelAndView peliculas() {
		ModelAndView modelAndView = new ModelAndView("peliculas");
		modelAndView.addObject("pelicula", new Pelicula());
		return modelAndView;
	}

	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Pelicula pelicula) {
		PeliculaDTO respuestaServicio = peliculaService.add(pelicula);
		if (respuestaServicio.getCodigo().equals("0")) {
			return new RedirectView("/SistemaArriendo");
		} else {
			return new RedirectView("/peliculas");
		}
	}
}
