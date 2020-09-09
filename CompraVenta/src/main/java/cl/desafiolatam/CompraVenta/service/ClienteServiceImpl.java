package cl.desafiolatam.CompraVenta.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.CompraVenta.model.Cliente;
import cl.desafiolatam.CompraVenta.model.dto.ClienteDTO;
import cl.desafiolatam.CompraVenta.repository.ClienteRepository;
import cl.desafiolatam.CompraVenta.utils.DTOMapper;

@Service

public class ClienteServiceImpl implements ClienteService {
	private ClienteRepository clienteRepository;

	@Autowired
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	public void save(ClienteDTO clienteDTO) {
		clienteRepository.save(DTOMapper.toEntity(clienteDTO));
	}

	@Override
	public void update(ClienteDTO clienteDTO) {
		clienteRepository.save(DTOMapper.toEntity(clienteDTO));
	}

	@Override
	public List<ClienteDTO> findAll() {
		return clienteRepository.findAll().stream().map(Cliente::toDTO).collect(Collectors.toList());
	}

	@Override
	public ClienteDTO findById(Integer id) {
		return clienteRepository.findById(id).orElse(new Cliente()).toDTO();
	}

	@Override
	public void delete(ClienteDTO clienteDTO) {
		clienteRepository.delete(DTOMapper.toEntity(clienteDTO));
	}

}
