package cl.desafiolatam.RestVeterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.RestVeterinaria.model.Pet;
@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{

}
