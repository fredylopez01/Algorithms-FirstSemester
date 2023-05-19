package view;

import java.util.Scanner;

public class View {
	private Scanner input;
	
	public View() {
		input = new Scanner(System.in);
	}
	
	public String readString(String message) {
		System.out.println(message);
		String words = input.nextLine();
		return words;
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
