package test;

import module.TwoGG;
import module.TwoP;

public class TwoGL {

	public static void main(String[] args) {
		int win = 0;
		
		
		TwoGG first = new TwoGG();
		first.startGame();
		
		TwoP pedro = new TwoP();
		pedro.name = "Pedro";
		
		TwoP carlos = new TwoP();
		carlos.name = "Carlos";
		
		TwoP enrique = new TwoP();
		enrique.name = "Enrique";
		
		while (win == 0) {
			if (win == 0) {	
					pedro.playerGuess();
					if (first.numberG == pedro.getNumber()){
						System.out.println("");
						System.out.println("GANASTE Pedro");
						win = win + 1;
					}
			}
			
			if (win == 0) {
				
				carlos.playerGuess();
				if (first.numberG == carlos.getNumber()){
					System.out.println("");
					System.out.println("GANASTE Carlos");
					win = win + 1;
				}
			}
			
			if (win == 0) {
				
				enrique.playerGuess();
				if (first.numberG == enrique.getNumber()){
					System.out.println("");
					System.out.println("GANASTE Enrique");
					win = win + 1;
				}
			}
			
		}
		

	}

}
