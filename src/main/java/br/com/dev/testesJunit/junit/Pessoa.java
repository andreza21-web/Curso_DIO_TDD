package br.com.dev.testesJunit.junit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {

	private String nome;
	private LocalDateTime nascimento;

	public Pessoa(String nome, LocalDateTime nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
	}

	public boolean maiorIdade() {
		return getIdade() >= 18;
	}

	public boolean equals(Object obj) {
		  if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Pessoa pessoa = (Pessoa) obj;
		return nome.equals(pessoa.nome) && Objects.equals(nascimento, pessoa.nascimento);
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(nome, nascimento);
    }
	

}
