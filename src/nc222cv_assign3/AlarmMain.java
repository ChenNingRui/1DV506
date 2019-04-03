package nc222cv_assign3;

public class AlarmMain {
//	1. Set clock time to 23:48
//	2. Display time
//	3. Set alarm to wake up at 6:15
//	4. Let the clock "tick" for 500 minutes
//	5. Display time again
	public static void main(String[] args) {
		AlarmClock clock = new AlarmClock(23, 48);
		clock.displayTime();
		clock.setAlarm(6, 15);
		
		for(int i = 0; i < 500; i++) {
			clock.timeTick();
		}
		
		clock.displayTime();
	}
	
}
