package nc222cv_assign2;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide an odd positive integer: ");
		
		int column = Integer.parseInt(scanner.nextLine());
		
		if((column & 1) == 0 || column < 3) {
			System.out.println("The number is not an odd positive integer or lower than 3");
		}
		else {
			System.out.println("Right-Angled Triangle:");
			drawRightAngledTriangle(column);
			
			System.out.println("Isosceles Triangle:");
			drawIsoscelesTriangle(column);
		}
		
		scanner.close();
	}
	
	private static void drawRightAngledTriangle(int row) {
		for(int i = row; i >= 0; i--) {
			String triangle = "";
			
			for(int space = 1; space <= row - i; space++) {
				triangle += " ";
			}
			
			for(int star = row; star > row - i; star--) {
				 triangle += "*";
			}
			
			System.out.println(triangle);
		}
	}
	
	private static void drawIsoscelesTriangle(double column) {
		int layer = (int) Math.ceil(column / 2);
		
		for(int i = 0; i < layer; i++) {
			String triangle = "";
			
			for(int space = 1; space <= (column / 2) - i; space++) {
				triangle += " ";
			}
			
			for(int star = 0; star < i * 2 + 1; star++) {
				 triangle += "*";
			}
			System.out.println(triangle);
		}
	}
}
