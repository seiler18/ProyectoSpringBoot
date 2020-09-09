package cl.desafiolatam.CompraVenta.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
	private Integer id; // ● IDProducto
	private String nombre;  // ● NombreProducto
	private Integer precio; // ● PrecioProducto
}
