package module;

import java.util.Scanner;

public class Pagina {
	public void showMainMenu() {
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------------------------------------");
		System.out.println("Menú Principal");
		System.out.println("Digite el numero de la accion que desea realizar:");
        System.out.println("1. Consultar los datos del vehículo ");
        System.out.println("2. Modificar los datos del vehículo ");
        System.out.println("3. Consultar liquidación de impuesto");
        System.out.println("4. Pagar impuesto liquidado ");
        System.out.println("5. Terminar ");
	}
	
	public void showOptionsCars() {
		System.out.println("1. Carro Uno ");
    	System.out.println("2. Carro Dos ");
    	System.out.println("3. Carro Tres ");
    	System.out.println("4. Carro Cuatro ");
    	System.out.println("5. Carro Cinco ");
	}
	
	public static void main(String[] args) {
		Pagina One = new Pagina();
		Scanner input = new Scanner(System.in);
		int option = 0;
		int taxspays = 0;
		
		Car[] listCars = new Car[5];
		listCars[0] = new Car("123", "Chevrolet", "particular", "2.5", 2022, "automovil", "hibrido", 80000000, false);
		listCars[1] = new Car("124", "Toyota", "publico", "2.7", 2008, "automovil", "diesel", 100000000, false);
		listCars[2] = new Car("125", "akt", "particular", "2.5", 2022, "moto", "hibrido", 5000000, false);
		listCars[3] = new Car("126", "bmw", "publico", "2.5", 2022, "automovil", "gasolina", 120000000, false);
		listCars[4] = new Car("127", "kia", "particular", "2.5", 2022, "carga", "hibrido", 38000000, false);
		
		System.out.println("-------CALCULADOR DE IMPUESTOS---------");
		System.out.println("Bienvenido!");
		System.out.println("");
		
		System.out.print("Digite el dia actual: ");
		int dateDay = input.nextInt();
		System.out.print("Digite el mes actual: ");
		int dateMonth = input.nextInt();
		if (dateDay > 0 && dateDay <= 31 && dateMonth > 0 && dateMonth < 12) {
			do {
				One.showMainMenu();
		        option = input.nextInt();
		        if (option > 0 && option <= 5) {
		        if (option == 1) {
		        	int optionCV = 0;
		        	System.out.println("Digite de cual vehículo desea consultar los datos ");
		        	One.showOptionsCars();
		        	optionCV = input.nextInt();
		        	int x = optionCV-1;
		        	listCars[x].consultarDatos();
		        	
		        } else if (option == 2) {
		        	int optionMV = 0;
		        	System.out.println("Digite de cual vehículo desea modificar los datos ");
		        	One.showOptionsCars();
		        	optionMV = input.nextInt();
		        	int x = optionMV-1;
		        	listCars[x].modifyData();
		        	
		        } else if (option == 3) {
		        	int optionCI = 0;
		        	System.out.println("Digite de cual vehículo desea consultar la liquidación del impuesto ");
		        	One.showOptionsCars();
		        	optionCI = input.nextInt();
		        	int x = optionCI-1;
		        	listCars[x].estateTax();
		        	System.out.println("El valor de avaluo de su automovil es de: " + listCars[x].appraisalValue);
		        	System.out.println("El valor parcial del impuesto de su automovil es de: " + listCars[x].calculateTax());
		        	System.out.println("El valor por descuento del impuesto de su automovil es de: " + listCars[x].calculateDiscount(dateDay, dateMonth));
		        	System.out.println("El valor total del impuesto de su automovil es de: " + listCars[x].tValueTax());
		        	
		        } else if (option == 4) {
		        	int optionPI = 0;
		        	System.out.println("Digite de cual vehículo desea pagar el impuesto ");
		        	One.showOptionsCars();
		        	optionPI = input.nextInt();
		        	int x = optionPI-1;
		        	
		        	if(listCars[x].state == true) {
		    			System.out.println("Su impuesto ya está pago!");
		    		} else if (listCars[x].state == false) {
		    			int pagar = 0;
		    			System.out.println("Su impuesto se encuentra sin pagar");
		        		System.out.println("El valor parcial del impuesto de su automovil es de: " + listCars[x].calculateTax());
		        		System.out.println("El valor por descuento del impuesto de su automovil es de: " + listCars[x].calculateDiscount(dateDay, dateMonth));
		        		System.out.println("El valor total del impuesto de su automovil es de: " + listCars[x].tValueTax());
		        		System.out.println("¿Desea pagar el impuesto de su automovil?   0: no, 1: si");
		        		pagar = input.nextInt();
		        		if (pagar == 1) {
		        			listCars[x].state = true;
		        			taxspays = taxspays + 1;
		        			System.out.println("Su impuesto acaba de quedar pago");
		        			System.out.println("************************RECIBO***************************");
		        			System.out.println("*   Impuesto parcial de su automovil:-" + listCars[x].taxValue);
		        			System.out.println("*   Descuento:-------------------------" + listCars[x].discount);
		        			System.out.println("*   Total:---------------------------" + listCars[x].tPriceTax);
		        			System.out.println("*   Estado:----------------------------PAGO!");
		        			System.out.println("*   Gracias por su pago. Fue un gusto.");
		        			System.out.println("**********************************************************");
		        			if (taxspays == 5) {
		        				option = 5;
		        			}
		        		} else if(pagar == 0) {
		        			System.out.println("Su impuesto quedara sin pagar");
		        			System.out.println("Animese a pagar su impuesto. Lo esperaremos pronto");
		        		}
		    		}
		        }
		        } else {
		        	System.out.println("Error! Opción no valida. Vuelva a intentar");
		        }
			} while(option != 5);
			
			System.out.println("Ha sido un placer. Vuelva pronto.");
		} else {
			System.out.println("Error! La fecha es incorrecta vuelva a intentar");
		}
	} 

}