package cl.desafiolatam.ControlDestino.model;

import javax.persistence.*;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "SQ_DESTINO", initialValue = 1, allocationSize = 1, sequenceName = "SQ_DESTINO")
public class Destino {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DESTINO")
	private Integer id; // ● ID
	private String ciudad; // ● Ciudad
	private String pais; // ● Pais
	private String fecha;// ● Fecha
	
	@ManyToOne
	@JoinColumn(name = "pasajero_id", referencedColumnName = "id")
	private Pasajero pasajero;

}
