package certificacion.recargo;

import java.util.List;

public interface ConRecargo {
 Double obtenerTotal(List<Double> precios);
 List<Double>aplicarRecargo(List<Double>precios);
}
