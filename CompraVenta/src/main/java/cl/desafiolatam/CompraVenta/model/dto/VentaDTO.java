package cl.desafiolatam.CompraVenta.model.dto;

import java.util.List;

import cl.desafiolatam.CompraVenta.model.Cliente;
import cl.desafiolatam.CompraVenta.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentaDTO {
	private Integer id; // ● IDCompra
	private String fecha; // ● Fecha
	private String MontoTotal; // ● Monto de compra
	private Cliente cliente; // ● Cliente de compra
	private List<Producto>productos;
}
