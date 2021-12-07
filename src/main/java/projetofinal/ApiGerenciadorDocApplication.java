package projetofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableCaching
@EnableSwagger2
public class ApiGerenciadorDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGerenciadorDocApplication.class, args);
	}

}
