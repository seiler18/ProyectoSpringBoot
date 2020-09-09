package cl.desafiolatam.RestUsuario.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.RestUsuario.model.User;
import cl.desafiolatam.RestUsuario.model.dto.UserDTO;
import cl.desafiolatam.RestUsuario.repository.UserRepository;
import cl.desafiolatam.RestUsuario.utils.DTOMapper;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void save(UserDTO userDTO) {
		userRepository.save(DTOMapper.toEntity(userDTO));
	}

	@Override
	public void update(UserDTO userDTO) {
		userRepository.save(DTOMapper.toEntity(userDTO));
	}

@Override
public List<UserDTO> findAll() {
return
userRepository.findAll().stream().map(User::toDTO).collect(Collectors.toList());
}

	@Override
	public UserDTO findById(Long id) {
		return userRepository.findById(id).orElse(new User()).toDTO();
	}

	@Override
	public void delete(UserDTO userDTO) {
		userRepository.delete(DTOMapper.toEntity(userDTO));
	}
}
