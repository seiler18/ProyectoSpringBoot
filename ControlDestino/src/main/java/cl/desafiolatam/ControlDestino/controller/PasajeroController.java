package cl.desafiolatam.ControlDestino.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import cl.desafiolatam.ControlDestino.model.Pasajero;

import cl.desafiolatam.ControlDestino.model.DTO.PasajeroDTO;
import cl.desafiolatam.ControlDestino.service.PasajeroService;
//● Método crearPasajero para mostrar formulario de pasajero. (GET)
//● Método crearPasajero para crear pasajero. (POST)
//● Método pasajeros para mostrar vista de pasajeros.


@Controller
@RequestMapping("pasajeros")
public class PasajeroController {

@Autowired 
private PasajeroService pasajeroService;


//lista los pasajeros
@GetMapping({ "/", "listarPasajeros"})
public ModelAndView listarPasajeros() {
ModelAndView modelAndView = new ModelAndView("listarPasajeros");
modelAndView.addObject("pasajeros",pasajeroService.findAll().getPasajeros());
return modelAndView;
}

//añade el objeto pasajero
@GetMapping
public ModelAndView pasajeros() {
	ModelAndView modelAndView = new ModelAndView("pasajeros");
	modelAndView.addObject("pasajero", new Pasajero());
	return modelAndView;
}

//agrega el pasajeroDTO
@PostMapping("/agregar")
public RedirectView crearPasajero(@ModelAttribute Pasajero pasajero) {
	PasajeroDTO respuestaServicio = pasajeroService.add(pasajero);
	if (respuestaServicio.getCodigo().equals("0")) {
		respuestaServicio.setMensaje("Pasajero Creado ");
		return new RedirectView("/pasajeros");
	} else {
		return new RedirectView("/SistemaPasajero");
	}
}


}