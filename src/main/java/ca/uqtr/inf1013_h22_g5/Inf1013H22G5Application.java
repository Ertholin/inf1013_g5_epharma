package ca.uqtr.inf1013_h22_g5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Inf1013H22G5Application {

	public static void main(String[] args) {
		SpringApplication.run(Inf1013H22G5Application.class, args);
	}

}
