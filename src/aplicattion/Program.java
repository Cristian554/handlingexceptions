package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import exceptions.BusinessException;
import model.entities.Account;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdraw = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdraw);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdrawn(amount);
			System.out.printf("New balance: %.2f ", acc.getBalance());
		}
		catch (BusinessException e ){
			System.out.println(e.getMessage());
		}
		
		
       sc.close();
	}

}
