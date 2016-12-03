package me.vaysman.algorithms.practice.e13.domain;

import me.vaysman.algorithms.practice.common.ObjectPrinter;
import me.vaysman.algorithms.practice.e13.Deck;

/**
 * Prepare current state of the deck collection in printable view
 * 
 * @author Sergey Vaysman
 */
public class DeckPrinter implements ObjectPrinter {

	private Deck deck;
	
	public DeckPrinter(Deck deck) {
		this.deck = deck;
	}

	@Override
	public String execute() {
		StringBuilder builder = new StringBuilder("Deck {");
		if (deck == null || deck.size() == -1) {
			builder.append("null");
		} else {
			builder.append("[ ");
			if (deck.size() > 0) {
				builder.append("\n");
			}
			int suitDivider = initSuitDivider();
			for (int i = 0; i < deck.size(); i++) {
				builder.append(i);
				builder.append('=');
				builder.append(deck.get(i));
				if (i != deck.size() - 1) {
					builder.append(", ");
				}
				if ((i + 1) % suitDivider == 0) {
					builder.append("\n");
				}
			}
			builder.append("]");
		}
		builder.append("}");
		return builder.toString();
	}
	
	private int initSuitDivider() {
		int suites = Suit.values().length;
		return deck.size() / suites;
	}
	
}
