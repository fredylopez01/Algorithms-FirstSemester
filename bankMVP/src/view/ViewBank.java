package view;

import java.util.Scanner;

public class ViewBank {
	Scanner input = new Scanner(System.in);
	
	public int readInt(String message) {
		System.out.println(message);
		int number = Integer.parseInt(input.nextLine());
		return number;
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
	
}