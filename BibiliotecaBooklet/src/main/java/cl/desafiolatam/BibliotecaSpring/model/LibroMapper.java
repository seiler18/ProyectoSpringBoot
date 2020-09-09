package cl.desafiolatam.BibliotecaSpring.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LibroMapper implements RowMapper<Libro>{

	@Override
	public Libro mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Libro libro = new Libro();
		libro.setId_libro(rs.getInt("id_libro"));
		libro.setTitulo(rs.getString("titulo"));
		libro.setAutor(rs.getString("autor"));
		libro.setImprenta(rs.getString("imprenta"));
		libro.setAnio(rs.getInt("anio"));
		libro.setDisponibilidad(rs.getBoolean("disponibilidad"));
		
		return libro;
	}

}
