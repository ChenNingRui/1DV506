package nc222cv_assign2;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		int max = 1;
		int min = 0;
		int input;
		int times = 10;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= times; i++) {
			System.out.print(String.format("Provide the %d integer: ", i));
			input = Integer.parseInt(scanner.nextLine());
			
			if(i == 0) {
				max = input;
			}
			
			if(input > max) {
				min = max;
				max = input;
			}
			else if(max < input && input >= min) {
				min = input;
			}
		}
		System.out.println("The second largest is: " + min);
		
		scanner.close();
	}

}
