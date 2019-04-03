package nc222cv_assign3;

public class PlayCardsMain {
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		deck.shuffling();
		deck.remainingCards();
		Card card= deck.haveBeenDealt(3);
		System.out.println("suite " + card.getSuite() + ", rank " + card.getRank());
		deck.remainingCards();
	}
}
