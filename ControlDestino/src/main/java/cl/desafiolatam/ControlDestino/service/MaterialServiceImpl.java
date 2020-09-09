package cl.desafiolatam.ControlDestino.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.desafiolatam.ControlDestino.model.Material;
import cl.desafiolatam.ControlDestino.model.DTO.MaterialDTO;
import cl.desafiolatam.ControlDestino.repository.MaterialRepository;



@Service
public class MaterialServiceImpl implements MaterialService {
	private static final Logger log = LoggerFactory.getLogger(MaterialServiceImpl.class);

	@Autowired
	private MaterialRepository dao;
	private MaterialDTO respuesta;
	
	@Transactional(readOnly = true)
	public MaterialDTO findAll() {
		respuesta = new MaterialDTO(new ArrayList<Material>(), "Ha ocurrido un error", "error2");
		try {
			respuesta.setMateriales((List<Material>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getMateriales().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Pasajero Service: Error en findAll", e);
		}
		return respuesta;
	}

@Transactional
	public MaterialDTO add(Material material) {
		respuesta = new MaterialDTO(new ArrayList<Material>(), "Ha ocurrido un error", "error3");
		try {
			dao.save(material);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el cliente %s", material.getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Pasajero Service: Error en add", e);
		}
		return respuesta;
	}

}
