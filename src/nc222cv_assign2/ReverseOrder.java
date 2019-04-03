package nc222cv_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseOrder {
	 public static void main(String[] args) {
		 System.out.println("Enter positive integers. End by giving a negative integer.");
		 Scanner scanner = new Scanner(System.in);
		 String inputStr;
		 int inputInt;
		 ArrayList<Integer> inputList = new ArrayList<Integer>();
		 
		 while(true) {
			 System.out.print("Integer " + (inputList.size() + 1) + ": ");
			 inputStr = scanner.nextLine();
			 
			 if(!isInteger(inputStr)) {
				 System.out.println("Integer only!");
				 continue;
			 }
			 
			 inputInt = Integer.parseInt(inputStr);
			
			 if(inputInt < 0) {
				 System.out.println("Number of positive integers: " + inputList.size());
				 System.out.print("In reverse order: ");
				 Collections.reverse(inputList);
				 System.out.print(inputList);
				 
				 break;
			 }
			 
			 inputList.add(inputInt);
		 }
		 
		 scanner.close();
	 }
	 
	 
	 private static boolean isInteger(String str) {  
		 Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
		 return pattern.matcher(str).matches();  
	}
}
