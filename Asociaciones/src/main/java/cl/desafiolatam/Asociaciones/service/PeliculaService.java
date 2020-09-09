package cl.desafiolatam.Asociaciones.service;

import cl.desafiolatam.Asociaciones.model.Pelicula;
import cl.desafiolatam.Asociaciones.model.DTO.PeliculaDTO;

public interface PeliculaService {
PeliculaDTO findAll();
PeliculaDTO add(Pelicula pelicula);
}

