package me.vaysman.algorithms.practice.card;

import edu.princeton.cs.algs4.StdRandom;
import me.vaysman.algorithms.practice.card.AbstractDeck;

/**
 * Mix a deck in random card sequence
 * 
 * @author Sergey Vaysman
 */
public class DeckMixer {

	private AbstractDeck deck;
	
	public DeckMixer(AbstractDeck deck) {
		this.deck = deck;
	}

	public void execute() {
		int size = deck.size();
		boolean[] movedFrom = new boolean[size];
		boolean[] isSet = new boolean[size];
		for (int i = 0; i < size; i++) {
			mix(movedFrom, isSet);
		}
	}
	
	private void mix(boolean[] movedFrom, boolean[] isSet) {
		int posFrom = findAvailablePlace(movedFrom);
		int posTo = findAvailablePlace(isSet);
		deck.exch(posFrom, posTo);
		movedFrom[posFrom] = true;
		isSet[posTo] = true;
	}
	
	private int findAvailablePlace(boolean[] available) {
		int i = -1;
		do {
			i = StdRandom.uniform(available.length);
		} while (available[i]);
		return i;
	}
	
}
