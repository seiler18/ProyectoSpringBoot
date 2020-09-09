package cl.desafiolatam.ControlDestino.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.ControlDestino.model.Bodega;



@Repository
public interface BodegaRepository extends CrudRepository<Bodega, Integer>{

}
