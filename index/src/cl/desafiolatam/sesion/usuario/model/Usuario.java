package cl.desafiolatam.sesion.usuario.model;

public class Usuario {
private String nombre;
private String apellido;
private String edad;
private String mail;


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getEdad() {
	return edad;
}
public void setEdad(String string) {
	this.edad = string;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

}
