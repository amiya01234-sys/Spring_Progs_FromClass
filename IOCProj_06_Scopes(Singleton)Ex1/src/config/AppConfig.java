package config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mart.ston.Printer;

@Configuration
@ComponentScan(basePackages={"sbeans","com.mart"})
public class AppConfig {
	
	@Bean(name="ltime")
	public LocalTime createLTime() {
		return LocalTime.now();
	}
	
	@Bean(name="ldate")
	public LocalDate createLDate(){
		return LocalDate.now();
	}
	
	/*@Bean(name="prn1")
	public Printer print() {
		System.out.println("AppConfig.print()");
		return Printer.getInstance();
	}
	
	@Bean(name="prn2")
	public Printer print2() {
		System.out.println("AppConfig.print2()");
		return Printer.getInstance();
	}
	*/
}
