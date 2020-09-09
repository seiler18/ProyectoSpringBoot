package cl.desafiolatam.BibliotecaSpring.dao;

import java.util.List;

import cl.desafiolatam.BibliotecaSpring.model.Libro;



public interface LibroDAO {
	public List<Libro> getLibroList();
	public void borrarLibro(Integer id_libro);
	public boolean agregarLibro(Libro libro);
}
