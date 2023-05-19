package test;
import module.NumeroEntero;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Ingrese el número que desea ser evaluado");
		numero = input.nextInt();
		
		NumeroEntero nEvaluado = new NumeroEntero(numero);
		nEvaluado.parImpar();
		nEvaluado.Signo();
		
	}

}
