package br.com.dev.testesJunit.jest;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.dev.testesJunit.junit.Pessoa;

public class PessoaTeste {

	@Test
    void deveCalcularIdadeCorretamente() {
        Pessoa andreza = new Pessoa("Andreza", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(22, andreza.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa carlos = new Pessoa("carlos", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(carlos.maiorIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.maiorIdade());
    }

    @Test
    void validaIgualdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }
}
