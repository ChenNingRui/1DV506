package nc222cv_assign3;

public class Card {
	
	public enum SUITE {  
		HEARTS,
		TILES,
		CLOVERS,
		PIKES
	}
	
	public enum RANK{
		Ace,
		Deuce,
		Trey,
		Four,
		Five,
		Six,
		Seven,
		Eight,
		Nine,
		Ten,
		King,
		Queen,
		Jack
	}
	
	private SUITE suite;
	private RANK rank;
	
	public Card(SUITE suite, RANK rank) {
		this.suite = suite;
		this.rank = rank;
	}
	
	public SUITE getSuite() {
		return suite;
	}
	
	public RANK getRank() {
		return rank;
	}
}
