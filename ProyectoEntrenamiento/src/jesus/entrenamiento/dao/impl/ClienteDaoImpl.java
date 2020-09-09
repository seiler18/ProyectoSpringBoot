package jesus.entrenamiento.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import jesus.entrenamiento.dao.ClienteDao;
import jesus.entrenamiento.model.Cliente;

public class ClienteDaoImpl implements ClienteDao {

	@Override
	public List<Cliente> consultaCliente(String rut) {
		// no lo he usado de momento 
		return null;
	}

	//para probar la consulta de datos con una consulta ficticia
	public static List<Cliente> getListaClienteDummy(){
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1 = crearCliente("Jesus","Seiler", "26.439.663-8");
		cliente2 = crearCliente("Jose","Enrique", "28.439.663-8");
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		
		return listaClientes;
	}
	
	
	public static Cliente crearCliente(String nombre,String apellido,String rut) {
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setRut(rut);
		cliente.addListaClientes();
		return cliente;
		
	}
	
	@Override
	public List<Cliente> crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return getListaClienteDummy();
	}


	public static List<Cliente> consultaCliente2() {
		List<Cliente> listaClientes2 = null;
		try { 
				    Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException ex) {
				    System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
				}
				
				Connection connection = null;
				Statement st = null;
				// Database connect
				// Conectamos con la base de datos
				try {
					connection = DriverManager.getConnection(
					        "jdbc:postgresql://localhost:5432/Entrenamiento",
					        "postgres", "aiep1234");
					
					boolean valid = connection.isValid(50000);
		            System.out.println(valid ? "TEST OK" : "TEST FAIL");
		            st = connection.createStatement();
		            listaClientes2= new ArrayList<Cliente>();
		            
		            ResultSet rs = st.executeQuery( ""
		                    + "SELECT \"id_cliente\",\"nombre\", \"apellido\", \"rut\" "
		                    + "FROM \"Entrenamientos\".\"Cliente\";");
		            	System.out.println("Registros: " + rs.getFetchSize());
		            	
		            	int c=0;
		            	
		            	while    ( rs.next() ) {
		                    String rut= rs.getString("rut");
		                    String nombre= rs.getString("Nombre");
		                    String apellido = rs.getString("apellido");
		                    Cliente cliente = new Cliente();
		                    cliente.setRut(rut);
		                    cliente.setNombre(nombre);
		                    cliente.setApellido(apellido);
		                    listaClientes2.add(cliente);
		                    System.out.println( " RUT: " + rut );
		                  System.out.println( " NOMBRE: " + nombre );
		                  System.out.println( " APELLIDO: " + apellido );
		                  System.out.println();
		                }
		                rs.close();
		                st.close();
		                connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return listaClientes2;
		//return getListaClienteDummy();
			}

	@Override
	public List<Cliente> consultaCliente() {
		// TODO Auto-generated method stub
		return null;
	}



}
