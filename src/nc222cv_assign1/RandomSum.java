package nc222cv_assign1;

import java.util.Random;

public class RandomSum {
	public static void main(String[] args) {
		int[] randomNumList = getRandomNumberList(5);
		printRandomNum(randomNumList);
		System.out.println("There sum is " + counting(randomNumList));
	}
	
	private static int[] getRandomNumberList(int length) {
		Random random = new Random();
		int[] result = new int[length];
		for (int i = 0;i < length; i++)
		{
			result[i] = random.nextInt(100) + 1;
		}
		return result;
	}
	
	private static void printRandomNum(int[] randomNumList) {
		String str = "Five random numbers: ";
		for(int i = 0, length = randomNumList.length; i < length; i++) {
			str += randomNumList[i] + " ";
		}
		System.out.println(str);
	}
	
	private static int counting(int[] randomNumList) {
		int sum = 0;
		for(int i = 0, length = randomNumList.length; i < length; i++) {
			sum += randomNumList[i];
		}
		return sum;
	}
}
