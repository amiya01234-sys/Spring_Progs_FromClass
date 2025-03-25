package config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="sbeans")
public class AppConfig {
	
	@Bean(name="ltime")
	public LocalTime createLTime() {
		return LocalTime.now();
	}
	
	@Bean(name="ldate")
	public LocalDate createLDate(){
		return LocalDate.now();
	}
	
}
