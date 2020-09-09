package cl.desafiolatam.ControlDestino.model;



import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "SQ_MATERIAL", initialValue = 1, allocationSize = 1, sequenceName = "SQ_MATERIAL")
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MATERIAL")
	private Integer id;
	private String nombre;
	private Integer precio;
	private String fecha;
	
	@ManyToOne
	@JoinColumn(name = "id_bodega", referencedColumnName = "id")
	private Bodega bodega;

}