package test;
import model.Vendedor;
import java.util.Scanner;

public class VendedorTestDrive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int documentoId = 0;
		String nombre = "";
		int tipo, n;
		//n: cantidad de vendedores
		double vVentas = 0, vComision = 0, tComision = 0;
		
		System.out.println("Ingrese la cantidad de vendedores");
		n = input.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.print("Ingrese el numero de identidad del vendedor: ");
			documentoId = input.nextInt();
			System.out.println("Ingrese el nombre: ");
			nombre = input.next();
			System.out.print("Que tipo es el vendedor. Recuerde 1: Pueta a puerta o 2: Telemercado: ");
			tipo = input.nextInt();
			System.out.print("Cual es el monto de las ventas realizadas por el tabajador: ");
			vVentas = input.nextDouble();
		
			Vendedor objectvendedor = new Vendedor(documentoId, nombre, tipo, vVentas);
			vComision = objectvendedor.liquidarComision();
			
			System.out.println("Nombre del trabajador: " + objectvendedor.getNombre());
			System.out.println("Valor de comisiones: " + vComision);
			tComision += vComision;
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Valor total de comisiones: "+ tComision);
	}

}
