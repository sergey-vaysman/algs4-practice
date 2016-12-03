package me.vaysman.algorithms.practice.e14;

import java.util.Comparator;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.common.SortStatistic;
import me.vaysman.algorithms.practice.e13.domain.Card;

public class DequeueSort {
	
	private DequeDeck deck;
	private Comparator<Card> comparator;
	private SortStatistic statistic;

	public DequeueSort(DequeDeck deck) {
		this.deck = deck;
		statistic = new SortStatistic();
	}

	public void setComparator(Comparator<Card> comparator) {
		this.comparator = comparator;
	}
	

	public void execute() {
		boolean isSorted = false;
		int goThroughCount = 0;
		int exchThroughDeck = 0;
		do {
			StdOut.printf("go through: %d%n", ++goThroughCount);
			for (int i = 0; i < deck.getSize() - 1; i++) {
				if (deck.compareTopValues(comparator) > 0) {
					deck.exchangeTopCards();
					statistic.increaseExchanges();
					exchThroughDeck++;
				}
				statistic.increaseCompares();
				deck.moveTopCardToBottom();
				//StdOut.printf("deck for i=%d:%n%s%n", i, deck);
			}
			deck.moveTopCardToBottom();
			isSorted = exchThroughDeck == 0;
			StdOut.printf("DEBUG: exchThroughDeck = %d%n", exchThroughDeck);
			exchThroughDeck = 0;
			StdOut.printf("go through result: %s%n", deck);
			StdOut.printf("statistic: %s%n", statistic);
		} while (!isSorted);
	}
	
	
	
}
