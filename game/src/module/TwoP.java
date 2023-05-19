package module;

import java.util.Scanner;

public class TwoP {
	public int number = 0;
	public String name = "";
	
	public void playerGuess() {
		Scanner input = new Scanner(System.in);
		
		System.out.print(name + "-----" + "Yo creo que es: ");
		number = input.nextInt();
	}
	
	public int getNumber() {
		return number;
	}
}
