package cl.desafiolatam.RestVeterinaria.model.dto;

import java.util.List;

import cl.desafiolatam.RestVeterinaria.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
private Long id;
private String name;
private String username;
private String email;
private String password;
private List<Role> roles;
}
