package me.vaysman.algorithms.practice.e16;

import me.vaysman.algorithms.practice.card.AbstractDeckFactory;
import me.vaysman.algorithms.practice.card.DeckMixer;
import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e16.ArrayBasedDeck;

public class ArrayBasedDeckFactory extends AbstractDeckFactory<ArrayBasedDeck> {

	@Override
	public ArrayBasedDeck newInstance() {
		Card[] cards = initArray();
		ArrayBasedDeck deck = new ArrayBasedDeck(cards);
		new DeckMixer(deck).execute();
		return deck;
	}
	
}
