package cl.desafiolatam.RestVeterinaria.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import cl.desafiolatam.RestVeterinaria.model.dto.UserDTO;

public interface UserService {
	void update(UserDTO user);

	List<UserDTO> findAll();

	UserDTO findById(Long id);

	void delete(UserDTO user);

	String signin(String username, String password);

	String signup(UserDTO user);

	UserDetails loadUserByUsername(String username);
}
