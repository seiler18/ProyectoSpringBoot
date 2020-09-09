package cl.desafiolatam.CompraVenta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.CompraVenta.model.dto.VentaDTO;
import cl.desafiolatam.CompraVenta.service.VentaService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST })
@RequestMapping("/venta")
public class VentaController {
	private VentaService ventaService;

	@Autowired
	public VentaController(VentaService ventaService) {
		this.ventaService = ventaService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<VentaDTO> findAll() {
		return ventaService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public VentaDTO findOne(@PathVariable Integer id) {
		return ventaService.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody VentaDTO venta) {
		ventaService.save(venta);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	void update(@RequestBody VentaDTO ventaDTO) {
		ventaService.update(ventaDTO);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void delete(@RequestBody VentaDTO ventaDTO) {
		ventaService.delete(ventaDTO);
	}
}