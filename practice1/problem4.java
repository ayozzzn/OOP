package practice1;

import java.util.Scanner;

public class problem4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter coefficient a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Enter coefficient b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Enter coefficient c: ");
		double c = scanner.nextDouble();
		
		double D = b * b - 4 * a * c;
		
		if (D > 0) {
			
			double sqrtD = Math.sqrt(D);
			double denominator = 2 * a;
			
			double x1 = (-b + sqrtD) / denominator;
			double x2 = (-b - sqrtD) / denominator;
			
			System.out.println("Two real roots: ");
			System.out.printf("x₁ = %.4f\n", x1);
			System.out.printf("x₂ = %.4f\n", x2);
			
		} else if (D == 0) {
			
			double x = -b / (2 * a);
			
			System.out.println("One real root: ");
			System.out.printf("x = %.4f\n", x);
			
		} else {
			System.out.println("Error.");
		}
		scanner.close();
	}
}
