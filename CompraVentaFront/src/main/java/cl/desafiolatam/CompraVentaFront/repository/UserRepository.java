package cl.desafiolatam.CompraVentaFront.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.CompraVentaFront.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByEmail(String email);
}
