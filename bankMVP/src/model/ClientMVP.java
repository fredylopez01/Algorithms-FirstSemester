package model;

import java.util.Scanner;

public class ClientMVP {
	 public String clientName = "";
	 public int balance = 0;
	 
	 	public ClientMVP(String clientName, int balance) {
			this.clientName = clientName;
			this.balance = balance;
	    }

		public void clientInfo() {
	        System.out.println("el nombre del cliente es: " + clientName + " y el saldo del cliente es : " + balance);
	    }

	    public void withdraw(int clientAmountR) {
	            balance = balance - clientAmountR;
	    }

	    public void deposit(int clientAmountD) {
	        balance += clientAmountD;
	    }
}