package nc222cv_assign1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Provide radius: ");
		float radius =  Float.parseFloat(scanner.nextLine());
		
		System.out.println("Corresponding area is " + countingArea(radius));
		
		scanner.close();
	}
	
	private static double countingArea(float radius) {
		double area = (float) (Math.PI * radius * radius);
		BigDecimal bigDecimal = new BigDecimal(area);
		area = bigDecimal.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
		return area;
	}
}
