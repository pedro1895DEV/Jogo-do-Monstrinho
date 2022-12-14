package jogo;

public class Fumar extends Acao {
	public Fumar() {
		System.out.println("A caixa diz: VOC  MORRE!");
		this.energia = -100;
		this.forca = -100;
		this.saude = -100;
		this.dinheiro = -100;
		this.fome = -100;
		this.respeito = -100;
	}
}