package cl.desafiolatam.ControlDestino.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "SQ_PASAJERO", initialValue = 1, allocationSize = 1, sequenceName = "SQ_ARRIENDO")
public class Pasajero {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PASAJERO")

	private Integer id; // ● ID
	private String rut; // ● RUT
	private String nombre; // ● Nombre
	private String apellido;// ● Apellido
	private Integer edad;// ● Edad
	private String ciudadNatal;// ● CiudadNatal
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pasajero")
	private List<Destino> destinos;

}
