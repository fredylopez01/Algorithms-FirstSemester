package Comparar;

public class Potencia {
	
	public double base;
	public int exp;
	public double valor;
	
	public Potencia(double base, int exp) {
		this.base = base;
		this.exp = exp;
		this.valor = 1;
		if (exp >0)
		for(; exp > 0; exp--) {
			this.valor = this.valor + base;	
		}
	}
	
	public void display(){
		System.out.println("Base: "+ base + ", Exponente: " + exp + ", Result: " + valor);
	}
	public static void main(String [] args) {
		double a = 2;
		int b = 4;
		Potencia c = new Potencia(a,b);
		c.display();
	}
}
