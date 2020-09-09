package cl.desafiolatam.RestVeterinaria.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.RestVeterinaria.model.dto.UserDTO;
import cl.desafiolatam.RestVeterinaria.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/signin")
	public String login(@RequestParam String username, @RequestParam String password) {
		return userService.signin(username, password);
	}

	@PostMapping("/signup")
	@ResponseStatus(HttpStatus.CREATED)
	public String signup(@RequestBody UserDTO userDTO) {
		return userService.signup(userDTO);
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

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody UserDTO userDTO) {
		userService.update(userDTO);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void delete(@RequestBody UserDTO userDTO) {
		userService.delete(userDTO);
	}
}
