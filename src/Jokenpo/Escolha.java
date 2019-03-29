package Jokenpo;

public enum Escolha {
	PEDRA, PAPEL, TESOURA;

	
public static Escolha getRandom() {
    return values()[(int) (Math.random() * values().length)];
	}
}
