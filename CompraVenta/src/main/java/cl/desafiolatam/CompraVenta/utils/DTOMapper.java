package cl.desafiolatam.CompraVenta.utils;


import cl.desafiolatam.CompraVenta.model.Cliente;
import cl.desafiolatam.CompraVenta.model.Producto;
import cl.desafiolatam.CompraVenta.model.Venta;
import cl.desafiolatam.CompraVenta.model.dto.ClienteDTO;
import cl.desafiolatam.CompraVenta.model.dto.ProductoDTO;
import cl.desafiolatam.CompraVenta.model.dto.VentaDTO;


public class DTOMapper {
	private DTOMapper() {
	}

//CLIENTE
	private static void toEntity(ClienteDTO clienteDTO, Cliente cliente) {
	cliente.setId(clienteDTO.getId());
	cliente.setRut(clienteDTO.getRut());
	cliente.setNombre(clienteDTO.getNombre());
	cliente.setApellido(clienteDTO.getApellido());
	cliente.setEdad(clienteDTO.getEdad());

	}

	public static Cliente toEntity(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		toEntity(clienteDTO, cliente);
		return cliente;
	}
	
//	PRODUCTO
	private static void toEntity(ProductoDTO productoDTO, Producto producto) {
		producto.setId(productoDTO.getId());
		producto.setNombre(productoDTO.getNombre());
		producto.setPrecio(productoDTO.getPrecio());

	}

	public static Producto toEntity(ProductoDTO productoDTO) {
		Producto producto = new Producto();
		toEntity(productoDTO, producto);
		return producto;
	}
	
//	VENTA
	
	private static void toEntity(VentaDTO ventaDTO, Venta venta) {
		venta.setFecha(ventaDTO.getFecha());
		venta.setId(ventaDTO.getId());
		venta.setMontoTotal(ventaDTO.getMontoTotal());
		venta.setCliente(ventaDTO.getCliente());
		venta.setProductos(ventaDTO.getProductos());
	}

	public static Venta toEntity(VentaDTO ventaDTO) {
		Venta venta = new Venta();
		toEntity(ventaDTO, venta);
		return venta;
	}
	
}
