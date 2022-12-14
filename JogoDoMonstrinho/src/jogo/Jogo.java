package jogo;

import java.util.Scanner;


public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Monstrinho monstrinho = new Monstrinho();
		int opcao, turno = 1;
		
		System.out.println("Seu Monstrinho nasceu! \nCuide dele com carinho!\nN o deixe seus status chegarem a zero");
	
		monstrinho.status();
		
		while(monstrinho.estaVivo()) {
		
			System.out.println("\n\n### TURNO "+turno+" ###");
			System.out.println("Escolha uma a  o: ");
			System.out.println("1- Comida (E+1 - F+1 - S+1 - Fo+3 - D-50 - R-0)");
			System.out.println("2- Malha  o (E-2 - F+2 - S+1 - Fo-2 - D-30 - R+3)");
			System.out.println("3- Descansar (E+3 - F-0 - S+1 - Fo-1 - D-0 - R-0)");
			System.out.println("4- Trabalhar (E-2 - F-1 - S-1 - Fo-1 - D+60 - R+1)");
			System.out.println("5- Jogar Bola (E-2 - F+2 - S+2 - Fo-1 - D-0 - R+1)");
			System.out.println("6- Fumar (Voc  n o quer fazer isso.)");
			opcao = teclado.nextInt();
			
		
			if(opcao == 1) {
				monstrinho.aplicarAcao(new Comida());
			}
		
			if (opcao == 2) {
				monstrinho.aplicarAcao(new Malhacao());
			}
		
			if (opcao == 3) {
				monstrinho.aplicarAcao(new Descansar());
			}
			
			if (opcao == 4) {
				monstrinho.aplicarAcao(new Trabalhar());
			}
			
			if (opcao == 5) {
				monstrinho.aplicarAcao(new JogarBola());
			}
			
			if (opcao == 6) {
				monstrinho.aplicarAcao(new Fumar());
			}
			
			monstrinho.status();
		
			monstrinho.eventoAleatorio();
			
			monstrinho.status();
			
			turno++;
		}		
		
		
		System.out.println("Seu monstrinho Morreu...");
		System.out.println("Ele sobreviveu "+ turno + " turnos");
		
		
		teclado.close();
	}
	
	
}
