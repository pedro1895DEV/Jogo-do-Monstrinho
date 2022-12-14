package jogo;

public class Descansar extends Acao{
	
	public Descansar() {
		System.out.println("Hora do soninho!");
		this.saude = 1;
		this.forca = 0;
		this.energia = 3;
		this.fome = -1;
		this.dinheiro = 0;
		this.respeito = 0;
	}
}