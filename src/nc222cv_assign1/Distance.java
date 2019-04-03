package nc222cv_assign1;

import java.awt.Point;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First Coordinates is \"(x,y)\": ");
		String firstCoordinates =  scanner.nextLine();
		System.out.print("Second Coordinates is \"(x,y)\": ");
		String secondCoordinates = scanner.nextLine();
		
		double distance = countingDistance(transformStringToPoint(firstCoordinates), transformStringToPoint(secondCoordinates));
		System.out.println("distance is: " + distance);
		
		scanner.close();
	}
	
	private static Point transformStringToPoint(String str) {
		
		int x = Integer.parseInt(str.subSequence(1, 2).toString());
		int y = Integer.parseInt(str.subSequence(3, 4).toString());
		Point p = new Point(x, y);
		return p;
	}
	
	private static double countingDistance(Point p1, Point p2) {
		double distance = 0;
		distance = Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2);
		distance = Math.sqrt(distance);
		return distance;
	}

}
