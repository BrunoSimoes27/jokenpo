package Jokenpo;

import Jogador.Computer;
import Jogador.Jogador;

// import java.util.Scanner;

public class Jokenpo {
	public static void main(String[] args) {
		Jogador bruno = new Jogador ("Bruno", Escolha.getRandom());
		Jogador alexandre = new Jogador("Alexandre", Escolha.getRandom());
		Jogador pedro = new Jogador ("Pedro", Escolha.getRandom());
		Computer computer = new Computer();
		
		
		Regras regras = new Regras();
		
		Jogador ganhador = regras.jogar(bruno, computer);
		imprimirGanhador(ganhador);
		
		ganhador = regras.jogar(alexandre, computer);
		imprimirGanhador(ganhador);
		
		ganhador = regras.jogar(pedro, computer);
		imprimirGanhador(ganhador);
	}
	protected static void imprimirGanhador(Jogador ganhador) {
		if (ganhador == null) {
			System.out.println("Jogador e computador empataram!");
		} else {
			System.out.println("O ganhador é: " + ganhador.getNome());
		}
	}
}
		
		/* int alexandre;
		Scanner escolha = new Scanner(System.in);
		System.out.println("Jokenpo\n1-PEDRA\n2-PAPEL\n3-TESOURA\nFAÇA SUA ESCOLHA!");
		alexandre = escolha.nextInt();
		switch (alexandre) {
		case 1:
			System.out.println("VOCÊ ESCOLHEU PEDRA!");
			break;
		case 2:
			System.out.println("VOCÊ ESCOLHEU PAPEL!");
			break;
		case 3:
			System.out.println("VOCÊ ESCOLHEU TESOURA!");
			break;
		default:
			System.out.println("OPÇÃO INVALIDA! XD");
		}
		int computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("ADVERSÁRIO ESCOLHEU PEDRA!");
			break;
		case 2:
			System.out.println("ADVERSÁRIO ESCOLHEU PAPEL!");
			break;
		case 3:
			System.out.println("ADVERSÁRIO ESCOLHEU TESOURA!");
			break;
		}
		Regras regras = new Regras();
		
		if (alexandre != computador) {
			if ((alexandre == 1 && computador == 3) || (alexandre == 2 && computador == 1)
					|| (alexandre == 3 && computador == 2)) {
				System.out.println("VOCÊ VENCEU!");
			} else {
				System.out.println("VOCÊ PERDEU!");
			}				
		} else {
			System.out.println("EMPATE!");
		}
	}
}
*/
