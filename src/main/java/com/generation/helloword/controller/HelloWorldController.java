package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWord() {
		return "Hello World!!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "Habilidades:"
				+ " Trabalho em equipe,"
				+ " Orientação ao detalhe,"
				+ " Proatividade,"
				+ " Comunicação "
				+ " Mentalidades:"
				+ " Orientação ao Futuro,"
				+ " Responsabilidade Pessoal,"
				+ " Mentalidade de Crescimento,"
				+ " Persistência"
				;
	}
	@GetMapping("objetivos")
	public String objetivos() {
		return " Objetivos para a semana"
				+ " Aprender sobre Insomnia, Spring, fazer requisições API e familiarizar mais com o backend"
				;
	}

}
