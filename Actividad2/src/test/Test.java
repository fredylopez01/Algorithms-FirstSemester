package test;
import model.Game;
import model.Question;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		Question question1 = new Question();
		Question question2 = new Question();
		Question question3 = new Question();
		Game game1 = new Game();
		
		System.out.println("Responda falso o verdadero");
		System.out.println("");
		
		System.out.println("¿Tunja es la capital de Boyacá? ");
		char question1Response = console.next().charAt(0);
		question1.setResponse(question1Response);
		game1.setQuestion1(question1);
		if(game1.determineACorrect()!=true){

			System.out.println("Usted perdió ");

		}else{
			
			System.out.println("B. ¿El euro es la moneda oficial de España?");
			char question2Response = console.next().charAt(0);
			question2.setResponse(question2Response);
			game1.setQuestion2(question2);
			
				if(game1.determineBCorrect() != true) {
					
				System.out.println("Usted perdió ");
				
				}else {
					
				System.out.println("C. ¿El periodo de los alcaldes es de tres años?");
				char question3Response = console.next().charAt(0);
				question3.setResponse(question3Response);
				game1.setQuestion3(question3);
			
				if(game1.determineCCorrect() !=true){
					System.out.println("Usted perdió");
				}else {
					System.out.println("Ganó ");
				}
		
			}	
		}
		

	}
}
