package cl.desafiolatam.security2.service;

import cl.desafiolatam.security2.dao.model.Users;

public interface UserService {
	public Users getUsuarioConectado();
	public void setUsuarioConectado(String sessionUserName);
}
