package cl.desafiolatam.ControlDestino.model;

import java.util.List;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "SQ_BODEGA", initialValue = 1, allocationSize = 1, sequenceName = "SQ_BODEGA")
public class Bodega {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BODEGA")
	private Integer id; // ● IDBodega
	private String nombre; // ● Nombre de la bodega

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bodega")
	private List<Material> listaMateriales;
}
