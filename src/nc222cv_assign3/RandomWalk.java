package nc222cv_assign3;

import java.util.Random;

public class RandomWalk {
//	X coordinate of the current position
//	Y coordinate of the current position
//	The maximum number of steps in a walk
//	The number of steps taken so far in the walk
//	The size of the plane (according to the description above)
	private int x;
	private int y;
	private int maxSteps;
	private int numOfSteps;
	private int sizeOfPlane;
	private Random random;
	private boolean fallDown;
	
	//the maximum number of steps is max and edge 
	//is the size of the plane. 
	//The start position is set to (0, 0). 
	public RandomWalk(int max, int edge) {
		maxSteps = max;
		sizeOfPlane = edge;
		numOfSteps = 0;
		
		x = 0;
		y = 0;
		
		random = new Random();
		
		fallDown = false;
	} 
	
	//returns a string containing the number of
	//steps taken so far and the current position.
	public String toString() {
		return String.format("the number of steps %d and the current position (%d, %d) ",
				numOfSteps, x, y);
	} 
	
	//simulates taking a single step. 
	//Generate a random number, taking on four different values, 
	//and let them correspond to a movement up, down, 
	//to the right and to the left, respectively. 
	//The method should also increase the number of steps taken.
	private void takeStep() {
		
		int direction = random.nextInt(4) + 1;
		switch(direction) {
		case 1:
			x++;
			//System.out.println("up");
			break;
		case 2:
			x--;
			//System.out.println("down");
			break;
		case 3:
			y++;
			//System.out.println("left");
			break;
		case 4:
			y--;
			//System.out.println("right");
			break;
		}
		
		numOfSteps++;
		
		//System.out.println(toString());
	} 
	
	//returns true if the number of steps taken 
	//is less than the maximal number of steps,
	//otherwise false is returned.
	private boolean moreSteps() {
		if(numOfSteps <= maxSteps)
			return true;
		
		return false;
	} 
	
	//returns true if the current position is inside 
	//the boundary of the plane, otherwise false is returned.
	private boolean inBounds() {
		if(x > sizeOfPlane || x < -sizeOfPlane) {
			fallDown = true;
			//System.out.println("falldown " + fallDown);
			return false;
		}
		else if(y > sizeOfPlane || y < -sizeOfPlane) {
			//System.out.println("falldown " + fallDown);
			fallDown = true;
			return false;
		}

		return true;
	} 
	
	//simulates a random walk, 
	//i.e. steps are taken until the maximum number
	//of steps has been taken or until a 
	//step goes outside the boundary of the plane.
	public void walk() {
		
		for(int i = 0, length = maxSteps; i < length; i++) {
			
			if(!moreSteps())
				return;
			
			takeStep();
			
			if(!inBounds())
				return;
		}
	}

	public boolean getFallDown() {
		return fallDown;
	}

}
