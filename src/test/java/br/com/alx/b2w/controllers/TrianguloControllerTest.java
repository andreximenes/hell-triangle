package br.com.alx.b2w.controllers;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import br.com.alx.b2w.HellTriangleApplicationTests;
import br.com.alx.b2w.controllers.TrianguloController;

public class TrianguloControllerTest extends HellTriangleApplicationTests {
	
	@Autowired
	private TrianguloController trianguloController;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(trianguloController).build();
	}
}
