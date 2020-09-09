package cl.desafiolatam.bodega.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.bodega.model.Material;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Integer> {

}
