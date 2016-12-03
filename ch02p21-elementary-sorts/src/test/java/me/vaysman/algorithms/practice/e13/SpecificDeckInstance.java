package me.vaysman.algorithms.practice.e13;

import static me.vaysman.algorithms.practice.e13.domain.Suit.CLUB;
import static me.vaysman.algorithms.practice.e13.domain.Suit.DIAMOND;
import static me.vaysman.algorithms.practice.e13.domain.Suit.HEART;
import static me.vaysman.algorithms.practice.e13.domain.Suit.SPADE;
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

public class SpecificDeckInstance {

	private Card[] cards = new Card[36];
	
	{
		cards[0] = new Card(HEART, KNAVE);
		cards[1] = new Card(CLUB, QUEEN);
		cards[2] = new Card(HEART, TEN);
		cards[3] = new Card(CLUB, KING);
		cards[4] = new Card(DIAMOND, NINE);
		cards[5] = new Card(SPADE, TEN);
		cards[6] = new Card(DIAMOND, SIX);
		cards[7] = new Card(CLUB, TEN);
		cards[8] = new Card(CLUB, NINE); 
		
		cards[9] = new Card(DIAMOND, QUEEN); 
		cards[10] = new Card(SPADE, SIX); 
		cards[11] = new Card(SPADE, NINE); 
		cards[12] = new Card(HEART, NINE); 
		cards[13] = new Card(HEART, ACE); 
		cards[14] = new Card(CLUB, SEVEN); 
		cards[15] = new Card(CLUB, SIX); 
		cards[16] = new Card(HEART, KING); 
		cards[17] = new Card(DIAMOND, KNAVE); 
		
		cards[18] = new Card(HEART, QUEEN); 
		cards[19] = new Card(HEART, SEVEN); 
		cards[20] = new Card(CLUB, EIGHT); 
		cards[21] = new Card(DIAMOND, ACE); 
		cards[22] = new Card(CLUB, ACE); 
		cards[23] = new Card(CLUB, KNAVE); 
		cards[24] = new Card(SPADE, QUEEN); 
		cards[25] = new Card(SPADE, KING); 
		cards[26] = new Card(HEART, EIGHT); 
		
		cards[27] = new Card(HEART, SIX); 
		cards[28] = new Card(SPADE, EIGHT); 
		cards[29] = new Card(DIAMOND, EIGHT); 
		cards[30] = new Card(SPADE, KNAVE); 
		cards[31] = new Card(DIAMOND, TEN); 
		cards[32] = new Card(DIAMOND, SEVEN); 
		cards[33] = new Card(SPADE, ACE); 
		cards[34] = new Card(DIAMOND, KING); 
		cards[35] = new Card(SPADE, SEVEN);		
	}
	
	public Deck get() {
		return new Deck(cards);
	}
	
}
