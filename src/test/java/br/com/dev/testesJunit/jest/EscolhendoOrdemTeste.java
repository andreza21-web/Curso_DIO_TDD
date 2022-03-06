package br.com.dev.testesJunit.jest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTeste {

	@DisplayName("A")
	//@Order(value = 6)
	@Test
	void validarFluxoA() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("B")
	//@Order(value = 5)
	@Test
	void validarFluxoB() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("C")
	//@Order(value = 4)
	@Test
	void validarFluxoC() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("D")
	//@Order(value = 3)
	@Test
	void validarFluxoD() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("E")
	//@Order(value =2 )
	@Test
	void validarFluxoE() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("F")
	//@Order(value = 1)
	@Test
	void validarFluxoF() {
		Assertions.assertTrue(true);
	}
}
