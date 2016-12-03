package me.vaysman.algorithms.practice.e13.algorithm;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.common.SortAlgorithm;
import me.vaysman.algorithms.practice.e13.SuitComparator;
import me.vaysman.algorithms.practice.e13.ValueComparator;
import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.Suit;

/**
 * Sorts a deck of cards.
 * 
 * The algorithm used several sorts:
 * 1) sorting by a value comparator, items are grouped by 4 with same value
 * and different suites;
 * 2) sorting in each group by a suit comparator.
 * 
 * During the sort comparators check only one object field.
 * There's no additional logic in compare, just using Enum.compareTo().
 * 
 * @author Sergey Vaysman
 *
 */
public class DeckSortAlgorithm extends SortAlgorithm<Card> {
	
	private SortAlgorithm<Card> algorithm;
	
	@Override
	public void executeAlgorithm() {
		algorithm = new ShellSortAlgorithm<>();
		comparator = new SuitComparator();
		algorithm.importData(this);
		algorithm.execute();
		StdOut.printf("DEBUG: after suit sort:%n%s%n", collection);
		StdOut.printf("DEBUG: statistic after suit sort: %s%n", statistic);
		comparator = new ValueComparator();
		runValueSort();
	}
	
	public void runValueSort() {
		int differentSuits = Suit.values().length;
		int step = collection.size() / differentSuits;
		for (int stepI = 0; stepI < differentSuits; stepI++) {
			for (int i = step * stepI + 1; i < step * (stepI + 1); i++) {
				for (int j = i; j >= step * stepI + 1 && less(j, j - 1); j--) {
					exch(j, j - 1);
				}
			}
		}
	}
	
}
