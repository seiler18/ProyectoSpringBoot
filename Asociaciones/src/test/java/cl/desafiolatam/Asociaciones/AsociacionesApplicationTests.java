package cl.desafiolatam.Asociaciones;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.desafiolatam.Asociaciones.model.Arriendo;
import cl.desafiolatam.Asociaciones.model.Cliente;
import cl.desafiolatam.Asociaciones.model.Pelicula;
import cl.desafiolatam.Asociaciones.repository.ArriendoRepository;
import cl.desafiolatam.Asociaciones.repository.ClienteRepository;
import cl.desafiolatam.Asociaciones.repository.PeliculaRepository;

@SpringBootTest
class AsociacionesApplicationTests {
@Autowired
private ArriendoRepository arriendoRepository;
@Autowired
PeliculaRepository peliculaRepository;
@Test
private void validaRepositoriosCreandoPeliculaYArriendo() {
//nueva pelicula
Pelicula spaceOdyssey = new Pelicula(null,"2001: A Space Odyssey",
"After discovering a mysterious artifact buried " +
"beneath the Lunar surface, mankind sets off on a " +
"quest to find its origins with help from intelligentsupercomputer H.A.L. 9000." ,
149);
//nuevo arriendo
Arriendo arriendo = new Arriendo(null, "11/20/2019", 7,
spaceOdyssey, null);
//guardar arriendo
arriendoRepository.save(arriendo);
//buscar arriendo
Arriendo arriendoOd = arriendoRepository.findById(1).get();
//valida que exista
Assertions.assertNotNull(arriendoOd);
}
}

@SpringBootTest
class AsociacionesApplicationTests1 {
@Autowired
private
ArriendoRepository arriendoRepository;
@Autowired
private ClienteRepository clienteRepository;
@Test
public void validandoDatos() {
// Instanciamos las tres clases.
Pelicula pelicula = new Pelicula();
Cliente cliente = new Cliente();
Arriendo arriendo = new Arriendo();
// Guardamos al cliente en base de datos para generar su ID.
cliente.setNombre("Juan");
cliente = clienteRepository.save(cliente);
// Asignamos un estado a la pelicula
pelicula.setDescripcion("Buena pelicula");
pelicula.setDuracion(160);
pelicula.setTitulo("El cuadro");
// Asignamos un estado al arriendo
arriendo.setDuracion(10);
arriendo.setInicio("11/12/2019");
arriendo.setPelicula(pelicula);
// Le asignamos al cliente previamente creado.
arriendo.setCliente(cliente);
// Guardamos la pelicula y el arriendo
arriendo = arriendoRepository.save(arriendo);

}

}