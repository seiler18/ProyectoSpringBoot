package cl.desafiolatam.CompraVentaFront.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller
//INGRESA AL ADMIN
@RequestMapping("/admin")
public class AdminController {


	@GetMapping
	public ModelAndView Home() {
		ModelAndView modelAndView = new ModelAndView("admin/homeAdmin");
//		String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
//		userService.setUsuarioConectado(currentUserName);
//		modelAndView.addObject("userName", userService.getUsuarioConectado().getNombre());

		return modelAndView;
	}

	// CLIENTE-----------------------------------------------------------
	@GetMapping("/MantenedorClientes")
	public ModelAndView MantenedorClientes() {
		ModelAndView modelAndView = new ModelAndView("admin/MantenedorClientes");
//		String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
//		userService.setUsuarioConectado(currentUserName);
//		modelAndView.addObject("userName", userService.getUsuarioConectado().getNombre());

		return modelAndView;
	}

	@GetMapping("/crearCliente")
	public ModelAndView CrearCliente() {
		ModelAndView modelAndView = new ModelAndView("admin/crearCliente");
		return modelAndView;
	}

	@GetMapping("/clienteCreado")
	public ModelAndView ClienteCreado() {
		ModelAndView modelAndView = new ModelAndView("admin/listarClientes");
		return modelAndView;
	}
	
//	public RedirectView clienteCreado(@ModelAttribute Cliente cliente) {
//		PasajeroDTO respuestaServicio = pasajeroService.add(pasajero);
//		if (respuestaServicio.getCodigo().equals("0")) {
//			respuestaServicio.setMensaje("Pasajero Creado ");
//			return new RedirectView("/pasajeros");
//		} else {
//			return new RedirectView("/SistemaPasajero");
//		}
//	}
	
	
	@GetMapping("/listarClientes")
	public ModelAndView ListarClientes() {
		ModelAndView modelAndView = new ModelAndView("admin/listarClientes");
		return modelAndView;
	}

	// CLIENTE-----------------------------------------------------------

	// PRODUCTO-----------------------------------------------------------

	@GetMapping("/MantenedorProductos")
	public ModelAndView MantenedorProductos() {
		ModelAndView modelAndView = new ModelAndView("admin/MantenedorProductos");
//		String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
//		userService.setUsuarioConectado(currentUserName);
//		modelAndView.addObject("userName", userService.getUsuarioConectado().getNombre());

		return modelAndView;
	}

	@GetMapping("/crearProducto")
	public ModelAndView CrearProducto() {
		ModelAndView modelAndView = new ModelAndView("admin/crearProducto");
		return modelAndView;
	}
	
	@GetMapping("/productoCreado")
	public ModelAndView ProductoCreado() {
		ModelAndView modelAndView = new ModelAndView("admin/listarProductos");
		return modelAndView;
	}
	@GetMapping("/listarProductos")
	public ModelAndView listarProductos() {
		ModelAndView modelAndView = new ModelAndView("admin/listarProductos");
		return modelAndView;
	}
	// PRODUCTO-----------------------------------------------------------
	// VENTAS-----------------------------------------------------------
	@GetMapping("/MantenedorVentas")
	public ModelAndView MantenedorVentas() {
		ModelAndView modelAndView = new ModelAndView("admin/MantenedorVentas");
//		String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
//		userService.setUsuarioConectado(currentUserName);
//		modelAndView.addObject("userName", userService.getUsuarioConectado().getNombre());

		return modelAndView;
	}
	
	@GetMapping("/listarVentas")
	public ModelAndView listarVentas() {
		ModelAndView modelAndView = new ModelAndView("admin/listarVentas");
		return modelAndView;
	}

}
