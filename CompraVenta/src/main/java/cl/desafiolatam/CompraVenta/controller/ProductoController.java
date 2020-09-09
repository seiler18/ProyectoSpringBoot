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

import cl.desafiolatam.CompraVenta.model.dto.ProductoDTO;

import cl.desafiolatam.CompraVenta.service.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST })
@RequestMapping("/producto")
public class ProductoController {
	private ProductoService productoService;

	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductoDTO> findAll() {
		return productoService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ProductoDTO findOne(@PathVariable Integer id) {
		return productoService.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody ProductoDTO producto) {
		productoService.save(producto);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	void update(@RequestBody ProductoDTO productoDTO) {
		productoService.update(productoDTO);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void delete(@RequestBody ProductoDTO productoDTO) {
		productoService.delete(productoDTO);
	}
}
