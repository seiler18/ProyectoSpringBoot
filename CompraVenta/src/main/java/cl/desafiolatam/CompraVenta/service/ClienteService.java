package cl.desafiolatam.CompraVenta.service;

import java.util.List;

import cl.desafiolatam.CompraVenta.model.dto.ClienteDTO;


public interface ClienteService {
	void save(ClienteDTO cliente);
	void update(ClienteDTO cliente);
	List<ClienteDTO> findAll();
	ClienteDTO findById(Integer id);
	void delete(ClienteDTO cliente);
}
