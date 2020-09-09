package cl.desafiolatam.CompraVentaFront.utils;

import cl.desafiolatam.CompraVentaFront.model.Role;
import cl.desafiolatam.CompraVentaFront.model.User;
import cl.desafiolatam.CompraVentaFront.model.dto.RoleDTO;
import cl.desafiolatam.CompraVentaFront.model.dto.UserDTO;

public class DTOMapper {
	private DTOMapper() {
	}

//USUARIO
	private static void toEntity(UserDTO userDTO, User user) {
		user.setId(userDTO.getId());
		user.setNombre(userDTO.getNombre());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setRole(userDTO.getRole());
		

	}

	public static User toEntity(UserDTO userDTO) {
		User user = new User();
		toEntity(userDTO, user);
		return user;
	}
	
	
	//ROLE
		private static void toEntity(RoleDTO roleDTO, Role role) {
			role.setIdRole(roleDTO.getIdRole());
			role.setRoleName(roleDTO.getRoleName());	

		}

		public static Role toEntity(RoleDTO roleDTO) {
			Role role = new Role();
			toEntity(roleDTO, role);
			return role;
		}
	

	
}
