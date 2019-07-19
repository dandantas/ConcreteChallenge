package dantasmaarotti.challenge.Concrete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ConcreteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcreteApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "login";
	}

}
