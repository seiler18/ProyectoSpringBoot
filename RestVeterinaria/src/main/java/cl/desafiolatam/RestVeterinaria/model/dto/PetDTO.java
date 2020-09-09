package cl.desafiolatam.RestVeterinaria.model.dto;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetDTO {

	private Long id;
	private String nombre;
	private String tipo;
	private String dueno;
	private String detalle;
	private String estado;
}
