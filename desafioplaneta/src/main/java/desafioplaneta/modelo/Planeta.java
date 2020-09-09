package desafioplaneta.modelo;




public class Planeta  {
private String nombre;
private double tamano;
private double distanciaSol;
private double distanciaLunas;
private double distanciaLunas2;



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getTamano() {
	return tamano;
}
public void setTamano(double tamano) {
	this.tamano = tamano;
}
public double getDistanciaSol() {
	return distanciaSol;
}
public void setDistanciaSol(double distanciaSol) {
	this.distanciaSol = distanciaSol;
}
public double getDistanciaLunas() {
	return distanciaLunas;
}
public void setDistanciaLunas(double distanciaLunas) {
	this.distanciaLunas = distanciaLunas;
}


public double getDistanciaLunas2() {
	return distanciaLunas2;
}
public void setDistanciaLunas2(double distanciaLunas2) {
	this.distanciaLunas2 = distanciaLunas2;
}

public Planeta(String nombre, double tamano, double distanciaSol, double distanciaLunas) {
	
	this.nombre = nombre;
	this.tamano = tamano;
	this.distanciaSol = distanciaSol;
	this.distanciaLunas = distanciaLunas;
}

public Planeta(String nombre, double tamano, double distanciaSol, double distanciaLunas,double distanciaLunas2) {
	
	this.nombre = nombre;
	this.tamano = tamano;
	this.distanciaSol = distanciaSol;
	this.distanciaLunas = distanciaLunas;
	this.distanciaLunas2 = distanciaLunas2;
}




}
