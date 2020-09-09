package cl.desafiolatam.CompraVentaFront.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/* se crean 2 usuarios en memoria en método configure */
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("jesus").password(passwordEncoder().encode("seiler")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("enrique").password(passwordEncoder().encode("seiler")).roles("USER");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/user/**")
				.hasRole("USER").antMatchers("/login").permitAll().anyRequest().authenticated().and().formLogin()
				.loginPage("/login").successHandler(customAuthenticationSuccessHandler())
				.failureUrl("/login?error=true").usernameParameter("usuario").passwordParameter("password")
				.and().exceptionHandling().accessDeniedPage("/recurso-prohibido").and().logout()
				.logoutSuccessUrl("/cerrarSesion").permitAll();

	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationSuccessHandler customAuthenticationSuccessHandler() {
		return new CustomAuthenticationSuccessHandler();
	}
}
//
//@Bean
//public UserDetailsService userDetailsService() {
//	return new AuthServiceImpl();
//}
