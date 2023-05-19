package module;

import java.util.Scanner;

public class TwoGG {
	Scanner input = new Scanner(System.in);
	public int numberG = (int)(Math.random()*10+0);
	
	public int startGame() {
		System.out.println("BIENVENIDOS!!Intente de adivinar un número del 0 al 10 para ganar");
		System.out.println("Que comience el juego");
		System.out.println("");
		return numberG;
	}
	
public void registrar() {
		int nJugadores;
		System.out.println("Ingrese cuantos jugadores quiere que tenga la partida");
		nJugadores = input.nextInt();
	}
}
