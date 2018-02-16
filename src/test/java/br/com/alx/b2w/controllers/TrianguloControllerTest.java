package br.com.alx.b2w.controllers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import br.com.alx.b2w.HellTriangleApplicationTests;
import br.com.alx.b2w.controllers.TrianguloController;
import br.com.alx.b2w.models.EnumStatus;

public class TrianguloControllerTest extends HellTriangleApplicationTests {
	
	@Autowired
	private TrianguloController trianguloController;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(trianguloController).build();
	}
	
	@Test
	public void testControllerPostTrianguloValido() throws Exception {
		String trianguloMock = "{\"dados\": [[6],[3,5],[9,7,1],[4,6,8,4]] }";
		
		this.mockMvc.perform(post("/triangulo/calcular").contentType(MediaType.APPLICATION_JSON)
                .content(trianguloMock))
				.andExpect(jsonPath("$.resultado", is(equalTo(26))))
				.andExpect(jsonPath("$.status", is(equalTo(200))));
	}
	
	@Test
	public void testControllerPostTrianguloInvalido() throws Exception {
		String trianguloMock = "{\"dados\":[[1], [1]] }";
		
		this.mockMvc.perform(post("/triangulo/calcular").contentType(MediaType.APPLICATION_JSON)
                .content(trianguloMock))
				.andExpect(jsonPath("$.resultado", is(equalTo(0))))
				.andExpect(jsonPath("$.status", is(equalTo(EnumStatus.ERRO_TRIANGULO_INVALIDO.getCodigo()))))
				.andExpect(jsonPath("$.statusMsg", is(equalTo(EnumStatus.ERRO_TRIANGULO_INVALIDO.getMsg()))));
	}
	
	@Test
	public void testControllerPostTrianguloNulo() throws Exception {
		String trianguloMock = "{\"dados\":[] }";
		
		this.mockMvc.perform(post("/triangulo/calcular").contentType(MediaType.APPLICATION_JSON)
                .content(trianguloMock))
				.andExpect(jsonPath("$.resultado", is(equalTo(0))))
				.andExpect(jsonPath("$.status", is(equalTo(EnumStatus.ERRO_TRIANGULO_NULO_VAZIO.getCodigo()))))
				.andExpect(jsonPath("$.statusMsg", is(equalTo(EnumStatus.ERRO_TRIANGULO_NULO_VAZIO.getMsg()))));
	}
	
	
}
