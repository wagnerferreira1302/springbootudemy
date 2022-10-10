package io.github.wagnerferreira1302;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {
   "io.github.wagnerferreira1302",
   "io.github.wagnerferreira1302.repository",
   "io.github.wagnerferreira1302.service"
})
public class VendasApplication {
	
	@Cachorro
	private Animal animal;
	
	@Autowired
	//@Bean(value = "executarAnimal")
	@Qualifier(value = "executarAnimal")
	public CommandLineRunner executar() {
		return args -> {
			animal.fazerBarulho();
		};
	}
	
	public static void main(String[] args) {
       SpringApplication.run(VendasApplication.class, args);
	}
	
	@Value("${application.name}")
	public String applicationName;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return applicationName;
	}
}
