package cl.desafiolatam.ControlDestino.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class LoginConfig extends WebSecurityConfigurerAdapter {

		/* se crean 2 usuarios en memoria en método configure */
		@Override
		public void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("jesus").password(passwordEncoder().encode("seiler")).roles("BODEGA");
			auth.inMemoryAuthentication().withUser("enrique").password(passwordEncoder().encode("seiler")).roles("BODEGA");
		}

		@Override
		public void configure(HttpSecurity http) throws Exception {
			http.csrf().disable().authorizeRequests().antMatchers("/login").permitAll()
			.anyRequest().authenticated()
					.and().formLogin().loginPage("/login").failureUrl("/login?error=true")
					.usernameParameter("usuario").passwordParameter("password").defaultSuccessUrl("/SistemaPasajero").
					and().logout()
					.logoutSuccessUrl("/cerrarSesion").permitAll();
		}

		/* Se inicializa bean de encoder de contraseñas */
		@Bean
		public BCryptPasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
	}

