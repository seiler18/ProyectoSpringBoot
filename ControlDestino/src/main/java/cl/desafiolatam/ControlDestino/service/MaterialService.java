package cl.desafiolatam.ControlDestino.service;

import cl.desafiolatam.ControlDestino.model.Material;
import cl.desafiolatam.ControlDestino.model.DTO.MaterialDTO;

public interface MaterialService {
	MaterialDTO findAll();
	MaterialDTO add(Material material);
}
