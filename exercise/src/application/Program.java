package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account ( number, holder, initialDeposit);
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(account);
		}
		else {
			System.out.println();
			System.out.println("Account data: ");
			account = new Account (number, holder);
			System.out.println(account);
		}
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);
	
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
