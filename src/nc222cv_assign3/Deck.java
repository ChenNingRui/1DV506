package nc222cv_assign3;

import java.util.ArrayList;
import java.util.Collections;

import nc222cv_assign3.Card.RANK;
import nc222cv_assign3.Card.SUITE;

public class Deck {
	private ArrayList<Card> cardList;
	
	public Deck() {
		
		cardList = new ArrayList<Card>();
		for(SUITE suite : SUITE.values()) {
			for(RANK rank : RANK.values()) {
				cardList.add(new Card(suite, rank));
			}
		}
		//System.out.println(cardList);
	}
	
	public void shuffling() {
		if(cardList.size() < 52) {
			System.out.println("It should only be possible to shuffle a deck if it contains 52 cards.");
			return;
		}
			
		Collections.shuffle(cardList);
	}
	
	public int remainingCards() {
		//System.out.println(String.format("Has %d cards left in deck!", cardList.size()));
		return cardList.size();
	}
	
	public Card haveBeenDealt(int index) {
		if(cardList.isEmpty()) {
			System.out.println("No card left!");
			return null;
		}
		
		//return cardList.remove(index);
		return (cardList.get(index) != null) ? cardList.remove(index) : null;
	}
}
