package com.desafiolatam.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.desafiolatam.entidades.FormaDePagoDTO;

public class FormaDePagoDAO {
	
	/**
	 * Metodo encargado de obtener todas las formas de pago
	 * @return Lista formas de pago FormaDePagoDTO
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @autor desafioLatam
	 */
	
	
	public List<FormaDePagoDTO> obtieneFormasDePago() throws SQLException, ClassNotFoundException {
		
		//creamos la lista de objetos que devolveran los resultados
		List<FormaDePagoDTO> listaDeCursos = new ArrayList<FormaDePagoDTO>();
		
		//creamos la consulta a la base de datos
		String consultaSql = "SELECT id_forma_pago, descripcion, recargo\n" + 
				"	FROM pg.forma_pago;";
		
		//conexion a la base de datos y ejecucion de la sentencia
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection conexion = null;
//		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
//		conexion = DriverManager.getConnection(url,"Empresa_DB","empresa");
		
		Class.forName("org.postgresql.Driver");
		Connection conexion = null;
		conexion = DriverManager.getConnection(
		        "jdbc:postgresql://localhost:5432/JS",
		        "postgres", "aiep1234");	
		
		try(PreparedStatement stmt = conexion.prepareStatement(consultaSql)){
	
			ResultSet resultado = stmt.executeQuery();
			while(resultado.next()) {
				FormaDePagoDTO formaPago = new FormaDePagoDTO();
				formaPago.setIdFormaDePago(resultado.getInt("ID_FORMA_PAGO"));
				formaPago.setDescripcion(resultado.getString("DESCRIPCION"));
				formaPago.setRecargo(resultado.getString("RECARGO"));
				listaDeCursos.add(formaPago);
			}	
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return listaDeCursos;
	}
}
