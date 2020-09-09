package cl.desafiolatam.CompraVenta;




import org.junit.runner.RunWith;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
class CompraVentaApplicationTests {

	
	
//	@Autowired
//	private ClienteRepository clienteRepository;
//    private static final Cliente cliente = new Cliente();
//    @BeforeAll
//    static void fixture() {
//        usuario = new UsuarioEntity();
//        usuario.setNombre(faker.name().name());
//        usuario.setCorreo(faker.internet().emailAddress());
//        usuario.setContrasenia(faker.internet().password());
//        usuarioVo = new UsuarioVo();
//        usuarioVo.setUsuario(usuario);
//    }
//    @Test
//    @DisplayName("Prueba de registro de un usuario en el sistema")
//    public void pruebaDeRegistro() {
//        // capturo el largo de la lista usuarios
//        int largoInicial = servicio.obtenerUsuarios().getUsuarios().size();
//        // ingreso un usuario
//        servicio.registrarUsuario(usuarioVo);
//        // compruebo si el largo de la lista aumentó en 1
//        assertEquals(largoInicial + 1, servicio.obtenerUsuarios().getUsuarios().size());
//    }
//    @Test
//    @DisplayName("Prueba si obtenemos un usuario por su id")
//    public void pruebaDeTraerUsuarioPorId() {
//        
//        assertTrue(true);
//    }
//    @Test
//    @DisplayName("Prueba si podemos actualizar el usuario por su ID")
//    public void pruebaActualizarUsuarioPorId() {
//        assertTrue(true);
//    }
//    @Test
//    @DisplayName("Prueba si podemos ingresar al sistema")
//    public void pruebaDeIngresoAlSistema() {
//        
//        assertTrue(true);
//    }
//    @Test
//    @DisplayName("Prueba si podemos setear un visual object por defecto, para la lista de usuarios")
//    public void pruebaDeLlenadoVo() {
//        
//        assertTrue(true);
//    }
//    @Test
//    @DisplayName("Prueba si se listan los usuarios del sistemas")
//    public void pruebaListarUsuarios() {
//        assertTrue(true);
//    }
//    @Test
//    @DisplayName("Prueba si podemos eliminar el usuario por su ID")
//    public void pruebaEliminarUsuarioPorId() {
//        assertTrue(true);
//    }
//}
//	
	
//	@Autowired
//	private TestEntityManager entityManager;
//
//	@Autowired
//	private ClienteRepository clienteRepository;

//	@Test
//	public void whenFindByName_thenReturnCliente() {
//		// given
//		Cliente cliente = new Cliente();
//		cliente.setId(1);
//		cliente.setNombre("Jesus");
//		cliente.setApellido("Seiler");
//		cliente.setEdad(26);
//		cliente.setRut("26439663-8");
//		cliente.setVentas(null);
//		Venta ventas = new Venta();
//		ventas.setId(1);
//		ventas.setCliente(cliente);
//		ventas.setFecha("23/12/2020");
//		ventas.setMontoTotal("43000");
//		Producto productos = new Producto();
//		productos.setId(1);
//		productos.setNombre("Leche");
//		productos.setPrecio(30000);
//		productos.setVentas(ventas);
//		entityManager.persist(cliente);
//		entityManager.flush();

//		   // when
//	    Cliente found = clienteRepository.findById(cliente.getId());
//	 
//	    // then
//	    assertThat(found, cliente)
//	      .isEqualTo(cliente.getId());

}
