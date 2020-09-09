package cl.desafiolatam.RestUsuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.RestUsuario.model.dto.UserDTO;
import cl.desafiolatam.RestUsuario.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<UserDTO> findAll() {
		return userService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UserDTO findOne(@PathVariable Long id) {
		return userService.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody UserDTO user) {
		userService.save(user);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	void update(@RequestBody UserDTO userDTO) {
		userService.update(userDTO);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void delete(@RequestBody UserDTO userDTO) {
		userService.delete(userDTO);
	}
}
