package cl.desafiolatam.ControlDestino.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.ControlDestino.model.Pasajero;
@Repository
public interface PasajeroRepository extends CrudRepository<Pasajero, Integer> {

}
