package cl.desafiolatam.BibliotecaSpring.service;

import java.util.List;

import cl.desafiolatam.BibliotecaSpring.model.Libro;

public interface LibroService {
	public List<Libro> getLibroList();
	public void borrarLibro(int id);
	public boolean agregarLibro(Libro libro);
}
