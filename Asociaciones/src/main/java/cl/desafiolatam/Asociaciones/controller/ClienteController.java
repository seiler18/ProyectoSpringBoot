package cl.desafiolatam.Asociaciones.controller;

import cl.desafiolatam.Asociaciones.model.DTO.ClienteDTO;
import cl.desafiolatam.Asociaciones.model.Cliente;
import cl.desafiolatam.Asociaciones.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ModelAndView clientes() {
		ModelAndView modelAndView = new ModelAndView("clientes");
		modelAndView.addObject("cliente", new Cliente());
		return modelAndView;
	}

	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Cliente cliente) {
		ClienteDTO respuestaServicio = clienteService.add(cliente);
		if (respuestaServicio.getCodigo().equals("0")) {
			return new RedirectView("/SistemaArriendo");
		} else {
			return new RedirectView("/clientes");
		}
	}
}
