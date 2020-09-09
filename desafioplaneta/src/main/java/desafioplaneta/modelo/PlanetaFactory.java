package desafioplaneta.modelo;

import java.util.ArrayList;
import java.util.List;


import desafioplaneta.interfaces.ILuna;

public class PlanetaFactory implements ILuna {

		public Planeta crearPlaneta(String nombre, double tamano, double distanciaLunas,double distanciaLunas2, double distanciaSol) {
			Planeta planeta=new Planeta(nombre,tamano, distanciaLunas,distanciaLunas2, distanciaSol );
			planeta.getDistanciaLunas();
			planeta.getDistanciaSol();
			planeta.getNombre();
			planeta.getTamano();
			planeta.getDistanciaLunas2();
				return planeta;
			}

	
	public List<Luna> construyeLunas(String nombre, double diametro, double tiempoOrbita) {
		Luna luna = new Luna(nombre, diametro, tiempoOrbita);
		List<Luna> listaLunas = new ArrayList<Luna>();
		luna.setNombre(nombre);
		luna.setDiametro(diametro);
		luna.setTiempoOrbita(tiempoOrbita);
		listaLunas.add(luna);
		return listaLunas;
	}


}
