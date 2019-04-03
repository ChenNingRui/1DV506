package nc222cv_assign2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 if(isPalindrom(scanner.nextLine())) {
    		 System.out.println("It is a Palindrom!");
    	 }
    	 else {
    		 System.out.println("It is not a Palindrom!");
    	 }
    	 scanner.close();
    }

    private static boolean isPalindrom(String str){
    	return str.equals(new StringBuilder(str).reverse().toString());
    }
}
