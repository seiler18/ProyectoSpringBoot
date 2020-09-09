package cl.desafiolatam.BibliotecaSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.desafiolatam.BibliotecaSpring.facade.LibroFacade;
import cl.desafiolatam.BibliotecaSpring.model.Libro;




@Controller
public class LibroController {
	@Autowired 
	private Libro libro;
	@Autowired
	private List<Libro>listaLibros;
	@Autowired
	private LibroFacade libroFacade;
	
	
	
	@RequestMapping(value = "/BibliotecaBooklet", method = RequestMethod.GET)
	public String init(ModelMap model) {
		model.put("libro", libro);
		return "index";

	}
	
	@RequestMapping(value = "/listarLibros", method = RequestMethod.POST)
	public String init2(ModelMap model) {
		model.put("libro", libro);
		listaLibros = libroFacade.getLibroList();
		model.addAttribute("listaLibros", listaLibros);
		return "index";
	}
	
	
		@RequestMapping(value = "/agregarLibro", method = RequestMethod.POST)
		public String agregarLibro(ModelMap model, @ModelAttribute("libro") Libro libro) {
			model.addAttribute("libro",libro);
					if (libroFacade.agregarLibro(libro)) {
					listaLibros = libroFacade.getLibroList();
					}

				model.addAttribute("listaLibros", listaLibros);
					return "index";

				}

		@RequestMapping(value = "/borrarLibro", method = RequestMethod.GET)
		public String borrarLibro(ModelMap model, @ModelAttribute("id") Integer id_libro) {
			libroFacade.borrarLibro(id_libro); 
			listaLibros = libroFacade.getLibroList();

model.addAttribute("libro",libro);
model.addAttribute("listaLibros",listaLibros);
			

return "index";
		}
		

		@RequestMapping(value = "/buscarLibro", method = RequestMethod.GET)
		public String searchContact(ModelMap model) {
			model.addAttribute("libro", libro);
			return "index";

		}	
		
	}

