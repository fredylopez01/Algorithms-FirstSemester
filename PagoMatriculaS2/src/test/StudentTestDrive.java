package test;

import java.util.Scanner;
import module.Student;

public class StudentTestDrive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int code = 0;
		String name = "";
		String program = "";
		String scholarship = "";
		int nStudents = 0, x = 0, y = 0;
		double tWorthM = 0;
		
		System.out.println("----------------------------------LIQUIDACION DE SERVICIO DE MATRICULA---------------------------------");
		System.out.println("");
		System.out.println("Bienvenido---Ingrese el numero de estudiantes que desea registrar para calcular el valor de la matricula");
		nStudents = input.nextInt();
		Student[] lStudents = new Student[nStudents];
		
		System.out.println("");
		System.out.println("********************************************************************************************************");
		System.out.println("*                  Tenga en cuenta estos criterios para responder la encuesta:                         *");
		System.out.println("*                  Programa al que pertenece el estudiante puede ser:                                  *");
		System.out.println("*                  1. Tecnico en Sistemas                                                              *");
		System.out.println("*                  2. Tecnico en desarrolo de videojuegos                                              *");
		System.out.println("*                  3. Tecnico en animacion digital                                                     *");
		System.out.println("*                  El tipo de beca puede ser:                                                          *");
		System.out.println("*                  1. Beca por rendimiento                                                             *");
		System.out.println("*                  2. Beca cultural-deportes                                                           *");
		System.out.println("*                  3. Sin beca                                                                         *");
		System.out.println("*                  Tendra que repoder en palabras                                                      *");
		System.out.println("********************************************************************************************************");
		System.out.println("");
		while(x < nStudents) {
			System.out.println("Ingrese el codigo del estudiante: ");
			code = input.nextInt();
			System.out.print("Ingrese el nombre: ");
			name = input.next();
			System.out.println("En que programa se inscribira o esta inscrito el estudiante: ");
			program = input.next();
			System.out.println("Que tipo de beca tiene: ");
			scholarship = input.next();
			
			lStudents[x] = new Student(code, name, program, scholarship);
			lStudents[x].cWorth();
			lStudents[x].cDiscount();
			lStudents[x].tEnrollment = lStudents[x].worthM - lStudents[x].vDiscount;
			x = x + 1;
		}
		
		while (y < nStudents) {
			tWorthM = tWorthM + lStudents[x].tEnrollment;
			y = y + 1;
		}
		System.out.println("Total de matriculas de todos los Estudiantes: " + tWorthM);
	}

}
