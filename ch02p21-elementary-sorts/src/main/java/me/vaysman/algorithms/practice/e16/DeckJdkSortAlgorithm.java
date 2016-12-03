package me.vaysman.algorithms.practice.e16;

import java.util.Arrays;

import me.vaysman.algorithms.practice.common.SortAlgorithm;
import me.vaysman.algorithms.practice.common.SortArrayBasedCollection;
import me.vaysman.algorithms.practice.e13.domain.Card;

public class DeckJdkSortAlgorithm extends SortAlgorithm<Card> {

	private ArrayBasedDeck collection;
	
	@Override
	public void executeAlgorithm() {
		Arrays.sort(collection.getArray(), comparator);
	}
	
	@Override
	public void setCollection(SortArrayBasedCollection<Card> collection) {
		if (collection instanceof ArrayBasedDeck) {
			this.collection = (ArrayBasedDeck) collection;
		} else {
			throw new UnsupportedOperationException();
		}
	}

}
