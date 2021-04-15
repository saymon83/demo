package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class HomeRestController {
	
	@GetMapping
	private ResponseEntity<Object> home() {
		return ResponseEntity.ok().body("demo teste. Mais detalhe em: <a target='_blank' href='https://github.com/saymon83/demo'>https://github.com/saymon83/demo<a><br> "
				+ "acesso aos testes <a target='_blank' href='http://localhost:8089/primeira-venda'>http://localhost:8089/primeira-venda<a> , <a target='_blank' href='http://localhost:8089/segunda-venda'>http://localhost:8089/segunda-venda<a> , <a target='_blank' href='http://localhost:8089/terceira-venda'>http://localhost:8089/terceira-venda<a> ");
	}

}