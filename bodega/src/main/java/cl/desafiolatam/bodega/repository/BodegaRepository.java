package cl.desafiolatam.bodega.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.bodega.model.Bodega;

@Repository
public interface BodegaRepository extends CrudRepository<Bodega, Integer> {

}