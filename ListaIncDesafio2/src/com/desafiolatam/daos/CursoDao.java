package com.desafiolatam.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.entidades.CursoDTO;

public class CursoDao {
	
	/**
	 * Metodo encargado de obtener todos los cursos disponibles
	 * @return Lista de cursos CursoDTO
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @autor developer
	 */
	public List<CursoDTO> obtieneCursos() throws SQLException, ClassNotFoundException {
		
		//creamos la lista de objetos que devolveran los resultados
		List<CursoDTO> listaDeCursos = new ArrayList<CursoDTO>();
		
		//creamos la consulta a la base de datos
		String consultaSql = " SELECT id_curso, descripcion, precio\n" + 
				"	FROM pg.curso;";
		
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
				CursoDTO cursoDto = new CursoDTO();
				cursoDto.setIdCurso(resultado.getInt("ID_CURSO"));
				cursoDto.setDescripcion(resultado.getString("DESCRIPCION"));
				cursoDto.setPrecio(resultado.getDouble("PRECIO"));
				listaDeCursos.add(cursoDto);
			}	
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return listaDeCursos;
	}
}
