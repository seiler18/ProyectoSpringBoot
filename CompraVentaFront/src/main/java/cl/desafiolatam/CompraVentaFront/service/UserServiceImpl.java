package cl.desafiolatam.CompraVentaFront.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import cl.desafiolatam.CompraVentaFront.model.User;


@Primary
@Service

public class UserServiceImpl implements UserService {
	@Autowired
	private UserService userService;
	
	@Override
	public User getUsuarioConectado() {
		
		return userService.getUsuarioConectado();
	}

	@Override
	public void setUsuarioConectado(String sessionUserName) {
		
		userService.setUsuarioConectado(sessionUserName);
	}


}
