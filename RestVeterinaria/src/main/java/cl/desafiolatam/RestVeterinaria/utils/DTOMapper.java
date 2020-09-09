package cl.desafiolatam.RestVeterinaria.utils;

import cl.desafiolatam.RestVeterinaria.model.Pet;
import cl.desafiolatam.RestVeterinaria.model.User;
import cl.desafiolatam.RestVeterinaria.model.dto.PetDTO;
import cl.desafiolatam.RestVeterinaria.model.dto.UserDTO;

public class DTOMapper {
	private DTOMapper() {
	}

	private static void toEntity(PetDTO petDTO, Pet pet) {
		pet.setId(petDTO.getId());
		pet.setNombre(petDTO.getNombre());
		pet.setTipo(petDTO.getTipo());
		pet.setDueno(petDTO.getDueno());
		pet.setDetalle(petDTO.getDetalle());
		pet.setEstado(petDTO.getEstado());

	}

	public static Pet toEntity(PetDTO petDTO) {
		Pet pet = new Pet();
		toEntity(petDTO, pet);
		return pet;
	}

	private static void toEntity(UserDTO userDTO, User user) {
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setUsername(userDTO.getUsername());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setRoles(userDTO.getRoles());
	}

	public static User toEntity(UserDTO userDTO) {
		User user = new User();
		toEntity(userDTO, user);
		return user;
	}
}
