package nc222cv_assign2;

import java.util.Scanner;

public class CountA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Provide a line of text: ");
		String str = scanner.nextLine();
		
		System.out.println("Number of 'a': " + countinga(str));
		System.out.println("Number of 'A': " + countingA(str));
		
		scanner.close();
	}
	
	private static long countingA(String str) {
		long count = str.codePoints().filter(ch -> ch == 'A').count();
		return count;
	}
	
	private static long countinga(String str) {
		long count = str.codePoints().filter(ch -> ch == 'a').count();
		return count;
	}
}
