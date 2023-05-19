package test;                                                                                                                                                                                                                                                          //TRABAJO HECHO POR WBOK
import model.MyDate;
import java.util.Scanner;

public class Test {
		
	
		public static void main(String [] args){
			Scanner console = new Scanner(System.in);
			
			System.out.println("Digite su año de nacimiento");
			int yearBirth = console.nextInt();
			System.out.println("Digite su mes de nacimiento");
			int monthBirth = console.nextInt();
			System.out.println("Digite su dia de nacimiento");
			int dayBirth = console.nextInt();
			
			MyDate birth = new MyDate(yearBirth, monthBirth, dayBirth);
			
			System.out.println("Digite el año actual");
			int yearActual = console.nextInt();
			System.out.println("Digite el mes actual");
			int monthActual = console.nextInt();
			System.out.println("Digite el dia actual");
			int dayActual = console.nextInt();
			
			MyDate actual = new MyDate(yearActual, monthActual, dayActual);
			
			System.out.println("Digite el año en el que fue admtido");
			int yearAdmision = console.nextInt();
			System.out.println("Digite el mes en el que fue admitido");
			int monthAdmision = console.nextInt();
			System.out.println("Digite el dia en el que fue admitido");
			int dayAdmision = console.nextInt();
			
			MyDate admission = new MyDate(yearAdmision, monthAdmision, dayAdmision);
	
			
			System.out.println("Edad actual: " +  birth.diffYears(actual));
			System.out.println("Semestres cursados: " +  admission.diffSemester(actual));
			
		}	
}


