package cl.desafiolatam.BibliotecaSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.BibliotecaSpring.dao.LibroDAO;
import cl.desafiolatam.BibliotecaSpring.model.Libro;

@Service("libroService")
public class LibroServiceImpl implements LibroService {
	@Autowired
	private List<Libro>listaLibros;
	@Autowired
	private LibroDAO libroDAO;
	@Autowired
	
	@Override
	public List<Libro> getLibroList() {
		// TODO Auto-generated method stub
		return libroDAO.getLibroList();
	}

	@Override
	public void borrarLibro(int libro) {
	 libroDAO.borrarLibro(libro);
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean agregarLibro(Libro libro) {
		// TODO Auto-generated method stub
		return libroDAO.agregarLibro(libro);
	}

}
