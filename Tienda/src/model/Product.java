package model;
import java.util.Scanner;

public class Product {
	public String nombre;
	public String tipo;
	public int cantidadM;
	public int cantidadB;
	public int cantidadV;
	public double precioU;
	public double precioF;
	
	
	public Product(String nombre, String tipo, int cantidadM, int cantidadB, int cantidadV, double precioU, double precioF) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.cantidadM = cantidadM;
		this.cantidadB = cantidadB;
		this.cantidadV = cantidadV;
		this.precioU = precioU;
		this.precioF = precioF;
		
	}
	
	public void vender() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto que desea vender");
		String nombre = input.next();
		System.out.println("Ingrese la cantidad del producto");
		
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public String gettipo() {
		return tipo;
	}
	
	public int getcantidadM() {
		return cantidadM;
	}
	
	public int getcantidadB() {
		return cantidadB;
	}
	
	public int getcantidadV() {
		return cantidadV;
	}
	
	public double getprecioU() {
		return precioU;
	}
	
	public double getprecioF() {
		return precioF;
	}
	
}
