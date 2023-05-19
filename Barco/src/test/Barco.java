package test;
import java.util.Scanner;

public class Barco{
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		int ndisparos = 0, muertes = 0, disparo = 0, disparos = 0, disparot = 0, disparoo = 0;
		
		System.out.println("**********************************************************************************************************");
		System.out.println("*************************************BATALLA NAVAL********************************************************");
		System.out.println("**********************************************************************************************************");
		System.out.println("");
		System.out.println("Bienvenido a batalla naval intente destruir el barco que ocupa tres lugares de los diez que puede disparar");
		System.out.println("");
		System.out.println("Tu turno dispara. Escribe en numeros cual casilla quieres disparar, recuerda que solo hay 10 casillas");
		
		while (muertes < 3){
			System.out.println("Dispara");
			disparo = input.nextInt();
			if (disparo == 1){
				System.out.println("AGUA");
				ndisparos = ndisparos + 1;
			} else if (disparo == 2){
				System.out.println("AGUA");
				ndisparos = ndisparos + 1;
			} else if (disparo == 3){
				System.out.println("AGUA");
				ndisparos = ndisparos + 1;
			} else if (disparo == 4){
				System.out.println("AGUA");
				ndisparos = ndisparos + 1;
			} else if (disparo == 5){
				System.out.println("AGUA");
				ndisparos = ndisparos + 1;
			} else if (disparo == 6){
				if (disparos == 0){
					System.out.println("ACIERTO");
					ndisparos = ndisparos + 1;
					muertes = muertes + 1;
					disparos = disparos+1;
				} else {
					System.out.println("YA LE PEGASTE A ESA FICHA. INTENTA OTRA");
					ndisparos = ndisparos + 1;
				}
			} else if (disparo == 7){
				if (disparot == 0){
					System.out.println("ACIERTO");
					ndisparos = ndisparos + 1;
					muertes = muertes + 1;
					disparot = disparot + 1;
				} else {
					System.out.println("ACIERTO");
					ndisparos = ndisparos + 1;
					disparot = disparot + 1;
				}
			} else if (disparo == 8){
				if (disparoo == 0){
					System.out.println("ACIERTO");
					ndisparos = ndisparos + 1;
					muertes = muertes + 1;
					disparoo = disparoo + 1;
				} else {
					System.out.println("ACIERTO");
					ndisparos = ndisparos + 1;
					disparoo = disparoo + 1;
				}
			} else if (disparo == 9){
				System.out.println("AGUA");
				ndisparos = ndisparos + 1;
			} else if (disparo == 10){
				System.out.println("AGUA");
				ndisparos = ndisparos + 1;
			} else {
				System.out.println("Error. Intenta de de nuevo. Opción no valida");
			}
		}
		System.out.println("");
			System.out.println("**************************************HUNDIDO********************************************************");
			System.out.println("****************************************Has ganado***************************************************");
			System.out.println(" Numeros de disparos realizados:                                                         " + ndisparos);
			
	}
}