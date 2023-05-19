package test;
import model.Product;

public abstract class Tienda {

	public static void main(String[] args) {
		
		Product lapiz = new Product("lapiz", "papeleria", 5, 18, 0, 550.0, 553.0);
		
		lapiz.getnombre();
		

	}

}
