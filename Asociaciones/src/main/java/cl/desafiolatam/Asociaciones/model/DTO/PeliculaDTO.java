package cl.desafiolatam.Asociaciones.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import cl.desafiolatam.Asociaciones.model.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PeliculaDTO extends VisualObject {
private List<Pelicula> peliculas;
public PeliculaDTO(List<Pelicula> peliculas, String mensaje, String
codigo) {
super(mensaje, codigo);
this.peliculas = peliculas;
}
}