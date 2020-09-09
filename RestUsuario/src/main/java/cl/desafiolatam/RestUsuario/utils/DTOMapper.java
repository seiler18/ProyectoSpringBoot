package cl.desafiolatam.RestUsuario.utils;

import cl.desafiolatam.RestUsuario.model.User;
import cl.desafiolatam.RestUsuario.model.dto.UserDTO;

public class DTOMapper {
private DTOMapper() {
}
private static void toEntity(UserDTO userDTO, User user) {
user.setId(userDTO.getId());
user.setName(userDTO.getName());
user.setAlias(userDTO.getAlias());
}
public static User toEntity(UserDTO userDTO) {
User user = new User();
toEntity(userDTO, user);
return user;
}
}
