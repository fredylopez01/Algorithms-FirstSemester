package model;

public class Vendedor {
	private long documentoId = 0;
	private String nombre = "";
	private int tipo;
	private double vVentas = 0;
	
	public Vendedor(int documentoId, String nombre, int tipo, double vVentas) {
		this.documentoId = documentoId;
		this.nombre = nombre;
		this.tipo = tipo;
		this.vVentas = vVentas;
	}
	
	public long getDocumentoId() {
		return documentoId;
	}
	
	public void setDocumentoId(long documentoId) {
		this.documentoId = documentoId;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double getVVentas() {
		return vVentas;
	}
	
	public void setVVentas(double vVentas) {
		this.vVentas = vVentas;
	}
	
	public double liquidarComision() {
		double vComision = 0;
		if (tipo == 1) {
			vComision = vVentas *0.25;
		} else if (tipo == 2) {
			vComision = vVentas *0.20;
		}
		System.out.println("El valor por comision del trabador es de: " + vComision);
		return vComision;
	}
}
