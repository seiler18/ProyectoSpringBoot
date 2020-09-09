package cl.desafiolatam.RestUsuario.services;

import java.util.List;

import cl.desafiolatam.RestUsuario.model.dto.UserDTO;

public interface UserService {
void save(UserDTO user);
void update(UserDTO user);
List<UserDTO> findAll();
UserDTO findById(Long id);
void delete(UserDTO user);

}