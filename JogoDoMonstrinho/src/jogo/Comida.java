package jogo;

public class Comida extends Acao{

	public Comida() {
		System.out.println("Hora da COMIDA!");
		this.energia = 1;
		this.forca = 1;
		this.saude = 1;
		this.fome = 3;
		this.dinheiro = -50;
		this.respeito = 0;
	}
}