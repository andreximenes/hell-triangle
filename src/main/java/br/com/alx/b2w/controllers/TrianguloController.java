package br.com.alx.b2w.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alx.b2w.models.triangulo.Triangulo;
import br.com.alx.b2w.models.triangulo.TrianguloResponse;
import br.com.alx.b2w.services.TrianguloService;

@RestController
public class TrianguloController {

	@Autowired
	private TrianguloService trianguloService; 
	
	@ResponseBody
	@PostMapping("/triangulo/calcular")
	private TrianguloResponse calc(@Valid @RequestBody Triangulo triangulo) {
		return trianguloService.calcular(triangulo);
	}

}
