package cl.desafiolatam.Asociaciones.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.Asociaciones.model.Cliente;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
