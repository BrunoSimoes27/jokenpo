package Jogador;

import Jokenpo.Escolha;

public class Jogador {
	private Escolha escolha;
	private String nome;
	
	public Jogador (String nome, Escolha escolha) {
		this.escolha = escolha;
		this.nome = nome;
		
	}
	protected Jogador () {
	}
	
	public void setEscolha(Escolha escolha) {
		this.escolha = escolha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Escolha getEscolha() {
		return escolha;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Jogador [escolha=" + escolha + ", nome=" + nome + "]";
	}
}
