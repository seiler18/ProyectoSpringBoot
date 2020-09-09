package cl.desafiolatam.ControlDestino.service;

import cl.desafiolatam.ControlDestino.model.Bodega;
import cl.desafiolatam.ControlDestino.model.DTO.BodegaDTO;

public interface BodegaService {
	BodegaDTO findAll();
	BodegaDTO add(Bodega bodega);
}
