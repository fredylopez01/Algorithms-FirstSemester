package module;
import java.util.Scanner;

public class Conductor {
	Scanner input = new Scanner(System.in);
	public long cedula = 0;
	public String nombre = "";
	private int clase;
	public double vPasajes = 0;
	public double comisionP = 0;
	public double vEncomiendas = 0;
	public double comisionE = 0;
	public double sueldo = 0;
	
	public Conductor(long cedula, String nombre, int clase){
		this.cedula = cedula;
		this.nombre = nombre;
		this.clase = clase;
	}
	
	public double liquidacionCP() {
		if (clase == 1) {
			comisionP = vPasajes*0.30;
		} else if(clase == 2){
			comisionP = vPasajes*0.20;
		} else {
			System.out.println("Error. Intente nuevamente");
		}
		return comisionP;
	}
	
	public double liquidacionCE() {
		if (clase == 1) {
			comisionE = vEncomiendas*0.20;
		} else if(clase == 2){
			comisionE = vEncomiendas*0.15;
		} else {
			System.out.println("Error. Intente nuevamente");
		}
		return comisionE;
	}
	public double sueldoT() {
		sueldo = comisionP + comisionE;
		return sueldo;
	}
}
