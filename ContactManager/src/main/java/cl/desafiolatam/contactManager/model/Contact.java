package cl.desafiolatam.contactManager.model;


import org.springframework.stereotype.Repository;

@Repository
public class Contact {

private int id;	
private String nombre;
private String apellidoPaterno;
private String apellidoMaterno;
private String direccion;
private String telefono;


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidoPaterno() {
	return apellidoPaterno;
}
public void setApellidoPaterno(String apellidoPaterno) {
	this.apellidoPaterno = apellidoPaterno;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getApellidoMaterno() {
	return apellidoMaterno;
}
public void setApellidoMaterno(String apellidoMaterno) {
	this.apellidoMaterno = apellidoMaterno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}
