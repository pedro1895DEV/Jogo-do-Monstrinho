package jogo;

public class Acao {
	
	protected int energia;
	protected int forca;
	protected int saude;
	protected int fome;
	protected int dinheiro;
	protected int respeito;
	
	public Acao() {
		energia = 0;
		forca = 0;
		saude = 0;
		fome = 0;
		dinheiro = 0;
		respeito = 0;
	}

	public int getEnergia() {
		return energia;
	}

	public int getForca() {
		return forca;
	}

	public int getSaude() {
		return saude;
	}
	
	public int getFome() {
		return fome;
	}
	
	public int getDinheiro() {
		return dinheiro;
	}
	
	public int getRespeito() {
		return respeito;
	}
}