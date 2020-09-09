package cl.desafiolatam.bodega.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.desafiolatam.bodega.dto.MaterialDTO;
import cl.desafiolatam.bodega.model.Material;
import cl.desafiolatam.bodega.repository.MaterialRepository;

@Service
public class MaterialServiceImpl implements MaterialService {

	private static final Logger log = LoggerFactory.getLogger(MaterialServiceImpl.class);
	@Autowired
	private MaterialRepository dao;
	private MaterialDTO respuesta;

	@Override
	@Transactional(readOnly = true)
	public MaterialDTO findAll() {
		respuesta = new MaterialDTO(new ArrayList<Material>(), "Ha ocurrido un error", "102");
		try {
			respuesta.setMateriales((List<Material>) dao.findAll());
			respuesta.setMensaje(String.format("Se han encontrado registro/s", respuesta.getMateriales().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Cliente Service: Error en findAll", e);
		}
		return respuesta;
	}

	@Override
	@Transactional
	public MaterialDTO add(Material material) {
		respuesta = new MaterialDTO(new ArrayList<Material>(), "Ha ocurrido un error", "104");
		try {
			dao.save(material);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el Material %s", material.getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Material Service: Error en add", e);
		}
		return respuesta;
	}

}