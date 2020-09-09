package cl.desafiolatam.security2.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.security2.dao.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
