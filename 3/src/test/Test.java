package test;
import model.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Digite el año actual");
		int year = console.nextInt();
		System.out.print("Digite el mes actual");
		int month = console.nextInt();
		System.out.print("Digite el dia actual");
		int day = console.nextInt();
		
		Date dateActual = new Date(day, month, year);
		
		//System.out.println(dateActual.getDay()+" "+dateActual.convertion()+" "+dateActual.getYear());
		System.out.println(dateActual);
	}

}
