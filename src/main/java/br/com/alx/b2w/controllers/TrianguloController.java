package br.com.alx.b2w.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alx.b2w.models.ResponseStatus;
import br.com.alx.b2w.models.triangulo.TrianguloResponse;
import br.com.alx.b2w.services.TrianguloService;
import br.com.alx.b2w.validatores.ValidadorTriangulo;

@RestController
public class TrianguloController {

	@Autowired
	private TrianguloService trianguloService; 
	
	@ResponseBody
	@GetMapping("/triangulo/test")
	private String test() {
		return "Controller Funcionando";
	}
	
	@ResponseBody
	@PostMapping("/triangulo/calcular")
	private TrianguloResponse calc() {
		return new TrianguloResponse(ResponseStatus.SUCESSO, 0);
	}

}
