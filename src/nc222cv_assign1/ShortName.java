package nc222cv_assign1;

import java.util.Scanner;

public class ShortName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("First name: ");
		String firstName =  scanner.nextLine();
		System.out.print("Last name: ");
		String surname =  scanner.nextLine();
		
		System.out.println("Short name: " + transferToShortName(firstName, surname));
		
		scanner.close();
	}
	
	private static String transferToShortName(String firstName, String surname) {
		String FN = firstName.substring(0, 1) + ". ";
		String LN = surname.substring(0, 4);
		return FN + LN;
	}
}
