package jogo;

public class Trabalhar extends Acao {
	public Trabalhar() {
		System.out.println("Seu monstrinho foi trabalhar e recebeu 60 reais hoje.");
		this.energia = -2;
		this.forca = -1;
		this.saude = -1;
		this.dinheiro = 60;
		this.fome = -1;
		this.respeito = 2;
	}
}