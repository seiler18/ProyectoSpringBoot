package cl.desafiolatam.ControlDestino.model.DTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.desafiolatam.ControlDestino.model.Destino;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DestinoDTO extends VisualObject{
@Autowired
private Destino destino;
private List<Destino> destinos;

public DestinoDTO(List<Destino> destinos, String mensaje, String
codigo) {
super(mensaje, codigo);
this.destinos = destinos;
}
}
