package me.vaysman.algorithms.practice.e13;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.card.AbstractDeckFactory;
import me.vaysman.algorithms.practice.card.DeckMixer;
import me.vaysman.algorithms.practice.e13.Deck;
import me.vaysman.algorithms.practice.e13.domain.Card;

public class DeckFactory extends AbstractDeckFactory<Deck> {

	@Override
	public Deck newInstance() {
		Card[] cards = initArray();
		Deck deck = new Deck(cards);
//		StdOut.printf("DEBUG: initial sorted deck: %s%n", deck);
		new DeckMixer(deck).execute();
		return deck;
	}
	
	
	public static void main(String[] args) {
		StdOut.printf("testing array generating:%n");
		Deck deck = new DeckFactory().newInstance();
		StdOut.printf("%s%n", deck);
	}	
	
}
