package nc222cv_assign3;

public class FractionMain {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 6);
		System.out.println("add: " + f1.add(f2));
		System.out.println("subtract: " + f1.subtract(f2));
		System.out.println("multiply: " + f1.multiply(f2));
		System.out.println("devide: " + f1.devide(f2));
		System.out.println("isEqualTo: " + f1.isEqualTo(f2));
		f1.toString();
	}
}
