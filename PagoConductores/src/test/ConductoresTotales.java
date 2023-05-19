package test;
import module.Conductor;
import java.util.Scanner;

public class ConductoresTotales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nConductores = 0, clase = 0, x = 0, y = 0;
		long cedula = 0;
		String nombre = "";
		double tSueldos = 0;
		
		System.out.println("Por favor ingrese la cantidad de conductores.");
		nConductores = input.nextInt();
		Conductor[] lConductores = new Conductor[nConductores];
		while (x < nConductores) {
			System.out.println("");
			System.out.println("Ingrese la cedula del conductor");
			cedula = input.nextLong();
			System.out.println("Ingrese el nombre del conductor");
			nombre = input.next();
			System.out.println("Ingrese la clase del conductor");
			clase = input.nextInt();
			lConductores[x] = new Conductor(cedula, nombre, clase);
			
			System.out.println("Ingrese el valor de pasajes");
			lConductores[x].vPasajes = input.nextDouble();
			System.out.println("Ingrese el valor de Encomiendas");
			lConductores[x].vEncomiendas = input.nextDouble();
			lConductores[x].liquidacionCP();
			lConductores[x].liquidacionCE();
			x = x + 1;
		}
		while (y < nConductores) {
			System.out.println("");
			System.out.println("Nombre: " + lConductores[y].nombre + " Sueldo: " + lConductores[y].sueldoT());
			tSueldos = tSueldos + lConductores[y].sueldoT();
			y = y + 1;
		}
		System.out.println("");
		System.out.println("Total de sueldos: " + tSueldos);
		
	}

}
