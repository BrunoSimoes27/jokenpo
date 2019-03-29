package Jogador;
import Jokenpo.Escolha;
import Jogador.Jogador;

public class Computer extends Jogador {
	
	public Computer () {
		super();
		String nome = this.gerarNome();
		Escolha escolha = this.escolher();
		this.setNome(nome);
		this.setEscolha(escolha);
	
	}
	protected String gerarNome() {
		return "Computador";
	}
	protected Escolha escolher() {
		return Escolha.getRandom();
	}
	
}
