package me.vaysman.algorithms.practice.e14;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.e13.Deck;
import me.vaysman.algorithms.practice.e13.DeckFactory;
import me.vaysman.algorithms.practice.e13.SuitComparator;
import me.vaysman.algorithms.practice.e14.DequeDeck;
import me.vaysman.algorithms.practice.e14.DequeueSort;

public class DequeueSortTest {

	public static void main(String args[]) {
		Deck deck = new DeckFactory().newInstance();
		DequeDeck deque = new DequeDeck(deck);
		StdOut.printf("dequedeck: %s%n", deque);
		DequeueSort sort = new DequeueSort(deque);
		sort.setComparator(new SuitComparator());
		sort.execute();
		StdOut.printf("After sort: %s%n", deque);
	}
	
}
