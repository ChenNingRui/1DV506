package nc222cv_assign3;

public class Play123Main {
	
	public static void main(String[] args) {
		int times = 10000;
		
		timesForPlaying(times);
	}
	
	private static void timesForPlaying(int playTimes) {
		int winTimes = 0;
		for(int i = 0, length = playTimes; i < length; i++) {
			if(playTheGame()) {
				winTimes++;
			}
		}
		winProbability(winTimes, playTimes);
	}
	
	private static boolean playTheGame() {
		Deck deck = new Deck();
		deck.shuffling();
		int count = 0;
		
		for(int i = deck.remainingCards() - 1; i >= 0; i--) {
			Card card = deck.haveBeenDealt(i);
			
			count++;
			
			switch(count) {
			case 1:
				if(card.getRank() == Card.RANK.Ace) {
					return false;
				}
				break;
			case 2:
				if(card.getRank() == Card.RANK.Deuce) {
					return false;
				}
				break;
			case 3:
				if(card.getRank() == Card.RANK.Trey) {
					return false;
				}
				count = 0;
				break;
			}
		}
		
		return true;
	}
	
	private static double winProbability(int winTimes, int playTimes) {
		double probability = ((double) winTimes / (double)playTimes) * 100;
		System.out.println("the probability that you win the game is " + probability + "%");
		
		return probability;
	}
}
