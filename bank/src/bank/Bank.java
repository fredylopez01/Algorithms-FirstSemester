package bank;

import java.util.Scanner;

public class Bank {

    int reserve = 1000000;
    Client client1 = new Client();
    Client client2 = new Client();
    Client client3 = new Client();
    Client client4 = new Client();
    Client client5 = new Client();

    public void initValues() {
        client1.clientName = "Maria";
        client2.clientName = "Diego";
        client3.clientName = "Manuel";
        client4.clientName = "Marta";
        client5.clientName = "Miguel";

        client1.balance = 120000;
        client2.balance = 130000;
        client3.balance = 140000;
        client4.balance = 150000;
        client5.balance = 160000;

    }

    public void Start() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        initValues();
        do {
            System.out.println("digite el numero de la accion que desea realizar:");
            System.out.println("1.depositar \n2.retirar \n3.Terminar");
            option = Integer.parseInt(sc.nextLine());

            if (option == 1) {
                System.out.println("ingrese el numero de cliente a cual desea depositar ");
                System.out.println("1." + client1.clientName + "\n2." + client2.clientName + "\n3." + client3.clientName
                        + "\n4." + client4.clientName + "\n5." + client5.clientName);
                int clientOptionD = Integer.parseInt(sc.nextLine());
                switch (clientOptionD) {
                    case 1:
                        client1.deposit();
                        break;
                    case 2:
                        client2.deposit();
                        break;
                    case 3:
                        client3.deposit();
                        break;
                    case 4:
                        client4.deposit();
                        break;
                    case 5:
                        client5.deposit();
                        break;
                }

            } else if (option == 2) {
                System.out.println("ingrese el numero de cliente a quien desea retirar");
                System.out.println("1." + client1.clientName + "\n2." + client2.clientName + "\n3." + client3.clientName
                        + "\n4." + client4.clientName + "\n5." + client5.clientName);
                int clientOptionR = Integer.parseInt(sc.nextLine());
                switch (clientOptionR) {
                    case 1:
                        client1.withdraw();
                        break;
                    case 2:
                        client2.withdraw();
                        break;
                    case 3:
                        client3.withdraw();
                        break;
                    case 4:
                        client4.withdraw();
                        break;
                    case 5:
                        client5.withdraw();
                        break;
                    default:
                    	System.out.println("Error! Opcion no valida");

                }

            }
        } while (option != 3);
        reservBank();
        System.out.println("la reserva restante en el banco es de: " + reserve);
        client1.clientInfo();
        client2.clientInfo();
        client3.clientInfo();
        client4.clientInfo();
        client5.clientInfo();

    }

    public void reservBank() {
        reserve += client1.balance + client2.balance + client3.balance + client4.balance + client5.balance;
    }
}