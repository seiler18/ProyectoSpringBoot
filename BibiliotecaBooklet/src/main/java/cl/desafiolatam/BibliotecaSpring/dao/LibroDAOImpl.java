package cl.desafiolatam.BibliotecaSpring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.BibliotecaSpring.model.Libro;
import cl.desafiolatam.BibliotecaSpring.model.LibroMapper;

@Repository ("libroDAO")
public class LibroDAOImpl implements LibroDAO{
	@Autowired
	private Libro libro;
	@Autowired
	private List<Libro>listaLibros;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Libro> getLibroList() {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.query("SELECT id_libro, titulo, anio, autor, imprenta, disponibilidad\r\n" + 
				"	FROM public.libro;", new LibroMapper());
	}

	@Override
	public void borrarLibro(Integer id_libro) {
		jdbcTemplate.update("DELETE FROM public.libro\r\n" + 
				"	WHERE id_libro=?;",id_libro);
	}
	

	@Override
	public boolean agregarLibro(Libro libro) {
		int resultado = jdbcTemplate.update("INSERT INTO public.libro(\r\n" + 
				"	 titulo, anio, autor, imprenta, disponibilidad)\r\n" + 
				"	VALUES (?, ?, ?, ?, ?);",libro.getTitulo(),libro.getAnio(),libro.getAutor(),libro.getImprenta(),libro.isDisponibilidad());
		return resultado==1?true:false;
	}

}
