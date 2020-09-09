package cl.desafiolatam.bodega.model;

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
@SequenceGenerator(name = "SQ_BODEGA", initialValue = 1, allocationSize = 1, sequenceName = "SQ_BODEGA")
public class Bodega {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BODEGA")
	private Integer id;
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bodega")
	private List<Material> listaMateriales;
}