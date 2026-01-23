package practice1;

import java.util.Scanner;

public class problem5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter initial balance: ");
		double balance = scanner.nextDouble();
		
		System.out.print("Enter annual interest rate (%): ");
		double interestRate = scanner.nextDouble();
		
		System.out.print("Enter number of years: ");
		int years = scanner.nextInt();
		
		double interest = interestRate / 100.0;
		double newBalance = balance * (1 + interest * years);
		double totalInterest = newBalance - balance;
		
		System.out.printf("Initial balance: $%.2f\n", balance);
		System.out.printf("Annual interest: %.2f%%\n", interestRate);
		System.out.printf("Period: %d years\n", years);
		System.out.printf("Final balance: $%.2f\n", newBalance);
		System.out.printf("Total interest: $%.2f\n", totalInterest);
		
		scanner.close();
	}
}
