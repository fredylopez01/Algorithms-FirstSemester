package module;

public class Dog {
	public int size;
	public String breed;
	public String name;
	
	public void presentation() {
		System.out.println("El perrito " + name + " de raza " + breed);
	}
	
	public void bark() {
		if (size <= 20) {
			System.out.println("Yip, yip!!");
		} else if (size > 22 && size <= 50) {
			System.out.println("Ruff! Ruff!");
		} else if (size > 50) {
			System.out.println("Gurr, Grrrr !!");
		}
	}
	
	public void bark(int numOfBarks) {
		while (numOfBarks > 0) {
			System.out.println("ruff");
			numOfBarks = numOfBarks - 1;
		}
	}
	
}
