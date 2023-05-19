package module;

import java.util.Scanner;

public class CalcularPedido {
	Platos primerPlato = new Platos();
	Platos segundoPlato = new Platos();
	Platos bebida = new Platos();
	Platos postre = new Platos();
	
	public void initValues() {
	primerPlato.name = "Primer Plato";
	primerPlato.precio = 20000;
	segundoPlato.name = "Segundo Plato";
	segundoPlato.precio = 9000;
	bebida.name = "Bebida";
	bebida.precio = 2500;
	postre.name = "Postre";
	postre.precio = 3000;
	}
	
	
	public void Start() {
		Scanner input = new Scanner(System.in);
		initValues();
		int option = 0;
		int pedido = 0;

		System.out.println("----------------------------Menu---------------------------------");
		System.out.println("1. " + primerPlato.name + "\n2. " + segundoPlato.name + "\n3. " + bebida.name + "\n4. " + postre.name);
		System.out.println("");
		System.out.println(" -----------------------------------------------------------------");
		System.out.println("| Recuerde que para hacer pedidos hay tres opciones:              |");
		System.out.println("| 1.----Plato individual, un solo plato.                          |");
		System.out.println("| 2.----Perzonalizado, dos o más platos, libre elección           |");
		System.out.println("| 3.----Combos Especiales                                         |");
		System.out.println(" -----------------------------------------------------------------");
		System.out.println("Ingrese opción según el pedido que desea realizar");
		option = input.nextInt();
		if (option == 1) {
			System.out.println("Escriba en numeros que plato desea pedir");
			pedido = input.nextInt();
			if (pedido == 1) {
				Pedido a = new Pedido();
				a.pedidoI(primerPlato.precio);
			}
			if (pedido == 2) {
				Pedido a = new Pedido();
				a.pedidoI(segundoPlato.precio);
			}
			if (pedido == 3) {
				Pedido a = new Pedido();
				a.pedidoI(bebida.precio);
			}
			if (pedido == 4) {
				Pedido a = new Pedido();
				a.pedidoI(postre.precio);
			}
		} else if (option == 2) {
			double valor = 0;
			int mas = 0;
			System.out.println("En este momento no esta disponible esta opción");
			while (mas == 0) {
				System.out.println(" en numero que plato desea pedir");
				pedido = input.nextInt();
				if (pedido == 1) {
					valor += primerPlato.precio;
				} else if (pedido == 2) {
					valor += primerPlato.precio;
				} else if (pedido == 3) {
					valor += primerPlato.precio;
				} else if (pedido == 4) {
					valor += primerPlato.precio;
				}
				System.out.println("Desea pedir otro plato. 0: sí, 1: no");
				mas = input.nextInt();
			} 
			System.out.println("Valor del pedido: " + valor);
		} else if (option == 3) {
			System.out.println("Ingrese que combo desea pedir.");
			System.out.println("1. " + primerPlato.name + " y " +  bebida.name);
			System.out.println("2. " + primerPlato.name + ", " + segundoPlato.name + " y " + bebida.name);
			System.out.println("3. " + primerPlato.name + ", " + segundoPlato.name + ", " + bebida.name + " y " + postre.name);
			pedido = input.nextInt();
			if (pedido == 1) {
				Pedido a = new Pedido();
				a.pedidoCombUno(primerPlato.name, primerPlato.precio, bebida.name, bebida.precio);
			} else if(pedido == 2) {
				Pedido a = new Pedido();
				a.pedidoCombDos(primerPlato.name, primerPlato.precio, segundoPlato.name, segundoPlato.precio, bebida.name, bebida.precio);
			} else if (pedido == 3) {
				Pedido a = new Pedido();
				a.pedidoCombTres(primerPlato.name, primerPlato.precio, segundoPlato.name, segundoPlato.precio, bebida.name, bebida.precio, postre.name, postre.precio);
			}
		}
		
		
	}
}
