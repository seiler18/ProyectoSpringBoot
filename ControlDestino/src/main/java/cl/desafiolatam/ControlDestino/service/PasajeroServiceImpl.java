package cl.desafiolatam.ControlDestino.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import cl.desafiolatam.ControlDestino.model.Pasajero;
import cl.desafiolatam.ControlDestino.model.DTO.PasajeroDTO;
import cl.desafiolatam.ControlDestino.repository.PasajeroRepository;

@Service
public class PasajeroServiceImpl implements PasajeroService {
	private static final Logger log = LoggerFactory.getLogger(PasajeroServiceImpl.class);

	@Autowired
	private PasajeroRepository dao;
	private PasajeroDTO respuesta;
	
	@Transactional(readOnly = true)
	public PasajeroDTO findAll() {
		respuesta = new PasajeroDTO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "error2");
		try {
			respuesta.setPasajeros((List<Pasajero>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getPasajeros().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Pasajero Service: Error en findAll", e);
		}
		return respuesta;
	}

	public PasajeroDTO add(Pasajero pasajero) {
		respuesta = new PasajeroDTO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "error3");
		try {
			dao.save(pasajero);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el cliente %s", pasajero.getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Pasajero Service: Error en add", e);
		}
		return respuesta;
	}

}
