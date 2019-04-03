package nc222cv_assign2;

import java.util.ArrayList;

public class Divisible {
	public static void main(String[] args) {
		printTheList(divisibleNumber(100, 200, 4, 5), 10);
		//System.out.println(divisibleNumber(100, 200, 3, 4));
	}
	
	private static ArrayList<Integer> divisibleNumber(int minNum, int maxNum, int divNum1, int divNum2) {
		ArrayList<Integer> divisibleList = new ArrayList<Integer>();
		for(int i = minNum; i <= maxNum; i++) {
			if((i % divNum1 == 0) || (i % divNum2 == 0)) {
				divisibleList.add(i);
			}
		}
		return divisibleList;
	}
	
	private static void printTheList(ArrayList<Integer> list, int perLine) {
		String str = "";
		
		for(int i = 1, length = list.size() + 1; i < length; i++) {
			
			str += list.get(i - 1) + " ";
			
			if(i % perLine == 0){
				str += "\n";
			}
		}
		
		System.out.println(str);
	}
}
