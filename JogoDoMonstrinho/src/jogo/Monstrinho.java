package jogo;
import java.util.Random;

public class Monstrinho {

	private int saude;
	private int energia;
	private int forca;
	private int fome;
	private int dinheiro;
	private int respeito;
	
	public Monstrinho() {
		this.saude = 5;
		this.energia = 5;
		this.forca = 5;
		this.fome = 10;
		this.dinheiro = 50;
		this.respeito = 0;
		
	}
	
	public void eventoAleatorio() {
		Random ale = new Random();
		int rand = ale.nextInt(4);
		switch(rand) {
			case 1:
				eventoUm();
				break;
			case 2:
				eventoDois();
				break;
			case 3:
				eventoTres();
				break;
		}
	}
	
	public void eventoUm() {
		System.out.println("Seu monstrinho perdeu dinheiro no truco!");

		this.saude += 0;
		this.energia += 0;
		this.forca += 0;
		this.fome += 0;
		this.dinheiro -= 20;
		this.respeito -= 1;
	}
	
	public void eventoDois() {
		System.out.println("Seu monstrinho foi o mil simo cliente a entrar numa loja!");

		this.saude += 1;
		this.energia += 1;
		this.forca += 0;
		this.fome += 0;
		this.dinheiro += 25; 
		this.respeito += 1;
	}
	
	public void eventoTres() {
		System.out.println("Seu monstrinho foi ao est dio assistir ao jogo mas, seu time perdeu!");

		this.saude -= 1;
		this.energia -= 2;
		this.forca += 0;
		this.fome -= 1;
		this.dinheiro -= 30; 
		this.respeito -= 2;
	}
	
	public void aplicarAcao(Acao acao) {

		this.saude += acao.getSaude();
		this.forca += acao.getForca();
		this.energia += acao.getEnergia();
		this.fome += acao.getFome();
		this.dinheiro += acao.getDinheiro();
		this.respeito += acao.getRespeito();
	}
	
	public boolean estaVivo() {

		return (this.saude > 0 && this.energia > 0 && this.forca> 0 && this.fome > 0 && this.dinheiro >= 0 && this.respeito >= 0);
	}
	
	public void status() {
	
		System.out.println("Dados do monstrinho:");
		System.out.println("Sa de -> " + this.saude);
		System.out.println("Energia -> " + this.energia);
		System.out.println("For a -> " + this.forca);
		System.out.println("Fome -> " + this.fome);
		System.out.println("Dinheiro -> " + this.dinheiro);
		System.out.println("Respeito -> " + this.respeito);
	}
	
}
