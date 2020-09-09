package cl.desafiolatam.Asociaciones.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.desafiolatam.Asociaciones.model.Arriendo;
import cl.desafiolatam.Asociaciones.model.DTO.ArriendoDTO;
import cl.desafiolatam.Asociaciones.repository.ArriendoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArriendoServiceImpl implements ArriendoService {
	private static final Logger log = LoggerFactory.getLogger(ArriendoServiceImpl.class);
	
	@Autowired
	private ArriendoRepository dao;
	private ArriendoDTO respuesta;

	@Transactional(readOnly = true)
	public ArriendoDTO findAll() {
		respuesta = new ArriendoDTO(new ArrayList<Arriendo>(), "Ha_ocurrido un error", "102");
		try {
			respuesta.setArriendos((List<Arriendo>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getArriendos().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Arriendo Service: Error en findAll", e);
		}
		return respuesta;
	}

	@Transactional
	public ArriendoDTO add(Arriendo arriendo) {
		respuesta = new ArriendoDTO(new ArrayList<Arriendo>(), "Ha ocurrido un error", "104");
		try {
			dao.save(arriendo);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el arriendo de la pelicula %s",
					arriendo.getPelicula().getTitulo()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Arriendo Service: Error en add", e);
		}
		return respuesta;
	}
}
