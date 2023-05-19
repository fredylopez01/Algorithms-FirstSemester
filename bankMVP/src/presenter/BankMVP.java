package presenter;

import java.util.Scanner;
import view.ViewBank;
import model.ClientMVP;

public class BankMVP {
	int reserve = 1000000;
	ViewBank one = new ViewBank();
	
	ClientMVP[] client = new ClientMVP[5];

    public void initValues() {
    	client[0] = new ClientMVP("Maria",120000);
    	client[1] = new ClientMVP("Diego",130000);
    	client[2] = new ClientMVP("Manuel",140000);
    	client[3] = new ClientMVP("Marta",150000);
    	client[4] = new ClientMVP("Miguel",160000);
    }
    
    public void Start() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        initValues();
        
        do {
        	option = one.readInt("Digite el numero de la accion que desea realizar: \n" + "1.depositar \n2.retirar \n3.Terminar");
            if (option == 1) {
            	int clientOptionD = one.readInt("Ingrese el numero de cliente a cual desea depositar " + "\n1." + client[0].clientName + "\n2." 
            			+ client[1].clientName + "\n3." + client[2].clientName + "\n4." + client[3].clientName + "\n5." + client[4].clientName);
                deposit(clientOptionD);
            } else if (option == 2) {
            	int clientOptionR = one.readInt("Ingrese el numero de cliente a quien desea retirar" + "\n1." + client[0].clientName + "\n2." 
            			+ client[1].clientName + "\n3." + client[2].clientName + "\n4." + client[3].clientName + "\n5." + client[4].clientName);
                deposit(clientOptionR);
            }
        } while (option != 3);
        reservBank();
        System.out.println("la reserva restante en el banco es de: " + reserve);
        client[0].clientInfo();
        client[1].clientInfo();
        client[2].clientInfo();
        client[3].clientInfo();
        client[4].clientInfo();

    }
    
    public void reservBank() {
        reserve += client[0].balance + client[1].balance + client[2].balance + client[3].balance + client[4].balance;
    }
    
    public void deposit(int x) {
    	int clientAmountD = one.readInt("ingrese el monto que desea consignar a la cuenta del cliente");
    	client[x].deposit(clientAmountD);
    	one.showMessage("El deposito se ha realizado con exito");
    }
    
    public void withdraw(int x) {
    	int clientAmountR = one.readInt("ingrese el monto que desea retirar de la cuenta del cliente");
	        if (clientAmountR > client[x].balance) {
	        	one.showMessage("No tiene suficientes fondos en su cuenta");
	        } else {
	        	client[x].withdraw(clientAmountR);
	        	one.showMessage("El retiro se ha realizado con exito");
	        }
    }
 
    public static void main(String[] args) {
		 BankMVP bankStart = new BankMVP();
	        bankStart.Start();
	}
}