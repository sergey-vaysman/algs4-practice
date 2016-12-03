package me.vaysman.algorithms.practice.e16;

import java.util.Iterator;

import me.vaysman.algorithms.practice.card.AbstractDeck;
import me.vaysman.algorithms.practice.e13.domain.Card;

/**
 * Deck which is guaranteed based on array.
 * 
 * @author Sergey Vaysman
 */
public class ArrayBasedDeck extends AbstractDeck implements ArrayBased<Card> {

	public ArrayBasedDeck(Card[] cards) {
		super(cards);
	}
	
	@Override
	public Card[] getArray() {
		return cards;
	}

	@Override
	public Iterator<Card> iterator() {
		return new ArrayBasedIterator<>(cards);
	}
	
}
