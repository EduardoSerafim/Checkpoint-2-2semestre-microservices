package com.servico.ativo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.servico.ativo.controller"})
public class AtivoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtivoApplication.class, args);
	}

}
