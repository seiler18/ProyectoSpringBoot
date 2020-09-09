package cl.desafiolatam.Asociaciones.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.Asociaciones.model.Arriendo;
@Repository
public interface ArriendoRepository extends CrudRepository<Arriendo, Integer> {

}
