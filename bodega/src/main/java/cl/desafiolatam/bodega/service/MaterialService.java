package cl.desafiolatam.bodega.service;

import cl.desafiolatam.bodega.dto.MaterialDTO;
import cl.desafiolatam.bodega.model.Material;

public interface MaterialService {
	MaterialDTO findAll();
	MaterialDTO add(Material material);
}
