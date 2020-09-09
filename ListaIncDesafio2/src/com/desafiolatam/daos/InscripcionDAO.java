package com.desafiolatam.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.desafiolatam.entidades.InscripcionDTO;

public class InscripcionDAO {
	
	/**
	 * Metodo encargado de guardar la inscripcion de un curso
	 * @return Lista formas de pago FormaDePagoDTO
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @autor desafioLatam
	 */
	
	
	
	public int insertarInscripcion(InscripcionDTO dto) throws SQLException, ClassNotFoundException {
		int max = 0;
		//seleccionar el max id inscripcion y le suma 1 para que no de error
		String consultaProximoId = "SELECT MAX (id_inscripcion)+1 AS MAXIMO from pg.inscripcion;";
		
		//Query que insertara el valor 
		String insertarInscripcion = "INSERT INTO pg.inscripcion(\n" + 
				"	id_inscripcion, nombre, telefono, id_curso, id_forma_pago)\n" + 
				"	VALUES (?, ?, ?, ?, ?);";
		

		Class.forName("org.postgresql.Driver");
		Connection conexion = null;
		conexion = DriverManager.getConnection(
		        "jdbc:postgresql://localhost:5432/JS",
		        "postgres", "aiep1234");	
		
		
		try(
				PreparedStatement stmt1 = conexion.prepareStatement(consultaProximoId);
				PreparedStatement stmt2 = conexion.prepareStatement(insertarInscripcion);
				
		   ){
			ResultSet resultado = stmt1.executeQuery();
         if (resultado.next()) {
			max = resultado.getInt("MAXIMO");
			stmt2.setInt(1, max);
			stmt2.setString(2, dto.getNombre());
			stmt2.setString(3, dto.getCelular());
			stmt2.setInt(4, dto.getIdCurso());
			stmt2.setInt(5,dto.getIdFormaDePago());
			
			if(stmt2.executeUpdate() != 1) {
				throw new RuntimeException("A ocurrido un error inesperado");
			}
			
         }
	}catch(Exception ex) {
		ex.printStackTrace();
		throw new RuntimeException("A ocurrido un error inesperado" + ex);
	}

		return max;
	}
	
	
	public List<InscripcionDTO> obtieneInscripciones() throws SQLException, ClassNotFoundException {
		//creamos la lista de objetos que devolveran los resultados
				List<InscripcionDTO> listaDeInscripciones = new ArrayList<InscripcionDTO>();
				
				//creamos la consulta a la base de datos
	String SeleccionarInscripcion = "SELECT * "+ 
			"	FROM pg.inscripcion;";
	
	//conexion a la base de datos y ejecucion de la sentencia
	Class.forName("org.postgresql.Driver");
	Connection conexion = null;
	conexion = DriverManager.getConnection(
	        "jdbc:postgresql://localhost:5432/JS",
	        "postgres", "aiep1234");	
	
	try(PreparedStatement stmt1 = conexion.prepareStatement(SeleccionarInscripcion); ){

		ResultSet resultado = stmt1.executeQuery();
		while(resultado.next()) {
			InscripcionDTO inscripcion = new InscripcionDTO();
			inscripcion.setIdCurso(resultado.getInt("ID_CURSO"));
			inscripcion.setCelular(resultado.getString("TELEFONO"));
			inscripcion.setIdFormaDePago(resultado.getInt("ID_FORMA_PAGO"));
			inscripcion.setIdInsc(resultado.getInt("ID_INSCRIPCION"));
			inscripcion.setNombre(resultado.getString("NOMBRE"));
			listaDeInscripciones.add(inscripcion);
		
		}	
		
	}

	catch(Exception ex) {
		ex.printStackTrace();
	}
	conexion.close();
		return listaDeInscripciones;
	}
	
	
	
	
//public InscripcionDTO BuscarID(int id){
//	InscripcionDTO Buscar = new InscripcionDTO();
//	
//	//creamos la consulta a la base de datos
//String SeleccionarInscripcion = "SELECT * "+ 
//	"	FROM pg.inscripcion WHERE id_inscripcion = "+ id;
//
////conexion a la base de datos y ejecucion de la sentencia
//Class.forName("org.postgresql.Driver");
//Connection conexion = null;
//conexion = DriverManager.getConnection(
//    "jdbc:postgresql://localhost:5432/JS",
//    "postgres", "aiep1234");	
//
//try(PreparedStatement stmt1 = conexion.prepareStatement(SeleccionarInscripcion); ){
//
//ResultSet resultado = stmt1.executeQuery();
//while(resultado.next()) {
//
//	listaDeInscripciones.add(inscripcion);
//
//}	
//
//}
//
//catch(Exception ex) {
//ex.printStackTrace();
//}
//conexion.close();
//	return Buscar;
//	
//}	
}
