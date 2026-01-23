package practice1;

import java.util.Scanner;
import java.lang.Math;

public class problem2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the side length of the square: ");
		double a = scanner.nextDouble();
		
		double area = a * a;
		double perimeter = 4 * a;
		double diagonal = a * Math.sqrt(2);
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Diagonal: " + diagonal);

		scanner.close();
	}
}
