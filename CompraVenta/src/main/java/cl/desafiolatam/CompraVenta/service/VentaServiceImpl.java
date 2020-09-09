package cl.desafiolatam.CompraVenta.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.desafiolatam.CompraVenta.model.Venta;
import cl.desafiolatam.CompraVenta.model.dto.VentaDTO;

import cl.desafiolatam.CompraVenta.repository.VentaRepository;
import cl.desafiolatam.CompraVenta.utils.DTOMapper;

@Service

public class VentaServiceImpl implements VentaService {
private VentaRepository ventaRepository;

@Autowired
public VentaServiceImpl(VentaRepository ventaRepository) {
	this.ventaRepository = ventaRepository;
}
	@Override
	public void save(VentaDTO ventaDTO) {
		ventaRepository.save(DTOMapper.toEntity(ventaDTO));

	}

	@Override
	public void update(VentaDTO ventaDTO) {
		ventaRepository.save(DTOMapper.toEntity(ventaDTO));
	}

	@Override
	public List<VentaDTO> findAll() {
		return ventaRepository.findAll().stream().map(Venta::toDTO).collect(Collectors.toList());

	}

	@Override
	public VentaDTO findById(Integer id) {
		return ventaRepository.findById(id).orElse(new Venta()).toDTO();

	}

	@Override
	public void delete(VentaDTO ventaDTO) {
		ventaRepository.delete(DTOMapper.toEntity(ventaDTO));

	}

}
