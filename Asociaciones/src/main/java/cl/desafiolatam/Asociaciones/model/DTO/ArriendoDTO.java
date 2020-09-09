package cl.desafiolatam.Asociaciones.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.desafiolatam.Asociaciones.model.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArriendoDTO extends VisualObject{
@Autowired
private Arriendo arriendo;
private List<Arriendo> arriendos;

public ArriendoDTO(List<Arriendo> arriendos, String mensaje, String
codigo) {
super(mensaje, codigo);
this.arriendos = arriendos;
}
}
