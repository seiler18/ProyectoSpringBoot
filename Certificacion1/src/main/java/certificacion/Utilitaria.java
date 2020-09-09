package certificacion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utilitaria {

	private Utilitaria () {
		
	}
	//crea los precios
	public static List<Double>creaListaAleatoria(){
		Random r = new Random();
		List<Double>precios= new ArrayList<>();
		for (int i = 0; i < 10; i++) 
			precios.add((double)r.nextInt(7000));
			return precios;
		}
	
	//reduce decimales
	public static Double aproxima(Double val) {
		return new BigDecimal(val.toString()).setScale(2,RoundingMode.HALF_UP).doubleValue();
	}
	
	}

