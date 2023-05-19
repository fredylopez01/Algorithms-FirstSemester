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
		Impuesto original = new Impuesto();
		original.initValues();
		Pagina One = new Pagina();
		Scanner input = new Scanner(System.in);
		int option = 0;
		
		System.out.println("-------CALCULADOR DE IMPUESTOS---------");
		System.out.println("Bienvenido!");
		System.out.println("");
		
		System.out.print("Digite el dia actual: ");
		int dateDay = input.nextInt();
		System.out.print("Digite el mes actual: ");
		int dateMonth = input.nextInt();
		if (dateDay > 0 && dateDay <= 31 && dateMonth > 0 && dateMonth <= 12) {
			do {
				One.showMainMenu();
		        option = input.nextInt();
		        switch (option) {
		        case 1:
		        	int optionCV = 0;
		        	System.out.println("Digite de cual vehículo desea consultar los datos ");
		        	One.showOptionsCars();
		        	optionCV = input.nextInt();
		        	int xCV = optionCV-1;
		        	original.listCars[xCV].consultDates();
		        	break;
		        case 2:
		        	int optionMV = 0;
		        	System.out.println("Digite de cual vehículo desea modificar los datos ");
		        	One.showOptionsCars();
		        	optionMV = input.nextInt();
		        	int xMV = optionMV-1;
		        	original.listCars[xMV].modifyData();
		        	break;
		        case 3:
		        	int optionCI = 0;
		        	System.out.println("Digite de cual vehículo desea consultar la liquidación del impuesto ");
		        	One.showOptionsCars();
		        	optionCI = input.nextInt();
		        	int xCI = optionCI-1;
		        	original.consultLiquidationTax(dateDay, dateMonth, xCI);;
		        	break;
		        case 4:
		        	int optionPI = 0;
		        	System.out.println("Digite de cual vehículo desea pagar el impuesto ");
		        	One.showOptionsCars();
		        	optionPI = input.nextInt();
		        	int x = optionPI-1;
		        	original.pagar (x, dateDay, dateMonth);
		        	break;
		        case 5:
		        	break;
		        default: 
		        	System.out.println("Error! Opción invalida. Vuelva a intentar");
		        }
		       } while(option != 5);
			
			System.out.println("Ha sido un placer. Vuelva pronto.");
		} else {
			System.out.println("Error! La fecha es incorrecta vuelva a intentar");
		}
	}
}