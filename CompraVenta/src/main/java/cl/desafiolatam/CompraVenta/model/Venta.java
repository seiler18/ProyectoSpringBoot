package cl.desafiolatam.CompraVenta.model;



import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import cl.desafiolatam.CompraVenta.model.dto.VentaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "SQ_VENTA", initialValue = 1, allocationSize = 1, sequenceName = "SQ_VENTA")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_VENTA")

	private Integer id; // ● IDCompra
	private String fecha; // ● Fecha
	private String MontoTotal; // ● Monto de compra
	
	public VentaDTO toDTO() {
		VentaDTO ventaDTO = new VentaDTO();
		ventaDTO.setFecha(this.fecha);
		ventaDTO.setId(this.id);
		ventaDTO.setMontoTotal(this.MontoTotal);
		ventaDTO.setCliente(this.cliente);
		ventaDTO.setProductos(this.productos);
		return ventaDTO;
	}
	//OK LA RELACION FUNCIONA
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private Cliente cliente;
	//OK LA RELACION FUNCIONA
	@OneToMany
	private List<Producto>productos;
}