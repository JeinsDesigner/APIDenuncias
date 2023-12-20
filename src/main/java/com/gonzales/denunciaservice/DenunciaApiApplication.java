package com.gonzales.denunciaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DenunciaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenunciaApiApplication.class, args);
	}

}
