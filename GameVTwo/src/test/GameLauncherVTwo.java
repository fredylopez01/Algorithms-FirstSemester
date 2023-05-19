package test;

import module.GuessGameVTwo;
import module.PlayerVTwo;

public class GameLauncherVTwo {

	public static void main(String[] args) {
int win = 0;
		
		GuessGameVTwo first = new GuessGameVTwo();
		first.startGame();
		
		while (win == 0) {
			
			PlayerVTwo pedro = new PlayerVTwo();
			pedro.name = "Pedro";
			
			PlayerVTwo carlos = new PlayerVTwo();
			carlos.name = "Carlos";
			
			PlayerVTwo enrique = new PlayerVTwo();
			enrique.name = "Enrique";
			
			if (win == 0) {
				if (pedro.number != carlos.number) {
					pedro.playerGuess();
					if (first.numberG == pedro.number){
						System.out.println("");
						System.out.println("GANASTE Pedro");
						win = win + 1;
					}
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
