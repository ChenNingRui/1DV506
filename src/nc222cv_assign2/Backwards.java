package nc222cv_assign2;

import java.util.Scanner;

public class Backwards {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Provide a line of text: ");
		String str = scanner.nextLine();
		
		System.out.println("Backwards: " + stringReverse(str));
		
		scanner.close();
	}
	
	private static String stringReverse(String str) {
		StringBuffer strBuff = new StringBuffer(str);  
		strBuff = strBuff.reverse();  
		return strBuff.toString();
	}
}
