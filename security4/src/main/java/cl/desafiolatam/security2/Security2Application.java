package cl.desafiolatam.security2;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import cl.desafiolatam.security2.dao.RoleRepository;
import cl.desafiolatam.security2.dao.UsuarioRepository;
import cl.desafiolatam.security2.dao.model.Role;
import cl.desafiolatam.security2.dao.model.Users;

@SpringBootApplication
@ComponentScan("cl.desafiolatam.security2.*")
public class Security2Application {
	private final static Logger logger = Logger.getLogger(Security2Application.class);
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Security2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demoUsuario() {
		return (args) -> {
//			Users usuarioAdmin1 = new Users();
//			Role roleAdmin = new Role();
//			
//			roleAdmin.setIdRole(null);
//			roleAdmin.setRoleName("ADMIN");
//			
//			
//			List<Users> listaUsuariosAdmin = new ArrayList<Users>();
//			
//			usuarioAdmin1.setId_usuario(null);
//			usuarioAdmin1.setNombre("Alexander Beck");
//			usuarioAdmin1.setEmail("a@b.com");
//			usuarioAdmin1.setPassword("qwer1234");
//			usuarioAdmin1.setRole(roleAdmin);
//			
//			listaUsuariosAdmin.add(usuarioAdmin1);
//			
//			roleAdmin.setListaUsuarios(listaUsuariosAdmin);
//			
//			
//			roleRepository.save(roleAdmin);
			
//			Users usuarioUser1 = new Users();
//			Role roleUser = new Role();
//			
//			roleUser.setIdRole(null);
//			roleUser.setRoleName("USER");
//			
//			
//			List<Users> listaUsuariosUser = new ArrayList<Users>();
//			
//			usuarioUser1.setId_usuario(null);
//			usuarioUser1.setNombre("Oliver Beck");
//			usuarioUser1.setEmail("b@b.com");
//			usuarioUser1.setPassword("1234");
//			usuarioUser1.setRole(roleUser);
//			
//			listaUsuariosUser.add(usuarioUser1);
//			
//			roleUser.setListaUsuarios(listaUsuariosUser);
//			
//			
//			roleRepository.save(roleUser);
			
		};
	}

}
