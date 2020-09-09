package cl.desafiolatam.BibliotecaSpring.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.desafiolatam.BibliotecaSpring.model.Libro;
import cl.desafiolatam.BibliotecaSpring.service.LibroService;

@Component("libroFacade")
public class LibroFacadeImpl implements LibroFacade {
	
	
	@Autowired
	private LibroService libroService;
	
	public List<Libro> getLibroList() {
		
		return libroService.getLibroList();
	}

	
	public void borrarLibro(Integer id_libro) {
		
		libroService.borrarLibro(id_libro);
	}

	
	public boolean agregarLibro(Libro libro) {
		
		return libroService.agregarLibro(libro);
	}



}
