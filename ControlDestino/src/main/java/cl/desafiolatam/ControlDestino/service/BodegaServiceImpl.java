package cl.desafiolatam.ControlDestino.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.desafiolatam.ControlDestino.model.Bodega;
import cl.desafiolatam.ControlDestino.model.DTO.BodegaDTO;
import cl.desafiolatam.ControlDestino.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

	private static final Logger log = LoggerFactory.getLogger(BodegaServiceImpl.class);

	@Autowired
	private BodegaRepository dao;
	private BodegaDTO respuesta;
	
	@Transactional(readOnly = true)
	public BodegaDTO findAll() {
		respuesta = new BodegaDTO(new ArrayList<Bodega>(), "Ha ocurrido un error", "error2");
		try {
			respuesta.setBodegas((List<Bodega>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getBodegas().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Bodega Service: Error en findAll", e);
		}
		return respuesta;
	}

@Transactional
	public BodegaDTO add(Bodega bodega) {
		respuesta = new BodegaDTO(new ArrayList<Bodega>(), "Ha ocurrido un error", "error3");
		try {
			dao.save(bodega);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el cliente %s", bodega.getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Bodega Service: Error en add", e);
		}
		return respuesta;
	}

}
