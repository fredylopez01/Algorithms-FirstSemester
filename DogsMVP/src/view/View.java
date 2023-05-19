package view;

import java.util.Scanner;

public class View {
  Scanner sc;

  public View() {
    sc = new Scanner(System.in);
  }

  public void showMessage(String message) {
    System.out.println(message);
  }

  public String readString(String message) {
    System.out.println(message);
    return sc.nextLine();
  }

  public String readString() {
    return sc.nextLine();
  }

  public int readInt(String message) {
    System.out.println(message);
    int number = Integer.parseInt(sc.nextLine());
    return number;
  }

  public int readInt() {
    System.out.println("Por favor, digite un  numero entero:");
    int number = Integer.parseInt(sc.nextLine());
    return number;
  }

}
