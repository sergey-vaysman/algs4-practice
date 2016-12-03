package me.vaysman.algorithms.practice.card;

import me.vaysman.algorithms.practice.card.AbstractDeck;
import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.Suit;
import me.vaysman.algorithms.practice.e13.domain.Value;

public abstract class AbstractDeckFactory<T extends AbstractDeck> {

	protected Card[] initArray() {
		Suit[] suites = Suit.values();
		Value[] values = Value.values();
		Card[] cards = new Card[suites.length * values.length];
		int k = 0;
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < values.length; j++) {
				cards[k++] = new Card(suites[i], values[j]);
			}
		}
		return cards;
	}
	
	public abstract T newInstance();
	
}
