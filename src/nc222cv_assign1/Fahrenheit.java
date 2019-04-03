package nc222cv_assign1;

import java.util.Scanner;

public class Fahrenheit {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Provide a temperature in Fahrenheit: ");
		float fahrenheit =  Integer.parseInt(scanner.nextLine());
		
		System.out.println("Corresponding temperature in Celsius is: " + transformFahrenheitToCelsius(fahrenheit));
		
		scanner.close();
	}
	
	private static double transformFahrenheitToCelsius(float fahrenheit) {
		float celsius;
		celsius = (fahrenheit - 32) / (9f / 5)  ;
		return celsius;
	}

}
