package nc222cv_assign2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = 0;
		int randomNum = getRandomNum(100);
		int maxTimes = 10;
		String clue;
		String input;
		
		while(true) {
			input = scanner.nextLine();
			times++;

			clue = checkTheNumber(randomNum, Integer.parseInt(input));
			System.out.println("Guess " + times + ": " + input);
			
			if(clue == "correct") {
				System.out.println(String.format("   Correct answer after only %d guesses – Excellent!", times));
				break;
			}
			else if(times <= maxTimes){
				System.out.println("   Clue: " + clue);
			}
			else {
				System.out.println(String.format("   The maximun guesses times is %d", maxTimes));
				break;
			}
		}
		
		scanner.close();
	}
	
	private static int getRandomNum(int seed) {
		Random random = new Random();
		int randomNum = random.nextInt(seed) + 1;
		System.out.println(randomNum);
		return randomNum;
	}
	
	private static String checkTheNumber(int guess, int randomNum) {
		String resultStr = "";
		if(randomNum < guess){
			resultStr = "lower";
		}
		else if(randomNum > guess) {
			resultStr = "higher";
		}
		else {
			resultStr = "correct";
		}
		return resultStr;
	}
}
