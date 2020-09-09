package jesus.entrenamiento.model;

import java.util.List;



public class Cliente {
private String nombre;
private String apellido;
private String rut;
private List<Cliente>listaClientes;


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
public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public List<Cliente> getListaClientes() {
	return listaClientes;
}
public List<Cliente>addListaClientes() {
	return this.listaClientes = listaClientes;
}
}
