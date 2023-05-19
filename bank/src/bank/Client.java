package bank;

import java.util.Scanner;

public class Client {
    String clientName = "";
    int balance = 0;

    public void clientInfo() {
        System.out.println("el nombre del cliente es: " + clientName + " y el saldo del cliente es : " + balance);
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el monto que desea retirar de la cuenta del cliente");
        int clientAmountR = Integer.parseInt(sc.nextLine());

        if (clientAmountR > balance) {
            System.out.println("no tiene suficientes fondos en su cuenta");
        } else {
            balance = balance - clientAmountR;
            System.out.println("el retiro se ha realizado con exito");
        }

    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el monto que desea consignar a la cuenta del cliente");
        int clientAmountD = Integer.parseInt(sc.nextLine());
        balance += clientAmountD;
        System.out.println("el deposito se ha realizado con exito");
    }
}