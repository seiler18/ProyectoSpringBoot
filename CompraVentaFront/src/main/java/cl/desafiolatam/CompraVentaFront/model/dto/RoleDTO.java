package cl.desafiolatam.CompraVentaFront.model.dto;

import java.util.List;


import cl.desafiolatam.CompraVentaFront.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {
	private Integer idRole;
	private String roleName;
	List<User> listaUsuarios;
}
