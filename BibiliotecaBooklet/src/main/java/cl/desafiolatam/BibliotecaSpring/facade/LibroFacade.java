package cl.desafiolatam.BibliotecaSpring.facade;

import java.util.List;

import cl.desafiolatam.BibliotecaSpring.model.Libro;

public interface LibroFacade {
	public List<Libro> getLibroList();
	public void borrarLibro(Integer id_libro);
	public boolean agregarLibro(Libro libro);
}
