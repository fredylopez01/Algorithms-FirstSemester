package module;

import java.util.Scanner;

public class Car {
	Scanner input = new Scanner(System.in);
	public String placa;
	public String marca;
	public String linea;
	public String version;
	public int model;
	public String classV;
	public int cylinderM = 0;
	public String tCombustible;
	public double appraisalValue;
	public boolean state;
	public double taxValue;
	double discount = 0;
	public double tPriceTax = 0;
	
	public Car(String placa, String marca, String linea, String version, int model, String classV, String tCombustible,
			double appraisalValue, boolean state) {
		this.placa = placa;
		this.marca = marca;
		this.linea = linea;
		this.version = version;
		this.model = model;
		this.classV = classV;
		this.tCombustible = tCombustible;
		this.appraisalValue = appraisalValue;
		this.state = state;
	}
	
	public void consultarDatos() {
		System.out.println("Datos del vehiculo");
		System.out.println("1. Placa: " + placa);
		System.out.println("2. Marca: " + marca);
		System.out.println("2. Linea: " + linea);
		System.out.println("4. Modelo: " + model);
		System.out.println("3. Versión: " +version);
		System.out.println("5. Clase: " + classV);
		System.out.println("6. Tipo de Combustible: " + tCombustible);
		System.out.println("7. Valor de avaluo: " + appraisalValue);
	}

	public void modifyData() {
		System.out.println("Por favor ingrese la placa del vehiculo");
		placa = input.next();
		System.out.println("Por favor ingrese la marca del vehiculo");
		marca = input.next();
		System.out.println("Por favor ingrese la linea del vehiculo. Recuerde que solo hay dos opciones: publico y particular");
		linea = input.next();
		System.out.println("Por favor ingrese la modelo del vehiculo");
		model = input.nextInt();
		System.out.println("Por favor ingrese la version del vehiculo");
		version = input.next();
		System.out.println("Por favor ingrese la clase del vehiculo. Recuerde que puede ser: automovil, moto, carga o pasajeros");
		classV = input.next();
		if (classV.equalsIgnoreCase("moto")) {
			System.out.println("Ingrese el cilindraje de su moto");
			cylinderM = input.nextInt();
		}
		System.out.println("Por favor ingrese el tipo de combustible del vehiculo. Recuerde que puede ser: gasolina, Diesel, hibrido, eléctrico");
		tCombustible = input.next();
		System.out.println("Ingrese el avaluo valor de avaluo de su vehículo");
		appraisalValue = input.nextDouble();
	}
	
	public void estateTax() {
		if(state == true) {
			System.out.println("Su impuesto ya está pago!");
		} else if (state == false) {
			System.out.println("Su impuesto se encuentra sin pagar");
		}
	}
	
	public double calculateTax() {
		if (classV.equalsIgnoreCase("automovil")||classV.equalsIgnoreCase("carga")||classV.equalsIgnoreCase("pasajeros")) {
			if (linea.equalsIgnoreCase("particular")) {
				if (appraisalValue > 0 && appraisalValue < 39051000) {
					taxValue = appraisalValue*0.015;
				} else if (appraisalValue > 39051000 && appraisalValue < 87866000) {
					taxValue = appraisalValue*0.025;
				} else if (appraisalValue > 87866000) {
					taxValue = appraisalValue*0.035;
				}
			} else if(linea.equalsIgnoreCase("publico")) {
				taxValue = appraisalValue*0.005;
			}
		} else if (classV.equalsIgnoreCase("moto")) {
				taxValue = appraisalValue*0.015;
		}
		return taxValue;
	}
	
	public double calculateDiscount(int dateD, int dateM) {
			if(dateM <= 4 && dateD <= 30){
				if(tCombustible.equalsIgnoreCase("hibrido")) {
					discount = taxValue*0.10;
				} else if(tCombustible.equalsIgnoreCase("electrico")) {
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
	
	public double tValueTax() {
		tPriceTax = calculateTax()-discount ;
		return tPriceTax;
	}
}
