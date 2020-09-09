package cl.desafiolatam.CompraVentaFront.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import cl.desafiolatam.CompraVentaFront.model.User;
import cl.desafiolatam.CompraVentaFront.repository.UserRepository;


@SessionScope
@Service
public class AuthServiceImpl implements UserDetailsService, UserService{
	@Autowired
	UserRepository userRepository;

	private User usuario = null;
	@Override
	public UserDetails loadUserByUsername(String email) throws	UsernameNotFoundException {
		
		List<User> listaUsuario = userRepository.findByEmail(email);
		UserBuilder builder = null;
		
		if (listaUsuario == null || listaUsuario.size() != 1) 
			throw new UsernameNotFoundException(email);
		else {
			this.usuario = listaUsuario.get(0);
			builder = org.springframework.security.core.userdetails.User.withUsername(usuario.getEmail());
		    builder.password(new BCryptPasswordEncoder().encode(usuario.getPassword()));
		    String[] roles = {usuario.getRole().getRoleName()};
		    builder.roles(roles);
		}
		
		return builder.build();
		
//		List<GrantedAuthority> authorities = new ArrayList<>();
//		authorities.add(new	SimpleGrantedAuthority(usuario.getRole()));
//		return new User(usuario.getEmail(),	usuario.getPassword(), authorities);

		
		
	}
	
	@Override
	public User getUsuarioConectado() {
		
		return this.usuario;
	}

	@Override
	public void setUsuarioConectado(String sessionUserName) {
		
		List<User> listaUsuario = userRepository.findByEmail(sessionUserName);
		this.usuario = listaUsuario.get(0);
	}
	
	

}
