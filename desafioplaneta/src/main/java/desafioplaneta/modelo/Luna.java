package desafioplaneta.modelo;

public class Luna {
private String nombre;
private double diametro;
private double tiempoOrbita;


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getDiametro() {
	return diametro;
}
public void setDiametro(double diametro) {
	this.diametro = diametro;
}
public double getTiempoOrbita() {
	return tiempoOrbita;
}
public void setTiempoOrbita(double tiempoOrbita) {
	this.tiempoOrbita = tiempoOrbita;
}
public Luna(String nombre, double diametro, double tiempoOrbita) {
	super();
	this.nombre = nombre;
	this.diametro = diametro;
	this.tiempoOrbita = tiempoOrbita;
}



}
