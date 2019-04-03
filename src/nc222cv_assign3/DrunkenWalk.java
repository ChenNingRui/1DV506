package nc222cv_assign3;

import java.util.Scanner;

public class DrunkenWalk {
//	   Enter the size: 10
//	   Enter the number of steps: 50
//	   Enter the number of walks: 150
//	   Out of 150 drunk people, 14 (9.34%) fell into the water.
	public static void main(String[] args) {
		
		int falldown = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int edge = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the number of steps: ");
		int maxSteps = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Enter the number of walks: ");
		
		int drunken = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < drunken; i++) {
			RandomWalk walk = new RandomWalk(maxSteps, edge);
			walk.walk();
			
			if(walk.getFallDown()) {
				falldown++;
			}
		}
		
		double probability = ((double) falldown / (double)drunken) * (double)100;
		
		System.out.println("Out of " + drunken + " drunk people, " 
				+ falldown + "(" + probability  + "%) fell into the water.");
		
		scanner.close();
	}
}
