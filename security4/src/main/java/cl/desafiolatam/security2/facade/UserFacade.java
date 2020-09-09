package cl.desafiolatam.security2.facade;

import cl.desafiolatam.security2.dao.model.Users;

public interface UserFacade {
	public void setUsuarioConectado(String sessionUserName);
	public Users getUsuarioConectado();
}
