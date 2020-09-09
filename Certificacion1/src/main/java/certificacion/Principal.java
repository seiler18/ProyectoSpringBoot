package certificacion;

import java.util.List;

import certificacion.recargo.CalculaPrecios;
import certificacion.recargo.ConRecargo;

public class Principal {
//min 35 video
	public static void main(String[] args) {

		List<Double> precios = Utilitaria.creaListaAleatoria();
		ConRecargo recargo = new CalculaPrecios();
		List<Double> preciosRecargo = recargo.aplicarRecargo(precios);
		Double total = recargo.obtenerTotal(precios);
		System.out.println("Para las siguientes compras" + precios);

		System.out.println("Se generan los siguientes calculos : ");
		System.out.println("Calculo normal, elementos con recargo aplicado " + preciosRecargo);
		System.out.println("Se obtiene un total de :" + total);

	}

}
