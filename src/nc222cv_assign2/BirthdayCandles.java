package nc222cv_assign2;

public class BirthdayCandles {
	public static void main(String[] args) {
		
		int contain = 24;
		int left = 0;
		int buy = 0;
		int total = 0;
		
		for(int year = 1, length = 100; year <= length; year++) {
			
			if(left - year < 0) {
				if((year - left) % contain != 0) {
					buy = ((year - left) / contain) + 1;
				}
				else {
					buy = ((year - left) / contain);
				}
				
				left = buy * contain + left - year;
			}
			else {
				left -= year; 
			}
				
			if(buy != 0) {
				System.out.println(String.format("Before birthday %d, buy %d box(es)", year, buy));
				total += buy;
				buy = 0;
			}
		}
		
		System.out.println(String.format("Total number of boxes: %d, Remaining candles: %d", total, left));
	}
}
