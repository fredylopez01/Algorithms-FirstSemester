package module;

public class GuessGameVTwo {
	
	public int numberG = (int)(Math.random()*10+0);
	
	public int startGame() {
		System.out.println("BIENVENIDOS!!Intente de adivinar un número del 0 al 10 para ganar");
		System.out.println("Que comience el juego");
		System.out.println("");
		return numberG;
	}
}
