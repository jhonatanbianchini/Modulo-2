package com.minhaprimeiraaplicacao.primeiraaplicao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraaplicacao")
public class PrimiraAplicacaoControler {

	@GetMapping("/Mentalidades")
	public String primeiraaplicacao() {
		return "/Crescimento";
	}
	@GetMapping("/Habilidades")
	public String primeirapalicacao () {
		return "/Atenção aos Detalhes";
	}
	
}
