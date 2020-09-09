package cl.desafiolatam.RestVeterinaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import
org.springframework.security.authentication.AuthenticationManager;
import
org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import
org.springframework.security.core.userdetails.UserDetailsService;
import
org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


import cl.desafiolatam.RestVeterinaria.exception.RestServiceException;
import cl.desafiolatam.RestVeterinaria.model.User;
import cl.desafiolatam.RestVeterinaria.model.dto.UserDTO;
import cl.desafiolatam.RestVeterinaria.repository.UserRepository;
import cl.desafiolatam.RestVeterinaria.security.JwtTokenProvider;
import cl.desafiolatam.RestVeterinaria.utils.DTOMapper;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JwtTokenProvider jwtTokenProvider;
	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public void update(UserDTO userDTO) {
		userRepository.save(DTOMapper.toEntity(userDTO));
	}

	@Override
	public List<UserDTO> findAll() {
		return userRepository.findAll().stream().map(User::toDTO).collect(Collectors.toList());
	}

	@Override
	public UserDTO findById(Long id) {
		return userRepository.findById(id).orElse(new User()).toDTO();
	}

	@Override
	public void delete(UserDTO userDTO) {
		userRepository.delete(DTOMapper.toEntity(userDTO));
	}

	public String signin(String username, String password) {
	try {
	authenticationManager.authenticate(new
	UsernamePasswordAuthenticationToken(username, password));
	return jwtTokenProvider.createToken(username,
	userRepository.findByUsername(username).getRoles());
	} catch (AuthenticationException e) {
	throw new RestServiceException("username o password	invalido", HttpStatus.UNPROCESSABLE_ENTITY);
	}
	}

	public String signup(UserDTO user) {
	if (!userRepository.existsByUsername(user.getUsername())) {
	user.setPassword(passwordEncoder.encode(user.getPassword()));
	userRepository.save(DTOMapper.toEntity(user));
	return jwtTokenProvider.createToken(user.getUsername(),
	user.getRoles());
	} else {
	throw new RestServiceException("Username ya está en	uso", HttpStatus.UNPROCESSABLE_ENTITY);
	}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Usuario '" + username + "' no encontrado");
		}
		return org.springframework.security.core.userdetails.User//
				.withUsername(username).password(user.getPassword()).authorities(user.getRoles()).accountExpired(false)
				.accountLocked(false).credentialsExpired(false).disabled(false).build();
	}
}
