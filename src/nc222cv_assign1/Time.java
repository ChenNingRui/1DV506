package nc222cv_assign1;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Give a number of seconds: ");
		int seconds = Integer.parseInt(scanner.nextLine());
		
		System.out.println("This corresponds to: " + dateFormatFromSeconds(seconds));
		
		scanner.close();
	}
	
	private static String dateFormatFromSeconds(int time) {
		   String timeStr = null;
	        int hour = 0;
	        int minute = 0;
	        int second = 0;
	        if (time <= 0)
	            return "0 hours, 0 minutes and 0 seconds.";
	        else {
	            minute = time / 60;
	            if (minute < 60) {
	                second = time % 60;
	                timeStr = "0 hours, "+ minute + " minutes and " + second + " seconds.";
	            } else {
	                hour = minute / 60;
	                if (hour > 99)
	                    return "99:59:59";
	                minute = minute % 60;
	                second = time - hour * 3600 - minute * 60;
	                timeStr = hour + " hours, "+ minute + " minutes and " + second + " seconds.";
	            }
	        }
	        return timeStr;
		}
}
