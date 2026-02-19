package kz.lab1.problem1;

import java.util.Scanner;

public class Analyzer {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		
		while (true) {
			System.out.print("Enter number (Q to quit): ");
			if (scanner.hasNextDouble()) {
				double value = scanner.nextDouble();
				data.addValue(value);
			}
			else {
				String input = scanner.next();
				if (input.equalsIgnoreCase("Q")) {
					break;
				}
				else {
					System.out.println("Invalid input. Please enter a number or 'Q' to quit.");
				}
			}
		}
		
		System.out.printf("Average = %.1f%n", data.getAverage());
		System.out.printf("Maximum = %.1f%n", data.getMaximum());
		
		scanner.close();
	}

}
