package cl.desafiolatam.CompraVentaFront.model.dto;


import cl.desafiolatam.CompraVentaFront.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private Integer id;
	private String nombre;
	private String email;
	private String password;
	private Role role;
}
