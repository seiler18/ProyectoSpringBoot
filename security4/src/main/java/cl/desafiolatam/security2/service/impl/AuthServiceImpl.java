package cl.desafiolatam.security2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import cl.desafiolatam.security2.dao.UsuarioRepository;
import cl.desafiolatam.security2.dao.model.Users;
import cl.desafiolatam.security2.service.UserService;

@SessionScope
@Service
public class AuthServiceImpl implements UserDetailsService, UserService{
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	private Users usuario = null;
	@Override
	public UserDetails loadUserByUsername(String email) throws	UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<Users> listaUsuario = usuarioRepository.findByEmail(email);
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
	public Users getUsuarioConectado() {
		// TODO Auto-generated method stub
		return this.usuario;
	}

	@Override
	public void setUsuarioConectado(String sessionUserName) {
		// TODO Auto-generated method stub
		List<Users> listaUsuario = usuarioRepository.findByEmail(sessionUserName);
		this.usuario = listaUsuario.get(0);
	}
	
	

}
