package me.vaysman.algorithms.practice.e13;

import java.util.Iterator;

import me.vaysman.algorithms.practice.card.AbstractDeck;
import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.DeckPrinter;
import me.vaysman.algorithms.practice.e16.ArrayBasedIterator;

public class Deck extends AbstractDeck {

	public Deck(Card[] cards) {
		super(cards);
	}
	
	@Override
	public String toString() {
		return new DeckPrinter(this).execute();
	}

	@Override
	public Iterator<Card> iterator() {
		return new ArrayBasedIterator<>(cards);
	}

}
