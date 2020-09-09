package cl.desafiolatam.bodega.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.desafiolatam.bodega.dto.BodegaDTO;
import cl.desafiolatam.bodega.model.Bodega;
import cl.desafiolatam.bodega.repository.BodegaRepository;


@Service
public class BodegaServiceImpl implements BodegaService {

	private static final Logger log = LoggerFactory.getLogger(BodegaServiceImpl.class);
	@Autowired
	private BodegaRepository dao;
	private BodegaDTO respuesta;

	@Override
	@Transactional(readOnly = true)
	public BodegaDTO findAll() {
		respuesta = new BodegaDTO(new ArrayList<Bodega>(), "Ha ocurrido un error", "102");
		try {
			respuesta.setBodegas((List<Bodega>) dao.findAll());
			respuesta.setMensaje(String.format("Se han encontrado registro/s", respuesta.getBodegas().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Cliente Service: Error en findAll", e);
		}
		return respuesta;
	}

	@Override
	@Transactional
	public BodegaDTO add(Bodega bodega) {
		respuesta = new BodegaDTO(new ArrayList<Bodega>(), "Ha ocurrido un error", "104");
		try {
			dao.save(bodega);
			respuesta.setMensaje(String.format("Se ha guardado correctamente la bodega %s", bodega.getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Bodega Service: Error en add", e);
		}
		return respuesta;
	}

}