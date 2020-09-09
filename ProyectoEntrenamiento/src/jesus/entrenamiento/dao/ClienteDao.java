package jesus.entrenamiento.dao;

import java.util.List;

import jesus.entrenamiento.model.Cliente;

public interface ClienteDao {
	public List<Cliente> consultaCliente();
	public List<Cliente> consultaCliente(String rut);
	public List<Cliente> crearCliente(Cliente cliente);

}
