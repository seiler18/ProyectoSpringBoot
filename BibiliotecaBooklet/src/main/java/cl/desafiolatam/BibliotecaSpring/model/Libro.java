package cl.desafiolatam.BibliotecaSpring.model;

import org.springframework.stereotype.Repository;

@Repository
public class Libro {
private Integer id_libro;
private String titulo;
private int anio;
private String autor;
private String imprenta;
private boolean disponibilidad;




public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getAnio() {
	return anio;
}
public void setAnio(int anio) {
	this.anio = anio;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getImprenta() {
	return imprenta;
}
public void setImprenta(String imprenta) {
	this.imprenta = imprenta;
}
public boolean isDisponibilidad() {
	return disponibilidad;
}
public void setDisponibilidad(boolean disponibilidad) {
	this.disponibilidad = disponibilidad;
}
public Integer getId_libro() {
	return id_libro;
}
public void setId_libro(Integer id_libro) {
	this.id_libro = id_libro;
}


}
