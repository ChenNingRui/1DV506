package nc222cv_assign1;

import java.util.Scanner;

public class Quote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write a line of text:");
		String str = scanner.nextLine();
		
		System.out.println("Quote: " + str);
		
		scanner.close();
	}
}
