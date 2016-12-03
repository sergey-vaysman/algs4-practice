package me.vaysman.algorithms.practice.e14;

import static me.vaysman.algorithms.practice.e13.domain.Suit.CLUB;
import static me.vaysman.algorithms.practice.e13.domain.Suit.HEART;
import static me.vaysman.algorithms.practice.e13.domain.Value.ACE;
import static me.vaysman.algorithms.practice.e13.domain.Value.EIGHT;
import static me.vaysman.algorithms.practice.e13.domain.Value.KING;
import static me.vaysman.algorithms.practice.e13.domain.Value.KNAVE;
import static me.vaysman.algorithms.practice.e13.domain.Value.NINE;
import static me.vaysman.algorithms.practice.e13.domain.Value.QUEEN;
import static me.vaysman.algorithms.practice.e13.domain.Value.SEVEN;
import static me.vaysman.algorithms.practice.e13.domain.Value.SIX;
import static me.vaysman.algorithms.practice.e13.domain.Value.TEN;

import me.vaysman.algorithms.practice.e13.Deck;
import me.vaysman.algorithms.practice.e13.domain.Card;

public class OneSuitDeck {

	private Card[] cards;
	
	{
		cards = new Card[18];
		cards[0] = new Card(CLUB, KNAVE);
		cards[1] = new Card(CLUB, TEN);  
		cards[2] = new Card(CLUB, NINE); 
		cards[3] = new Card(CLUB, ACE); 
		cards[4] = new Card(CLUB, KING);  
		cards[5] = new Card(CLUB, QUEEN); 
		cards[6] = new Card(CLUB, SEVEN); 
		cards[7] = new Card(CLUB, EIGHT); 
		cards[8] = new Card(CLUB, SIX);
		cards[9] = new Card(HEART, KNAVE);
		cards[10] = new Card(HEART, TEN);  
		cards[11] = new Card(HEART, NINE); 
		cards[12] = new Card(HEART, ACE); 
		cards[13] = new Card(HEART, KING);  
		cards[14] = new Card(HEART, QUEEN); 
		cards[15] = new Card(HEART, SEVEN); 
		cards[16] = new Card(HEART, EIGHT); 
		cards[17] = new Card(HEART, SIX); 	
	}
	
	public Deck get() {
		return new Deck(cards);
	}
	
}
