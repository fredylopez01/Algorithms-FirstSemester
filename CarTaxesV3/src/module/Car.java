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
	public int semaphoreValue;
	public int cylinderM = 0;
	public String tCombustible;
	public double appraisalValue;
	public boolean state = false;
	
	public double taxValue;
	double discount = 0;
	public double tPriceTax = 0;
	
	public Car(String placa, String marca, String linea, String version, int model, String classV, String tCombustible,
			double appraisalValue) {
		this.placa = placa;
		this.marca = marca;
		this.linea = linea;
		this.version = version;
		this.model = model;
		this.classV = classV;
		this.tCombustible = tCombustible;
		this.appraisalValue = appraisalValue;
	}
	
	public void consultDates() {
		System.out.println("Datos del vehiculo");
		System.out.println("1. Placa: " + placa);
		System.out.println("2. Marca: " + marca);
		System.out.println("2. Linea: " + linea);
		System.out.println("4. Modelo: " + model);
		System.out.println("3. Versión: " +version);
		System.out.println("5. Clase: " + classV);
		if (classV.equalsIgnoreCase("moto")) {
			System.out.println("-Cilindraje: " + cylinderM);
		}
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
}