package nc222cv_assign1;

import java.util.Scanner;

public class Change {
	private static int[] valueKinds = new int[]{1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Price: ");
		String price = scanner.nextLine();
		
		System.out.println("Payment: ");
		String payment = scanner.nextLine();
		
		int spareChange = makeChanges(price, payment);
		System.out.println("Change: " + spareChange + " kronor");
		billsAndCoins(spareChange);
		
		scanner.close();
	}
	
	private static int makeChanges(String price, String payment) {
		float spareChange = Float.parseFloat(payment) - Float.parseFloat(price);
		return Math.round(spareChange);
	}
	
	private static void billsAndCoins(int spareChange) {
		   for(int i = 0, length = valueKinds.length; i < length; i++)
		   {
			   int number = 0;
		       while(spareChange >= valueKinds[i] && spareChange > 0)
		       {
		    	   number++;
		    	   spareChange = spareChange - valueKinds[i];
		       }
		       System.out.println(valueKinds[i] + "kr bills: " + number);
		   }  
	} 
}
