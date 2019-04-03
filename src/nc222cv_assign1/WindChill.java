package nc222cv_assign1;

import java.math.BigDecimal;
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Temperature (C): ");
		double temperature = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Wind speed (m/s): ");
		double velocity = Double.parseDouble(scanner.nextLine());//mps
		
		velocity = transformMpsToKph(velocity);//kph
		System.out.println("Wind Chill Temperature (C): " + computesTwc(temperature, velocity));
		
		scanner.close();
	}
	
	private static double transformMpsToKph(double mps) {
		double kph = mps * 3.6;
		return kph;
	}
	
	private static double computesTwc(double temperature, double velocity) {
		//Twc = 13.12 + 0.6215*T - 11.37*V^{0.16} + 0.3965*T*V^{0.16}
		double twc =((13.12) + (0.6215*temperature) - (11.37*(Math.pow(velocity,0.16))) + (0.3965*temperature*(Math.pow(velocity,0.16))));
		BigDecimal bigDecimal = new BigDecimal(twc);
		twc = bigDecimal.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
		return twc;
	}
}
