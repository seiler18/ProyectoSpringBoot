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

import cl.desafiolatam.bodega.dto.MaterialDTO;
import cl.desafiolatam.bodega.model.Material;
import cl.desafiolatam.bodega.service.BodegaService;
import cl.desafiolatam.bodega.service.MaterialService;

@Controller
@RequestMapping("materiales")
public class MaterialController {
	@Autowired
	private MaterialService materialService;
	@Autowired
	private BodegaService bodegaService;

	@GetMapping
	public ModelAndView materiales(Model model) {
		ModelAndView modelAndView = new ModelAndView("/user/materiales");
		modelAndView.addObject("material", new Material());
		model.addAttribute("bodegas", bodegaService.findAll().getBodegas());
		modelAndView.addObject("materiales", materialService.findAll().getMateriales());
		return modelAndView;
	}
	
	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Material material) {
		MaterialDTO respuestaServicio = materialService.add(material);
		if (respuestaServicio.getCodigo().equals("0")) {
			return new RedirectView("/materiales");
		} else {
			return new RedirectView("/");
		}
	}
	
}
