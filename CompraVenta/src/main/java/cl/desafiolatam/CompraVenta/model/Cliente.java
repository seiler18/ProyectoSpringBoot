package cl.desafiolatam.CompraVenta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import cl.desafiolatam.CompraVenta.model.dto.ClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "SQ_CLIENTE", initialValue = 1, allocationSize = 1, sequenceName = "SQ_CLIENTE")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CLIENTE")

	private Integer id; // ● ID
	private String rut; // ● RUT
	private String nombre; // ● Nombre
	private String apellido;// ● Apellido
	private Integer edad;// ● Edad
	
	public ClienteDTO toDTO() {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setId(this.id);
		clienteDTO.setRut(this.rut);
		clienteDTO.setNombre(this.nombre);
		clienteDTO.setApellido(this.apellido);
		clienteDTO.setEdad(this.edad);
		return clienteDTO;
	}
	//OK LA RELACION FUNCIONA
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Venta> ventas;

}
