package practice1;

import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		
		String wordLower = word.toLowerCase();
		
		StringBuilder temp = new StringBuilder(wordLower);
		temp.reverse();
		String reverse = temp.toString();
		
		if (word.equals(reverse)) {
			System.out.println("String is a Palindrome.");
		} else {
			System.out.println("String is not a Palindrome.");
		}
		 
		scanner.close();
	}
}
