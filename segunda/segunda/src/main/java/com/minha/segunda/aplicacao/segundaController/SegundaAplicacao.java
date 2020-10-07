package com.minha.segunda.aplicacao.segundaController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundaaplicacao")
public class SegundaAplicacao {
	
	@GetMapping("Objetivos de Aprendizagem")
	public String segundaaplicacao () {
		return "/Pratica com Material e Persistencia";
	}

}
