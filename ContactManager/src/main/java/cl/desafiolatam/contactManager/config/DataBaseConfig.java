package cl.desafiolatam.contactManager.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:database.properties")
public class DataBaseConfig {
	@Autowired
	Environment environment;
	
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverDataSource = new DriverManagerDataSource();
		driverDataSource.setUrl(environment.getProperty("url"));
		driverDataSource.setUsername(environment.getProperty("dbuser"));
		driverDataSource.setPassword(environment.getProperty("dbpassword"));
		driverDataSource.setDriverClassName(environment.getProperty("driver"));
		return driverDataSource;
		
	}

}
