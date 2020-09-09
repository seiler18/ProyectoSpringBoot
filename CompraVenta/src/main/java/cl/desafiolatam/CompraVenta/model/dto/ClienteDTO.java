package cl.desafiolatam.CompraVenta.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
	private Integer id; // ● ID
	private String rut; // ● RUT
	private String nombre; // ● Nombre
	private String apellido;// ● Apellido
	private Integer edad;// ● Edad
}
