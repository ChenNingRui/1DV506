package nc222cv_assign1;

import java.util.Scanner;

public class Interest {
	
	public static void main(String[] args) {
		int years = 5;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Initial savings: ");
		int initialSaving = Integer.parseInt(scanner.nextLine());
		System.out.print("Interest rate (in percentages): ");
		int interestRate = Integer.parseInt(scanner.nextLine());
		
		System.out.println("The value of your savings after 5 years is: " + counting(initialSaving, interestRate, years));
		
		scanner.close();
	}
	
	private static int counting(int initialSaving, int interestRate, int years) {
		float rate = ((float)interestRate / 100) + 1;
		int afterSaving = (int) Math.round(initialSaving * Math.pow(rate, years));
		return afterSaving;
	}
}
