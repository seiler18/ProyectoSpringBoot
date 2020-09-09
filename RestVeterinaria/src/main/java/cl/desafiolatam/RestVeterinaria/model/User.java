package cl.desafiolatam.RestVeterinaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import cl.desafiolatam.RestVeterinaria.model.dto.UserDTO;




import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


@SequenceGenerator(name = "SQ_USER", initialValue = 1, allocationSize = 1, sequenceName = "SQ_USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USER")
	private Long id;
	private String name;
	private String username;
	private String email;
	private String password;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Role> roles;


	public UserDTO toDTO() {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(this.getId());
		userDTO.setName(this.getName());
		userDTO.setUsername(this.getUsername());
		userDTO.setEmail(this.getEmail());
		userDTO.setPassword(null);
		userDTO.setRoles(this.getRoles());
		return userDTO;
	}
}
