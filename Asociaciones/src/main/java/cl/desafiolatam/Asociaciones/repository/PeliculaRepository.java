package cl.desafiolatam.Asociaciones.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.Asociaciones.model.Pelicula;
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer>{

}
