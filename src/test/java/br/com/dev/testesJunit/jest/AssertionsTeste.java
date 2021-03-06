package br.com.dev.testesJunit.jest;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import br.com.dev.testesJunit.junit.Pessoa;

public class AssertionsTeste {

	@Test
	void validarValoresDeOperacoes() {

		/* Validando soma */
		int resultado = 10;
		assertEquals(resultado, (5 + 5));

		/* Validando igualdade de valores */
		double valor = 5.0;
		double outroValor = 5.0;
		assertEquals(valor, outroValor);
	}

	@Test
	void validarSeArraysSaoIguais() {

		/* Valida se os arrays são iguais, comparando um a um */
		int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
		int[] segundoLancamento = { 10, 20, 30, 40, 50 };
		assertArrayEquals(primeiroLancamento, segundoLancamento);

		/* Utilizando arrays de diferentes tipos, começando por boolean[] */
		boolean[] flags = { true, false, false };
		assertArrayEquals(new boolean[] { true, false, false }, flags);

		/* Utilizando arrays de diferentes tipos, começando por double[] */
		double[] valores = { 5.0, 10.5, 50D, 46d };
		assertArrayEquals(new double[] { 5.0, 10.5, 50D, 46d }, valores);
	}

	@Test
	void validarSeObjetoEstaNuloOuNao() {

		Pessoa pessoa = null;
		assertNull(pessoa);

		pessoa = new Pessoa("teste", LocalDateTime.now());

		assertNotNull(pessoa);
	}

	@Test
	void validarNumerosDeTiposDiferentes() {

		double valor = 5.0;
		double outroValor = 5.0;

		assertEquals(valor, outroValor);
	}

	@Test
	void validarQueValoresSaoDiferentes() {

		int x = 5;
		int y = 6;

		assertNotEquals(x, y);
	}

	@Test
	void validarQueAlgumaCondicaoEhFalsa() {

		boolean condicao = 5 + 6 == 12;

		assertFalse(condicao);
	}

	@Test
	void validarQueAlgumaCondicaoEhVerdadeira() {

		boolean condicao = 6 + 6 == 12;

		assertTrue(condicao);
	}
}
