package test;

import java.util.Scanner;
import module.Docente;

public class TeacherPayment {
	public static void main (String [] args) {	
		Scanner input = new Scanner(System.in);
		long id = 0;
		String name = "";
		String category;
		int hours, y = 0, x = 0;
		int nWorkers = 0;
		double tPayment = 0;
		
			
		System.out.println("-------BIENVENIDO------");
		System.out.println("");
		System.out.println("Ingrese el número de profesores");
		nWorkers = input.nextInt();
		Docente[] lTeacher = new Docente[nWorkers];
		
		while (y < nWorkers){
			System.out.println("");
			System.out.println("*Ingrese el numero de cedula del profesor");
			id = input.nextLong();
			System.out.println("*Ingrese el nombre del trabajador");
			name = input.next();
			System.out.println("*A que categoria pertenece este trabajador.(a, b, c)");
			category = input.next();
			System.out.println("*¿Número de horas trabajadas?");
			hours = input.nextInt();
			
			lTeacher[y] = new Docente(id, name, category, hours);
			y = y + 1;
		}
		System.out.println("");
		while(x < nWorkers) {
			System.out.println("Nombre: " + lTeacher[x].name + " Sueldo: " + lTeacher[x].sueldo());
			tPayment = tPayment + lTeacher[x].sueldo();
			x = x + 1;
		}
		System.out.println("");
		System.out.println("Total de sueldo de todos los trabajadores: " + tPayment);
	}

}