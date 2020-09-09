package cl.desafiolatam.Asociaciones.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="SQ_PELICULA", initialValue=1, allocationSize=1, sequenceName="SQ_PELICULA")
public class Pelicula {
@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE,
generator="SQ_PELICULA")
private Integer id;
private String titulo;
private String descripcion;
private Integer duracion;
}
