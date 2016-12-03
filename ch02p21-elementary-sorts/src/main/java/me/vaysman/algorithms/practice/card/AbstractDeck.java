package me.vaysman.algorithms.practice.card;

import me.vaysman.algorithms.practice.common.SortArrayBasedCollection;
import me.vaysman.algorithms.practice.e13.domain.Card;

public abstract class AbstractDeck implements SortArrayBasedCollection<Card> {

	protected Card[] cards;
	
	public AbstractDeck(Card[] cards) {
		this.cards = cards;
	}
	
	@Override
	public int size() {
		if (cards == null) {
			return -1;
		}
		return cards.length;
	}
	
	@Override
	public void exch(int i, int j) {
		Card tmp = cards[i];
		cards[i] = cards[j];
		cards[j] = tmp;
	}
	
	@Override
	public Card get(int pos) {
		return cards[pos];
	}
	
}
