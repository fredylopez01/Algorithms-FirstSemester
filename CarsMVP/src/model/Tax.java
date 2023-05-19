package model;

import java.util.Scanner;

import model.Car;

public class Tax {
	Scanner input = new Scanner(System.in);
	double taxValue;
	int taxspays = 0;
	double discount;
	public double tPriceTax = 0;
	public int semaphoreValue;
	public boolean valid = true;
	
	public String estateTax(boolean state) {
		String message = "";
		if(state == true) {
			message = "Su impuesto ya está pago!";
		} else if (state == false) {
			message = "Su impuesto se encuentra sin pagar";
		}
		return message;
	}
	
	public double calculateTax(String classV, String linea, double appraisalValue, int cylinderM) {
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
			if (cylinderM > 125) {
				taxValue = appraisalValue*0.015;
			} else if(cylinderM < 125 && cylinderM > 0)
				taxValue = appraisalValue*0;
				semaphoreValue = 60000;
		}
		return taxValue;
	}
	
	public double calculateDiscount(int dateD, int dateM, String tCombustible) {
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
	
	public double tValueTax(String classV, String linea, double appraisalValue, int cylinderM) {
		tPriceTax = calculateTax(classV, linea, appraisalValue, cylinderM)-discount ;
		return tPriceTax;
	}
	
	 public int pagar (int pagar, boolean state){
			if (pagar == 0) {
				state = false;
			} else if (pagar == 1) {
				state = true;
			}
			return pagar;
 		}
}
