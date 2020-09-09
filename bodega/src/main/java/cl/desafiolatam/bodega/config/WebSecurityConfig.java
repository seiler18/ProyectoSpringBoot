package cl.desafiolatam.bodega.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.RequestMethod;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("user11").password(passwordEncoder().encode("usuario1")).roles("BODEGA");

		auth.inMemoryAuthentication().withUser("user22").password(passwordEncoder().encode("usuario2")).roles("BODEGA");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		http.csrf().disable().authorizeRequests()
											//.antMatchers("/admin/**").hasRole("ADMIN")
											.antMatchers("/user/**").hasRole("BODEGA")
											.antMatchers("/login").permitAll()
																.anyRequest()
																.authenticated()
																.and().formLogin()
																.loginPage("/login").failureUrl("/login?error=true")
																.usernameParameter("email")
																.passwordParameter("password")
																.defaultSuccessUrl("/validate")
																.and().exceptionHandling()
																.accessDeniedPage("/recurso-prohibido");
		
		
		
		
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
