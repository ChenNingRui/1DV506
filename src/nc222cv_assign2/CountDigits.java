package nc222cv_assign2;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Provide a positive integer: ");
		String input = scanner.nextLine();
		sum(input);
		
		scanner.close();
	}
	
	private static void sum(String input) {
		
		int zeroSum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		if(Integer.parseInt(input) < 0) {
			System.out.println("Not a positive integer!");
		}
		else {
			for(int i = 0, length = input.split("").length; i < length; i++) {
				int num = Integer.parseInt(input.split("")[i]);
				if(num == 0) {
					zeroSum++;
				}
				else if((num & 1) == 0) {
					evenSum++;
				}
				else if((num & 1) != 0) {
					oddSum++;
				}
			}
			
			System.out.println("Zeros: " + zeroSum);
			System.out.println("Odd: " + oddSum);
			System.out.println("Even: " + evenSum);
		}
	}
}
