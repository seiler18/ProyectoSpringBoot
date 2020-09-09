package cl.desafiolatam.CompraVenta.service;

import java.util.List;


import cl.desafiolatam.CompraVenta.model.dto.ProductoDTO;

public interface ProductoService {
	void save(ProductoDTO producto);
	void update(ProductoDTO producto);
	List<ProductoDTO> findAll();
	ProductoDTO findById(Integer id);
	void delete(ProductoDTO producto);
}
