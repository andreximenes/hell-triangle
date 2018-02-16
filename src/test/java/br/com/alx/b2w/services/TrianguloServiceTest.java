package br.com.alx.b2w.services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.alx.b2w.HellTriangleApplicationTests;

public class TrianguloServiceTest extends HellTriangleApplicationTests{

	@Autowired
	private TrianguloService service;
	
	@Test
	public void b2wTeste() {
		 long[][] dados = {{6},{3,5},{9,7,1},{4,6,8,4}};
		 assertEquals(26, service.calcTriangulo(dados));
	}
	
	@Test
	public void calculaVarios() {
		 long[][] dados = null;
		 
		 dados = new long[][]{{12}};
		 assertEquals(12, service.calcTriangulo(dados));
		 
		 dados = new long[][]{{6}, {12, 24}};
		 assertEquals(30, service.calcTriangulo(dados));
		 
		 dados = new long[][]{{5}, {10, 15}, {20, 25, 30}, {40, 45, 50, 60}};
		 assertEquals(110, service.calcTriangulo(dados));
		 
		 dados = new long[][]{{5}, {10, 15}, {20, 25, 30}, {40, 45, 50, 55}, {60, 65, 70, 75, 80}};
		 assertEquals(185, service.calcTriangulo(dados));
		 
		 dados = new long[][]{{5}, {5, 5}};
		 assertEquals(10, service.calcTriangulo(dados));
	}
}
