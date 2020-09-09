package cl.desafiolatam.RestVeterinaria.service;

import java.util.List;


import cl.desafiolatam.RestVeterinaria.model.dto.PetDTO;

public interface PetService {
	void save(PetDTO pet);
	void update(PetDTO pet);
	List<PetDTO> findAll();
	PetDTO findById(Long id);
	void delete(PetDTO pet);

}
