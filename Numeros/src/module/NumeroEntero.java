package module;

public class NumeroEntero {
	private int number = 0;
	
	public NumeroEntero(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void parImpar() {
		if (this.number%2 == 0) {
			System.out.println("Numero Par");
		} else {
			System.out.println("Numero Impar");
		}
	}
		
	public void Signo() {
		if (number < 0) {
			System.out.println("El numero es negativo");
		} else if (number > 0) {
			System.out.println("El numero es positivo");
		}
	}
	
}
