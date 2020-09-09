package cl.desafiolatam.RestVeterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.RestVeterinaria.model.dto.PetDTO;
import cl.desafiolatam.RestVeterinaria.service.PetService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping("/users/pets")
public class PetController {
	private PetService petService;

	@Autowired
	public PetController(PetService petService) {
		this.petService = petService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<PetDTO> findAll() {
		return petService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public PetDTO findOne(@PathVariable Long id) {
		return petService.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody PetDTO pet) {
		petService.save(pet);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	void update(@RequestBody PetDTO petDTO) {
		petService.update(petDTO);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void delete(@RequestBody PetDTO petDTO) {
		petService.delete(petDTO);
	}
}

