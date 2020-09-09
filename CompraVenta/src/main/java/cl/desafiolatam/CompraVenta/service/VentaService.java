package cl.desafiolatam.CompraVenta.service;

import java.util.List;


import cl.desafiolatam.CompraVenta.model.dto.VentaDTO;

public interface VentaService {
	void save(VentaDTO venta);
	void update(VentaDTO venta);
	List<VentaDTO> findAll();
	VentaDTO findById(Integer id);
	void delete(VentaDTO venta);
}
