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

import cl.desafiolatam.CompraVenta.model.dto.ClienteDTO;
import cl.desafiolatam.CompraVenta.service.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/cliente")
public class ClienteController {
	private ClienteService clienteService;

	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ClienteDTO> findAll() {
		return clienteService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ClienteDTO findOne(@PathVariable Integer id) {
		return clienteService.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody ClienteDTO cliente) {
		clienteService.save(cliente);
	}

	@PutMapping("/put")
	@ResponseStatus(HttpStatus.OK)
	void update(@RequestBody ClienteDTO clienteDTO) {
		clienteService.update(clienteDTO);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	void delete(@RequestBody ClienteDTO clienteDTO) {
		clienteService.delete(clienteDTO);
	}
}

