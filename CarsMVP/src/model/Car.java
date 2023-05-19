package model;

import java.util.Scanner;

public class Car {
	Scanner input = new Scanner(System.in);
	public Tax maximum = new Tax();
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
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getClassV() {
		return classV;
	}
	public void setClassV(String classV) {
		this.classV = classV;
	}
	
	public int getSemaphoreValue() {
		return semaphoreValue;
	}
	public void setSemaphoreValue(int semaphoreValue) {
		this.semaphoreValue = semaphoreValue;
	}

	public int getCylinderM() {
		return cylinderM;
	}
	public void setCylinderM(int cylinderM) {
		this.cylinderM = cylinderM;
	}
	
	public String gettCombustible() {
		return tCombustible;
	}
	public void settCombustible(String tCombustible) {
		this.tCombustible = tCombustible;
	}

	public double getAppraisalValue() {
		return appraisalValue;
	}
	public void setAppraisalValue(double appraisalValue) {
		this.appraisalValue = appraisalValue;
	}

	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}

	public double getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}
	
	public double gettPriceTax() {
		return tPriceTax;
	}
	public void settPriceTax(double tPriceTax) {
		this.tPriceTax = tPriceTax;
	}

	public String toString() {
		return "Datos del vehiculo \n1. Placa: " + placa + "\n2. Marca: " + marca + "\n3. Linea: " + linea + "\n4. Modelo: " + model + "\n5. Versión: " +version 
				+ "5. Clase: " + classV + "6. Tipo de Combustible: " + tCombustible + "7. Valor de avaluo: " + appraisalValue + "* Cilindraje: " + cylinderM;		
	}
	
	public String estateTax() {
		return maximum.estateTax(state);
	} 
	
	public double calculateTax() {
		return maximum.calculateTax(classV, linea, appraisalValue, cylinderM);
	}
	
	public double calculateDiscount() {
		return maximum.calculateDiscount(model, cylinderM, tCombustible);
	}
	
	public double tValueTax() {
		return maximum.tValueTax(classV, linea, appraisalValue, cylinderM);
	}
}
