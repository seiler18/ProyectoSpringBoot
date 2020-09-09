package cl.desafiolatam.CompraVenta.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import cl.desafiolatam.CompraVenta.model.dto.ProductoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "SQ_PRODUCTO", initialValue = 1, allocationSize = 1, sequenceName = "SQ_PRODUCTO")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUCTO")

	private Integer id; // ● IDProducto
	private String nombre;  // ● NombreProducto
	private Integer precio; // ● PrecioProducto
	
	public ProductoDTO toDTO() {
		ProductoDTO productoDTO = new ProductoDTO();
		productoDTO.setId(this.id);
		productoDTO.setNombre(this.nombre);
		productoDTO.setPrecio(this.precio);
		return productoDTO;
	}
	//OK LA RELACION FUNCIONA	
@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
private List<Venta>ventas;
	
}
