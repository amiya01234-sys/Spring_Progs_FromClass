package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="sbeans")
//@PropertySource("commons/info.properties")
@ImportResource("cfgs/applicationContext.xml")
public class AppConfig {

}
