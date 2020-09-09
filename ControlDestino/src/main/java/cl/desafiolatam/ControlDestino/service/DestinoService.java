package cl.desafiolatam.ControlDestino.service;

import cl.desafiolatam.ControlDestino.model.Destino;
import cl.desafiolatam.ControlDestino.model.DTO.DestinoDTO;

public interface DestinoService {
	DestinoDTO findAll();
	DestinoDTO add(Destino destino);
}
