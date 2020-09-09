package cl.desafiolatam.ControlDestino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.desafiolatam.ControlDestino.service.BodegaService;
import cl.desafiolatam.ControlDestino.service.DestinoService;
import cl.desafiolatam.ControlDestino.service.MaterialService;
import cl.desafiolatam.ControlDestino.service.PasajeroService;




@Controller
public class HomeController {
@Autowired
private DestinoService destinoService;
@Autowired
private PasajeroService pasajeroService;
@Autowired
private BodegaService bodegaService;
@Autowired
private MaterialService materialService;

@GetMapping ("/SistemaPasajero")
public ModelAndView pasajeros() {
ModelAndView modelAndView = new ModelAndView("index");
return modelAndView;
}

@GetMapping("/listarPasajeros")
public ModelAndView listarPasajeros() {
ModelAndView modelAndView = new ModelAndView("listarPasajeros");
modelAndView.addObject("pasajeros",pasajeroService.findAll().getPasajeros());
return modelAndView;
}

@GetMapping("/listarDestinos")
public ModelAndView listarDestinos() {
ModelAndView modelAndView = new ModelAndView("listarDestinos");
modelAndView.addObject("destinos",destinoService.findAll().getDestinos());

return modelAndView;


}

@GetMapping("/listarMateriales")
public ModelAndView materiales() {
ModelAndView modelAndView = new ModelAndView("materiales");
modelAndView.addObject("materiales",materialService.findAll().getMateriales());
modelAndView.addObject("bodegas",bodegaService.findAll().getBodegas());
return modelAndView;


}

@GetMapping("/listarBodegas")
public ModelAndView bodegas() {
ModelAndView modelAndView = new ModelAndView("listarBodegas");
modelAndView.addObject("bodegas",bodegaService.findAll().getBodegas());
return modelAndView;


}

}
