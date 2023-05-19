package test;

import java.util.Scanner;

import module.CalcularPedido;

public class RestauranteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int option = 0;
		int pedido = 0;
		
		
		System.out.println("--------------------------RESTAURANTE---------------------------");
		
		System.out.println("Bienvenido");
		
		CalcularPedido uno = new CalcularPedido();
	    uno.Start();
	}

}
