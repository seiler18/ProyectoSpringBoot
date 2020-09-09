package cl.desafiolatam.security2.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.security2.dao.model.Users;

@Repository
public interface UsuarioRepository extends CrudRepository<Users, Integer>{
	public List<Users> findByEmail(String email); 
}
