package cl.desafiolatam.CompraVentaFront.service;



import cl.desafiolatam.CompraVentaFront.model.User;



public interface UserService {
	public User getUsuarioConectado();
	public void setUsuarioConectado(String sessionUserName);
}
