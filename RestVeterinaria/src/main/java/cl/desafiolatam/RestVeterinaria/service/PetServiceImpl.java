package cl.desafiolatam.RestVeterinaria.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.desafiolatam.RestVeterinaria.model.Pet;
import cl.desafiolatam.RestVeterinaria.model.dto.PetDTO;
import cl.desafiolatam.RestVeterinaria.repository.PetRepository;
import cl.desafiolatam.RestVeterinaria.utils.DTOMapper;

@Service

public class PetServiceImpl implements PetService {

	private PetRepository petRepository;

	@Autowired
	public PetServiceImpl(PetRepository petRepository) {
	this.petRepository = petRepository;
	}

	@Override
	public void save(PetDTO petDTO) {
		petRepository.save(DTOMapper.toEntity(petDTO));
	}

	@Override
	public void update(PetDTO petDTO) {
		petRepository.save(DTOMapper.toEntity(petDTO));
	}

	@Override
	public List<PetDTO> findAll() {
	return
	petRepository.findAll().stream().map(Pet::toDTO).collect(Collectors.toList());
	}

	@Override
	public PetDTO findById(Long id) {
		return petRepository.findById(id).orElse(new Pet()).toDTO();
	}

	@Override
	public void delete(PetDTO petDTO) {
		petRepository.delete(DTOMapper.toEntity(petDTO));
	}
}
