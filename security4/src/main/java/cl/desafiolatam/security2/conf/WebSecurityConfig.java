package cl.desafiolatam.security2.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import cl.desafiolatam.security2.service.impl.AuthServiceImpl;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		// ferris@mail.com - crab USER
		// haskell@mail.com - curry ADMIN

//		auth.inMemoryAuthentication().withUser("alien").password(passwordEncoder().encode("qwer1234")).roles("ADMIN");
//
//		auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("1234")).roles("USER");

		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
//		http.csrf().disable().authorizeRequests().antMatchers("/login").permitAll() //Lo permite en al acceder
//												.anyRequest().authenticated()
//												.and().formLogin().loginPage("/login") //Forward al controller
//												.failureUrl("/login?error=true")
//												.usernameParameter("email")
//												.passwordParameter("password")
//												.defaultSuccessUrl("/"); //Si eta bien, se va a dicha url especificada

		http.csrf().disable().authorizeRequests().antMatchers("/admin/**")
												.hasRole("ADMIN")
												.antMatchers("/user/**")
												.hasRole("USER")
												.antMatchers("/login")
												.permitAll()
												.anyRequest()
												.authenticated()
												.and()
												.formLogin()
												.loginPage("/login")
												.successHandler(customAuthenticationSuccessHandler())
												.failureUrl("/login?error=true")
												.usernameParameter("email")
												.passwordParameter("password")
												// .defaultSuccessUrl("/user")
												.and()
												.exceptionHandling()
												.accessDeniedPage("/recurso-prohibido");

	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationSuccessHandler customAuthenticationSuccessHandler() {
		return new CustomAuthenticationSuccessHandler();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		return new AuthServiceImpl();
	};

}
