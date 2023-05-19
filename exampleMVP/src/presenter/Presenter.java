package presenter;

import model.Calculator;
import view.View;

public class Presenter {
	private Calculator calculator;
	private View view;

	public Presenter() {
		calculator = new Calculator();
		view = new View();
	}

	public void run() {
		int option = 0;
		while (option != 3) {
			option = showMenu();
			switch (option) {
				case 1:
					add();
					break;
				case 2:
					sub();
					break;
				case 3:
					end();
					break;
			}
		}
	}

	public int showMenu() {
		int option = view.readInt("MENU PRINCIPAL \n1 sumar \n2 restar\n3 salir \n\nDigite opcion");
		return option;
	}

	public void add() {
		int a = view.readInt("ingrese primer numero");
		int b = view.readInt("ingrese segundo numero");
		int result = calculator.add(a, b);
		view.showMessage("la suma es " + result + "\n\n");
	}

	public void sub() {
		int a = view.readInt("ingrese primer numero");
		int b = view.readInt("ingrese segundo numero");
		int result = calculator.sub(a, b);
		view.showMessage("la resta es " + result + "\n\n");
	}

	public void end() {
		System.exit(0);
	}

	public static void main(String[] args) {
		new Presenter().run();
	}

}
