package certificacion.recargo;

import java.util.ArrayList;
import java.util.List;

import certificacion.Utilitaria;

public class CalculaPrecios implements ConRecargo {

	public Double obtenerTotal(List<Double> precios) {
		Double total = 0.0;

		for (Double precio : aplicarRecargo(precios)) {
			total += precio;
		}

		return Utilitaria.aproxima(total);
	}

	public List<Double> aplicarRecargo(List<Double> precios) {
		List<Double> preciosAux = new ArrayList<>();

		double factor = 1.1;

		for (Double precio : precios) {
			preciosAux.add(Utilitaria.aproxima(precio * factor));

		}
		return preciosAux;
	}

}
