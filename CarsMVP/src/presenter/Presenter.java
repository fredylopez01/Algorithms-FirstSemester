package presenter;

import java.util.Scanner;

import model.Car;
import model.Tax;
import view.View;

public class Presenter {
	
	public Car[] listCars = new Car[5];
	public void initValues() {
	listCars[0] = new Car("123", "Chevrolet", "particular", "2.5", 2022, "automovil", "hibrido", 80000000);
	listCars[1] = new Car("124", "Toyota", "publico", "2.7", 2008, "automovil", "diesel", 100000000);
	listCars[2] = new Car("125", "akt", "particular", "2.5", 2022, "moto", "hibrido", 5000000);
	listCars[3] = new Car("126", "bmw", "publico", "2.5", 2022, "automovil", "gasolina", 120000000);
	listCars[4] = new Car("127", "kia", "particular", "2.5", 2022, "carga", "hibrido", 38000000);
	}
	
	public void run(){
		Presenter one = new Presenter();
		one.initValues();
		View first = new View();
		boolean valid = true;
		int taxspays = 0;
		Scanner input = new Scanner(System.in);
		int option = 0;
		
		
		first.showMessage("-------CALCULADOR DE IMPUESTOS---------");
		first.showMessage("Bienvenido!");
		first.showMessage("");
		
		int dateDay = first.readInt("Digite el dia actual: ");
		int dateMonth = first.readInt("Digite el mes actual: ");
		
		if (dateDay > 0 && dateDay <= 31 && dateMonth > 0 && dateMonth <= 12) {
			do {
		        option = first.readInt("\n            Menú Principal \nDigite el numero de la accion que desea realizar: \n 1. Consultar los datos del vehículo "
		        + "\n 2. Modificar los datos del vehículo \n 3. Consultar liquidación de impuesto \n 4. Pagar impuesto liquidado  \n 5. Terminar ");
		        switch (option) {
		        case 1:
		        	int optionCV = first.readInt("Digite de cual vehículo desea consultar los datos: "
		        			+ "\n1. Carro Uno \n2. Carro Dos\n3. Carro Tres \n4. Carro Cuatro \n5. Carro Cinco ")-1;
		        	one.listCars[optionCV].toString();
		        	break;
		        case 2:
		        	int optionMV = first.readInt("Digite de cual vehículo desea modificar los datos: "
		        			+ "\n1. Carro Uno \n2. Carro Dos \n3. Carro Tres \n4. Carro Cuatro \n5. Carro Cinco ")-1;
		        	one.listCars[optionMV].setPlaca(first.readString("Por favor ingrese la placa del vehiculo"));
		        	one.listCars[optionMV].setMarca(first.readString("Por favor ingrese la marca del vehiculo"));
		        	one.listCars[optionMV].setLinea(first.readString("Por favor ingrese la linea del vehiculo. Recuerde que solo hay dos opciones: publico y particular"));;
		        	one.listCars[optionMV].setModel(first.readInt("Por favor ingrese la modelo del vehiculo"));;
		        	one.listCars[optionMV].setVersion(first.readString("Por favor ingrese la version del vehiculo"));;
		        	one.listCars[optionMV].setClassV(first.readString("Por favor ingrese la clase del vehiculo. Recuerde que puede ser: automovil, moto, carga o pasajeros"));;
		        	if (one.listCars[optionMV].classV.equalsIgnoreCase("moto")) {
		        		one.listCars[optionMV].cylinderM = first.readInt("Ingrese el cilindraje de su moto");
		    		}
		        	one.listCars[optionMV].settCombustible(first.readString("Por favor ingrese el tipo de combustible del vehiculo. Recuerde que puede ser: gasolina, Diesel, hibrido, eléctrico"));;
		        	one.listCars[optionMV].setAppraisalValue(first.readInt("Ingrese el avaluo valor de avaluo de su vehículo"));;
		        	break;
		        case 3:
		        	int optionCI = first.readInt("Digite de cual vehículo desea consultar la liquidación del impuesto:"
		        			+ "\n1. Carro Uno \n2. Carro Dos \n3. Carro Tres \n4. Carro Cuatro \n5. Carro Cinco  ")-1;
		        	
		        	one.listCars[optionCI].estateTax();
		        	first.showMessage("El valor de avaluo de su automovil es de: " + one.listCars[optionCI].appraisalValue);
		        	first.showMessage("El valor parcial del impuesto de su automovil es de: " + one.listCars[optionCI].calculateTax());
		        	first.showMessage("El valor por descuento del impuesto de su automovil es de: " + one.listCars[optionCI].calculateDiscount());
		        	if (one.listCars[optionCI].classV.equalsIgnoreCase("moto")) {
		        		first.showMessage("El valor por concepto de semaforizacion es de: " + one.listCars[optionCI].getSemaphoreValue());
		    		}
		        	first.showMessage("El valor total del impuesto de su automovil es de: " + (one.listCars[optionCI].tValueTax() + one.listCars[optionCI].getSemaphoreValue()));
		        	break;
		        case 4:
		        	if (valid == true) {
			        	int optionPI = first.readInt("Digite de cual vehículo desea pagar el impuesto:"
			        			+ "\n1. Carro Uno \n2. Carro Dos \n3. Carro Tres \n4. Carro Cuatro \n5. Carro Cinco  ")-1;
			        	if(one.listCars[optionPI].state == true) {
			     			first.showMessage("Su impuesto ya está pago!");
			     		} else if (one.listCars[optionPI].state == false) {
			     			int pagar;
			        	System.out.println("El valor parcial del impuesto de su automovil es de: " + one.listCars[optionPI].calculateTax());
				 		System.out.println("El valor por descuento del impuesto de su automovil es de: " + one.listCars[optionPI].calculateDiscount());
				 		System.out.println("El valor total del impuesto de su automovil es de: " + (one.listCars[optionPI].tValueTax() + one.listCars[optionPI].getSemaphoreValue()));
				 		pagar = one.listCars[optionPI].maximum.pagar(first.readInt("¿Desea pagar el impuesto de su automovil?   0: no, 1: si"), one.listCars[optionPI].state);
			        	if (pagar == 1) {
				 			taxspays = taxspays + 1;
				 			first.showMessage("Su impuesto acaba de quedar pago"
				 			+ "************************RECIBO***************************"
				 			+ "*   Impuesto parcial de su automovil:-" + one.listCars[optionPI].calculateTax()
				 			+ "*   Descuento:-------------------------" + one.listCars[optionPI].calculateDiscount()
				 			+ "Su impuesto acaba de quedar pago"
				 			+ "************************RECIBO***************************"
				 			+ "*   Impuesto parcial de su automovil:-" + one.listCars[optionPI].calculateTax()
				 			+ "*   Descuento:-------------------------" + one.listCars[optionPI].calculateDiscount());
				 			if (one.listCars[optionPI].classV.equalsIgnoreCase("moto")) {
				 	    		System.out.println("Semaforizacion:---------------------------" + one.listCars[optionPI].semaphoreValue);
				 			}
				 			System.out.println("*   Total:---------------------------" + (one.listCars[optionPI].tValueTax() + one.listCars[optionPI].semaphoreValue));
				 			System.out.println("*   Estado:----------------------------PAGO!");
				 			System.out.println("*   Gracias por su pago. Fue un gusto.");
				 			System.out.println("**********************************************************");
				 			if (taxspays == 5) {
				 				valid = false;
				 			}
				 		} else if(pagar == 0) {
				 			System.out.println("Su impuesto quedara sin pagar");
				 			System.out.println("Animese a pagar su impuesto. Lo esperaremos pronto");
				 		}
			     		}	
		        	} if (valid == false) {
		        		first.showMessage("Ya llego a su maximo de pagos por el dia de hoy");
		        	}
		        	break;
		        case 5:
		        	break;
		        default: 
		        	first.showMessage("Error! Opción invalida. Vuelva a intentar");
		        }
		       } while(option != 5);
			first.showMessage("Ha sido un placer. Vuelva pronto.");
		} else {
			first.showMessage("Error! La fecha es incorrecta vuelva a intentar");
		}
	}
}