package cl.desafiolatam.CompraVenta.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.desafiolatam.CompraVenta.model.Producto;
import cl.desafiolatam.CompraVenta.model.dto.ProductoDTO;

import cl.desafiolatam.CompraVenta.repository.ProductoRepository;
import cl.desafiolatam.CompraVenta.utils.DTOMapper;

@Service

public class ProductoServiceImpl implements ProductoService {

	private ProductoRepository productoRepository;

	@Autowired
	public ProductoServiceImpl(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public void save(ProductoDTO productoDTO) {

		productoRepository.save(DTOMapper.toEntity(productoDTO));

	}

	@Override
	public void update(ProductoDTO productoDTO) {
		productoRepository.save(DTOMapper.toEntity(productoDTO));

	}

	@Override
	public List<ProductoDTO> findAll() {
		return productoRepository.findAll().stream().map(Producto::toDTO).collect(Collectors.toList());

	}

	@Override
	public ProductoDTO findById(Integer id) {
		return productoRepository.findById(id).orElse(new Producto()).toDTO();

	}

	@Override
	public void delete(ProductoDTO productoDTO) {
		productoRepository.delete(DTOMapper.toEntity(productoDTO));

	}

}
