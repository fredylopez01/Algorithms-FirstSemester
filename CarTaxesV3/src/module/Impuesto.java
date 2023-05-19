package module;

import java.util.Scanner;

public class Impuesto {
	Scanner input = new Scanner(System.in);
	double taxValue;
	int taxspays = 0;
	double discount;
	public double tPriceTax = 0;
	public int semaphoreValue;
	Car[] listCars = new Car[5];
	public void initValues() {
	listCars[0] = new Car("123", "Chevrolet", "particular", "2.5", 2022, "automovil", "hibrido", 80000000);
	listCars[1] = new Car("124", "Toyota", "publico", "2.7", 2008, "automovil", "diesel", 100000000);
	listCars[2] = new Car("125", "akt", "particular", "2.5", 2022, "moto", "hibrido", 5000000);
	listCars[3] = new Car("126", "bmw", "publico", "2.5", 2022, "automovil", "gasolina", 120000000);
	listCars[4] = new Car("127", "kia", "particular", "2.5", 2022, "carga", "hibrido", 38000000);
	}
	
	public void estateTax(int optionC) {
		if(listCars[optionC].state == true) {
			System.out.println("Su impuesto ya está pago!");
		} else if (listCars[optionC].state == false) {
			System.out.println("Su impuesto se encuentra sin pagar");
		}
	}
	
	public double calculateTax(int optionC) {
		if (listCars[optionC].classV.equalsIgnoreCase("automovil")||listCars[optionC].classV.equalsIgnoreCase("carga")||listCars[optionC].classV.equalsIgnoreCase("pasajeros")) {
			if (listCars[optionC].linea.equalsIgnoreCase("particular")) {
				if (listCars[optionC].appraisalValue > 0 && listCars[optionC].appraisalValue < 39051000) {
					taxValue = listCars[optionC].appraisalValue*0.015;
				} else if (listCars[optionC].appraisalValue > 39051000 && listCars[optionC].appraisalValue < 87866000) {
					taxValue = listCars[optionC].appraisalValue*0.025;
				} else if (listCars[optionC].appraisalValue > 87866000) {
					taxValue = listCars[optionC].appraisalValue*0.035;
				}
			} else if(listCars[optionC].linea.equalsIgnoreCase("publico")) {
				taxValue = listCars[optionC].appraisalValue*0.005;
			}
		} else if (listCars[optionC].classV.equalsIgnoreCase("moto")) {
			if (listCars[optionC].cylinderM > 125) {
				taxValue = listCars[optionC].appraisalValue*0.015;
			} else if(listCars[optionC].cylinderM < 125 && listCars[optionC].cylinderM > 0)
				taxValue = listCars[optionC].appraisalValue*0;
				semaphoreValue = 60000;
		}
		return taxValue;
	}
	
	public double calculateDiscount(int dateD, int dateM, int optionC) {
		if(dateM <= 4 && dateD <= 30){
			if(listCars[optionC].tCombustible.equalsIgnoreCase("hibrido")) {
				discount = taxValue*0.10;
			} else if(listCars[optionC].tCombustible.equalsIgnoreCase("electrico")) {
				discount = taxValue*0.20;
			} else {
				discount = 0;
			}
		} else if (dateM <= 7 && dateD < 18) {
			discount = 0;
		} else if(dateM >= 7 && dateD >= 18){
			discount = -taxValue*0.10;
		}
	return discount;
}
	
	public double tValueTax(int optionC) {
		tPriceTax = calculateTax(optionC)-discount ;
		return tPriceTax;
	}
	
	public void consultLiquidationTax(int dateDay, int dateMonth, int optionC) {
		estateTax(optionC);
    	System.out.println("El valor de avaluo de su automovil es de: " + listCars[optionC].appraisalValue);
    	System.out.println("El valor parcial del impuesto de su automovil es de: " + calculateTax(optionC));
    	System.out.println("El valor por descuento del impuesto de su automovil es de: " + calculateDiscount(dateDay, dateMonth, optionC));
    	if (listCars[optionC].classV.equalsIgnoreCase("moto")) {
    		System.out.println("El valor por concepto de semaforizacion es de: " + semaphoreValue);
		}
    	System.out.println("El valor total del impuesto de su automovil es de: " + (tValueTax(optionC) + semaphoreValue));
	}
	
	 public void pagar (int optionC, int dateDay, int dateMonth){
		
		 if(listCars[optionC].state == true) {
 			System.out.println("Su impuesto ya está pago!");
 		} else if (listCars[optionC].state == false) {
			 int pagar = 0; 
			 System.out.println("Su impuesto se encuentra sin pagar");
			 mora(optionC);
	 		System.out.println("El valor parcial del impuesto de su automovil es de: " + calculateTax(optionC));
	 		System.out.println("El valor por descuento del impuesto de su automovil es de: " + calculateDiscount(dateDay, dateMonth, optionC));
	 		System.out.println("El valor total del impuesto de su automovil es de: " + (tValueTax(optionC) + mora(optionC)));
	 		System.out.println("¿Desea pagar el impuesto de su automovil?   0: no, 1: si");
	 		pagar = input.nextInt();
	 		if (pagar == 1) {
	 			listCars[optionC].state = true;
	 			taxspays = taxspays + 1;
	 			System.out.println("Su impuesto acaba de quedar pago");
	 			System.out.println("************************RECIBO***************************");
	 			System.out.println("*   Impuesto parcial de su automovil:-" + calculateTax(optionC));
	 			System.out.println("*   Descuento:-------------------------" + calculateDiscount(dateDay, dateMonth, optionC));
	 			if (listCars[optionC].classV.equalsIgnoreCase("moto")) {
	 	    		System.out.println("Semaforizacion:---------------------------" + semaphoreValue);
	 			}
	 			System.out.println("*   Total:---------------------------" + (tValueTax(optionC) + semaphoreValue) + mora(optionC));
	 			System.out.println("*   Estado:----------------------------PAGO!");
	 			System.out.println("*   Gracias por su pago. Fue un gusto.");
	 			System.out.println("**********************************************************");
	 			if (taxspays == 5) {
	 				System.out.println("Ya llego a su limite de pagos. digite la opcion 5 para cerrar sesion.");
	 				System.out.println("Ha sido un placer. Vuelva pronto.");
	 			}
	 		} else if(pagar == 0) {
	 			System.out.println("Su impuesto quedara sin pagar");
	 			System.out.println("Animese a pagar su impuesto. Lo esperaremos pronto");
	 		}
 		}
	 }
	 
	 public double mora(int optionC) {
		 double interes = 0;
		 double vMora = 0;
		 System.out.println("¿Desde que año no paga su impuesto?");
		 int year = input.nextInt();
		 int yearM = 2022 - year;
		 if (yearM == 1) {
			 System.out.println("No tiene mora en el valor de su impuesto Felicidades");
		 } else if (yearM > 1){
			 vMora = tValueTax(optionC)*yearM + 150000;
			 if (listCars[optionC].model > 2000) {
				 interes = vMora*0.05;
			 } else if (listCars[optionC].model <= 2000) {
				 interes = 0;
			 } 
			 System.out.println("El valor por mora del impuesto de su vehiculo es de: " + vMora);
			 System.out.println("Y el interes por esta deuda es de: " + interes);
		 }
		 double vTMora = vMora + interes;
		 return vTMora;
	 }
}