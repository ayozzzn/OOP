package practice1;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		int length = name.length();
		
		String border = "+" + "-".repeat(length) + "+";
		
		System.out.println(border);
		System.out.println("|" + name + "|");
		System.out.println(border);
		
		scanner.close();
	}
}
