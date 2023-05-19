package module;

import module.Platos;

public class Pedido {
	public String nombrPlato = "";
	public double precPlato = 0;
	public double valor = 0;
	
	
	public void pedidoI(double precioPlato) {
		valor = precioPlato;
		System.out.println("El valor de su pedido es: " + valor);
	}
	
	public void pedidoCombUno(String primerPlato, double precioPP, String bebida, double precioB) {
		valor = precioPP + precioB;
		System.out.println("El valor de su pedido es: " + valor);
	}
	
	public void pedidoCombDos(String primerPlato, double precioPP, String  segundoPlato, double precioSP, String Bebida, double precioB) {
		valor = precioPP + precioSP + precioB;
		System.out.println("El valor de su pedido es: " + valor);
	}
	
	public void pedidoCombTres(String PrimerPlato, double precioPP, String  segundoPlato, double precioSP, String Bebida, double precioB, String postre, double precioP) {
		valor = precioPP + precioSP + precioB + precioP;
		System.out.println("El valor de su pedido es: " + valor);
	}
}
