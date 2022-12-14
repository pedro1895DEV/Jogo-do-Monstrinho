package jogo;

public class JogarBola extends Acao {
	public JogarBola() {
		System.out.println("Hora do fute!");
		this.energia = -2;
		this.forca = 2;
		this.saude = 2;
		this.fome = -1;
		this.dinheiro = 0;
		this.respeito = 1;
	}
}