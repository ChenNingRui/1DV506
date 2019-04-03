package nc222cv_assign2;

import java.util.Random;

public class TwoDices {
	public static void main(String[] args) {
		int[] diceResult = {0,0,0,0,0,0,0,0,0,0,0,0};
		rollingDices(diceResult);
		System.out.println("Frequencies when rolling two dices 10000 times. ");
		printResult(diceResult);
	}
	
	private static void rollingDices(int[] diceResult) {
		
		int diceOne;
		int diceTwo;
		
		int times = 10000;
		
		Random random = new Random();
		
		for(int i = 0; i < times; i++) {
			diceOne = random.nextInt(6) + 1;
			diceTwo = random.nextInt(6) + 1;
			
			diceResult[diceOne + diceTwo - 1]++;
		}
	}
	
	private static void printResult(int[] diceResult) {
		for(int i = 0, length = diceResult.length; i < length; i++) {
			
			if(i == 0)
				continue;
			
			System.out.println(i + 1 + ": " + diceResult[i]);
		}
	}
}
