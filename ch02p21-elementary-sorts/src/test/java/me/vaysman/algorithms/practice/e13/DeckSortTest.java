package me.vaysman.algorithms.practice.e13;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.e13.Deck;
import me.vaysman.algorithms.practice.e13.DeckSort;
import me.vaysman.algorithms.practice.e13.algorithm.DeckSortAlgorithm;

/**
 * 1. Deck sort by suites and values, use
 * 		1) Shell sort using Suit comparator
 * 		2) Insertion sort inside Value.values().length sub-arrays
 * 		   with Value comparator.
 * 
 * 2. Deck sort by values, use
 * 		1) Shell sort using Value comparator
 * 		2) (optional) Insertion sort insed Suit.values().length sub-arrays
 * 		   with Suit comparator.
 * 
 * @author Sergey Vaysman
 */
public class DeckSortTest {

	public static void main(String[] args) {
		Deck deck = new DeckFactory().newInstance();
		StdOut.printf("Before sort: %s%n", deck);
		DeckSort sort = new DeckSort(deck);
		sort.setAlgorithm(new DeckSortAlgorithm());
		sort.sort();
		StdOut.printf("After sort: %s%n", deck);
	}
	
}
