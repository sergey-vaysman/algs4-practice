package me.vaysman.algorithms.practice.e13;

import java.util.Comparator;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.common.SortAlgorithm;
import me.vaysman.algorithms.practice.common.SortStatistic;
import me.vaysman.algorithms.practice.e13.algorithm.NullSortAlgorithm;
import me.vaysman.algorithms.practice.e13.domain.Card;

public class DeckSort {
	
	private SortAlgorithm<Card> algorithm = new NullSortAlgorithm<>();
	private SortStatistic statistic = new SortStatistic();
	
	public DeckSort(Deck deck) {
		algorithm.setCollection(deck);
		algorithm.setStatistic(statistic);
	}
	
	public void setAlgorithm(SortAlgorithm<Card> algorithm) {
		algorithm.importData(this.algorithm);
		this.algorithm = algorithm;
	}

	public void setComparator(Comparator<Card> comparator) {
		algorithm.setComparator(comparator);
	}

	public void sort() {
		algorithm.execute();
		StdOut.printf("DEBUG: %s%n", statistic);
	}

}
