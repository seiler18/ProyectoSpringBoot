package jesus.entrenamiento.delegate;

import java.util.List;

import jesus.entrenamiento.dao.impl.ClienteDaoImpl;
import jesus.entrenamiento.model.Cliente;



public interface ClienteDelegate {

	public List<Cliente> consultaCliente(String rut);
	
	public static List<Cliente> crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return ClienteDaoImpl.getListaClienteDummy();
	}
//	public static List<Cliente> consultaCliente() {
//		// TODO Auto-generated method stub
//		return ClienteDaoImpl.getListaClienteDummy(); //fingiendo una conexion
//	}
	public static List<Cliente> consultaCliente2() {
		// TODO Auto-generated method stub
		return ClienteDaoImpl.consultaCliente2(); //conectando base de datos
	}


	
	
}
