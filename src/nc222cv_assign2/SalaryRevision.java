package nc222cv_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SalaryRevision {
	public static void main(String[] args) {
		 System.out.println("Provide salaries (and terminate input with 'X'):");
		 Scanner scanner = new Scanner(System.in);
		 ArrayList<Integer> salaryList = new ArrayList<Integer>();
		 String input = "";
		 int i = 1;
		 
		 while(true) {
			 System.out.println("salary " + i + ": ");
			 input = scanner.nextLine();
			 
			 if(input.equals("X") || input.equals("x")) {
				 break;
			 }
			
			 salaryList.add(Integer.parseInt(input));
			 i++;
		 }
		 
		 if(salaryList.size() != 0) {
			 System.out.println("Median: " + countingMedianSalay(salaryList));
			 System.out.println("Average: " + countingAverageSalay(salaryList));
			 System.out.println("Gap: " + countingSalayGap(salaryList));
		 }
		 
		 scanner.close();
	}
	
	private static int countingMedianSalay(ArrayList<Integer> salaryList) {
		int median = 0;
		Collections.sort(salaryList);
		int length = salaryList.size();
		
		if((length & 1) != 0) {//even
			median = salaryList.get(salaryList.size() / 2);
		}
		else if((length & 1) == 0){//odd
			median = (salaryList.get(salaryList.size() / 2) + salaryList.get(salaryList.size() / 2 - 1)) / 2;
		}
		return median;
	}
	
	private static int countingAverageSalay(ArrayList<Integer> salaryList) {
		int sum = 0;
		for(int i = 0, length = salaryList.size(); i < length; i++) {
			sum += salaryList.get(i);
		}
		
		return (int) (Math.round(sum / salaryList.size()));
	}
	
	private static int countingSalayGap(ArrayList<Integer> salaryList) {
		Collections.sort(salaryList);
		return salaryList.get(salaryList.size() - 1) - salaryList.get(0);
	}
	
}
