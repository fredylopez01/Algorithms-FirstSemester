package test;
import module.Dog;

public class DogTestDrive {

	public static void main(String[] args) {
		Dog luna = new Dog();
		luna.name = "luna";
		luna.size = 4;
		luna.breed = "Pudul";
		luna.presentation();
		luna.bark();
		
		Dog fido = new Dog();
		fido.size = 35;
		fido.name = "fido";
		fido.breed = "Bulldog";
		fido.presentation();
		fido.bark();
		
		Dog guffi = new Dog();
		guffi.size = 52;
		guffi.name = "guffi";
		guffi.breed = "Pastor Aleman";
		guffi.presentation();
		guffi.bark();
		
		System.out.println("");
		Dog d = new Dog();
		d.bark(3);

	}

}
