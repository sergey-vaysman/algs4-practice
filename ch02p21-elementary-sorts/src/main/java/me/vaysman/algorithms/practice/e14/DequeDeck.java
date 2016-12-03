package me.vaysman.algorithms.practice.e14;

import java.util.Comparator;

import me.vaysman.algorithms.datatypes.practice.Dequeue;
import me.vaysman.algorithms.practice.common.ObjectPrinter;
import me.vaysman.algorithms.practice.e13.Deck;
import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.Suit;

public class DequeDeck {

	private Dequeue<Card> cards;
	
	public DequeDeck(Deck deck) {
		this.cards = new Dequeue<>();
		for (int i = 0; i < deck.size(); i++) {
			Card card = deck.get(i);
			cards.enqueue(card);
		}
	}
	
	public int compareTopValues(Comparator<Card> comparator) {
		Card card1 = cards.dequeue();
		Card card2 = cards.dequeue();
		moveBackToTop(card1, card2);
		return comparator.compare(card1, card2);
	}
	
	private void moveBackToTop(Card card1, Card card2) {
		cards.push(card2);
		cards.push(card1);
	}
	
	public void exchangeTopCards() {
		Card card1 = cards.dequeue();
		Card card2 = cards.dequeue();
		moveBackToTop(card2, card1);
	}
	
	public void moveTopCardToBottom() {
		Card card = cards.dequeue();
		cards.enqueue(card);
	}
	
	public int getSize() {
		return cards.size();
	}
	
	@Override
	public String toString() {
		return new DequeDeckPrinter().execute();
	}



	public class DequeDeckPrinter implements ObjectPrinter {
		
		@Override
		public String execute() {
			StringBuilder builder = new StringBuilder("DequeDeck {");
			if (cards == null || cards.size() == -1) {
				builder.append("null");
			} else {
				builder.append("[ ");
				if (cards.size() > 0) {
					builder.append("\n");
				}
				int suitDivider = initSuitDivider();
				int i = 0;
				for (Card card : cards) {
					builder.append(i);
					builder.append('=');
					builder.append(card);
					if (i != cards.size() - 1) {
						builder.append(", ");
					}
					if ((i + 1) % suitDivider == 0) {
						builder.append("\n");
					}
					i++;
				}
				builder.append("]");
			}
			builder.append("}");
			return builder.toString();
		}
		
		private int initSuitDivider() {
			int suites = Suit.values().length;
			return cards.size() / suites;
		}
		
	}
	
}
