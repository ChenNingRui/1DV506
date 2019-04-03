package nc222cv_assign1;

import java.util.Scanner;

public class SumOfThree {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Provide a three digit number: ");
		String number = scanner.nextLine();
		
		System.out.println("Sum of digits: " + plus(number));
		
		scanner.close();
	}
	
	public static String plus(String number) {
		int sum = 0;
		String[] numberList = number.split("");
		for(int i = 0, length = numberList.length; i < length; i++) {
			sum += Integer.parseInt(numberList[i]);
		}
		
		return Integer.toString(sum);
	}
}
