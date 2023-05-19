package test;
import module.GuessGame;
import module.Player;

public class GameLauncher {

	public static void main(String[] args) {
		int win = 0;
		
		GuessGame first = new GuessGame();
		first.startGame();
		
		Player pedro = new Player();
		pedro.name = "Pedro";
		
		Player carlos = new Player();
		carlos.name = "Carlos";
		
		Player enrique = new Player();
		enrique.name = "Enrique";
		
		while (win == 0) {
			if (win == 0) {	
					pedro.playerGuess();
					if (first.numberG == pedro.number){
						System.out.println("");
						System.out.println("GANASTE Pedro");
						win = win + 1;
					}
			}
			
			if (win == 0) {
				
				carlos.playerGuess();
				if (first.numberG == carlos.number){
					System.out.println("");
					System.out.println("GANASTE Carlos");
					win = win + 1;
				}
			}
			
			if (win == 0) {
				
				enrique.playerGuess();
				if (first.numberG == enrique.number){
					System.out.println("");
					System.out.println("GANASTE Enrique");
					win = win + 1;
				}
			}
			
		}
		
	}

}
