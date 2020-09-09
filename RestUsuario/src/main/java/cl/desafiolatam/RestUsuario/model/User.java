package cl.desafiolatam.RestUsuario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cl.desafiolatam.RestUsuario.model.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String alias;
public UserDTO toDTO() {
UserDTO userDTO = new UserDTO();
userDTO.setId(this.getId());
userDTO.setName(this.getName());
userDTO.setAlias(this.getAlias());
return userDTO;
}}

