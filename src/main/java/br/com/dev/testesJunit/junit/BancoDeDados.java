package br.com.dev.testesJunit.junit;

import java.util.logging.Logger;

public class BancoDeDados {

	private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

	public static void iniciarConexao() {
		LOGGER.info("iniciou a conexao");
	}

	public static void finalizarConexao() {
		LOGGER.info("finalizou a conexão");
	}
	
	public static void inserirDados(Pessoa pessoa) {
		LOGGER.info("inseriu dados");
	}
	
	public static void removeDados(Pessoa pessoa) {
		LOGGER.info("removeu dados");
	}
}
