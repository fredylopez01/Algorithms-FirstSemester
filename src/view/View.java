package view;

import java.util.Scanner;

public class View {
	Scanner input = new Scanner(System.in);
	
	public String readName(String message) {
		System.out.println(message);
		String name = input.nextLine();
		return name;
	}
	
	public int readInt(String message) {
		System.out.println(message);
		int number = Integer.parseInt(input.nextLine());
		return number;
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
}