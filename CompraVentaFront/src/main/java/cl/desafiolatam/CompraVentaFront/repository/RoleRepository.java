package cl.desafiolatam.CompraVentaFront.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.CompraVentaFront.model.Role;



@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
