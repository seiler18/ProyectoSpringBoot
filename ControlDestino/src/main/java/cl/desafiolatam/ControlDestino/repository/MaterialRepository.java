package cl.desafiolatam.ControlDestino.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.ControlDestino.model.Material;



@Repository
public interface MaterialRepository extends CrudRepository<Material, Integer>{

}
