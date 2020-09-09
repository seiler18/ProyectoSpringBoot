package cl.desafiolatam.ControlDestino.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import cl.desafiolatam.ControlDestino.model.Destino;
import cl.desafiolatam.ControlDestino.model.DTO.DestinoDTO;
import cl.desafiolatam.ControlDestino.repository.DestinoRepository;

@Service
public class DestinoServiceImpl implements DestinoService {
private static final Logger log = LoggerFactory.getLogger(DestinoServiceImpl.class);
	
	@Autowired
	private DestinoRepository dao;
	private DestinoDTO respuesta;
	
	@Transactional(readOnly = true)
	@Override
	public DestinoDTO findAll() {
		respuesta = new DestinoDTO(new ArrayList<Destino>(), "Ha_ocurrido un error", "error1");
		try {
			respuesta.setDestinos((List<Destino>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getDestinos().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Destino Service: Error en findAll", e);
		}
		return respuesta;
	}

	@Transactional
	@Override
	public DestinoDTO add(Destino destino) {
		respuesta = new DestinoDTO(new ArrayList<Destino>(), "Ha ocurrido un error", "104");
		try {
			dao.save(destino);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el destino con el pasajero %s",
					destino.getPasajero().getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Destino Service: Error en add", e);
		}
		return respuesta;
	}

}
