package cl.desafiolatam.bodega.service;

import cl.desafiolatam.bodega.dto.BodegaDTO;
import cl.desafiolatam.bodega.model.Bodega;

public interface BodegaService {
	BodegaDTO findAll();
	BodegaDTO add(Bodega bodega);
}
