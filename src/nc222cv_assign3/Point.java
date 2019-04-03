package nc222cv_assign3;

public class Point {
	private int x, y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() { // method syntax
		return "(" + x + "," + y + ")"; // return string
	}
	
	public boolean isEqualTo(Point point) {
		if(x == point.getX() && y == point.getY()) {
			return true;
		}
		return false;
	}
	
	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2));
	}
	
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void moveToXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
