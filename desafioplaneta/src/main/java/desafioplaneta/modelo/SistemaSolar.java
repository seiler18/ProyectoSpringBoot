package desafioplaneta.modelo;

import java.util.List;

public class SistemaSolar {
	private String nombre;
	private List<Planeta> planetas = null;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Planeta> getPlanetas() {
		return planetas;
	}
	public void setPlanetas(List<Planeta> planetas) {
		this.planetas = planetas;
	}
	
	
	@Override
	public String toString() {
		return "SistemaSolar nombre=" + nombre + ", planetas=" + planetas ;
	}
	
}

