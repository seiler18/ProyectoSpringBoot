package cl.desafiolatam.RestUsuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.desafiolatam.RestUsuario.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
