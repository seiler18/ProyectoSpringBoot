package cl.desafiolatam.RestVeterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import cl.desafiolatam.RestVeterinaria.model.dto.PetDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_PET", initialValue = 1, allocationSize = 1, sequenceName = "SQ_PET")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PET")
	private Long id;
	private String nombre;
	private String tipo;
	private String dueno;
	private String detalle;
	private String estado;

	public PetDTO toDTO() {
		PetDTO petDTO = new PetDTO();
		petDTO.setId(this.id);
		petDTO.setNombre(this.nombre);
		petDTO.setTipo(this.tipo);
		petDTO.setDueno(this.dueno);
		petDTO.setDetalle(this.detalle);
		petDTO.setEstado(this.estado);

		return petDTO;
	}
}
