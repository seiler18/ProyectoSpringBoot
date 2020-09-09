package cl.desafiolatam.security2.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.desafiolatam.security2.dao.model.Users;
import cl.desafiolatam.security2.facade.UserFacade;
import cl.desafiolatam.security2.service.UserService;
@Component
public class UserFacadeImpl implements UserFacade{
	@Autowired
	private UserService userService;
	
	@Override
	public Users getUsuarioConectado() {
		// TODO Auto-generated method stub
		return userService.getUsuarioConectado();
	}

	@Override
	public void setUsuarioConectado(String sessionUserName) {
		// TODO Auto-generated method stub
		userService.setUsuarioConectado(sessionUserName);
	}

}
