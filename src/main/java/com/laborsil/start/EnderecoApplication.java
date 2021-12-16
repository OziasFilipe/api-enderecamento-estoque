package com.laborsil.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class EnderecoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnderecoApplication.class, args);
		System.out.print("Servidor rodando....");
	}

}
