package cl.desafiolatam.ControlDestino.model.DTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.desafiolatam.ControlDestino.model.Pasajero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PasajeroDTO extends VisualObject{
	
@Autowired
private Pasajero pasajero;
private List<Pasajero> pasajeros;

public PasajeroDTO(List<Pasajero> pasajeros, String mensaje, String
codigo) {
super(mensaje, codigo);
this.pasajeros = pasajeros;
}
}