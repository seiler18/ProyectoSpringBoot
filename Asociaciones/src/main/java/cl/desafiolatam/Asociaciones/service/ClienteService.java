package cl.desafiolatam.Asociaciones.service;

import cl.desafiolatam.Asociaciones.model.Cliente;
import cl.desafiolatam.Asociaciones.model.DTO.ClienteDTO;

public interface ClienteService {
ClienteDTO findAll();
ClienteDTO add(Cliente cliente);
}
