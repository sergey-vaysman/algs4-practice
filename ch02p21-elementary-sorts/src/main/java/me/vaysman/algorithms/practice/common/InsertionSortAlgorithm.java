package me.vaysman.algorithms.practice.common;

public class InsertionSortAlgorithm<T> extends SortAlgorithm<T> {

	@Override
	public void executeAlgorithm() {
		for (int i = 1; i < collection.size(); i++) {
			for (int j = i; j > 0 && less(j, j - 1); j--) {
				exch(j, j - 1);
				output("middle");
			}
		}
	}

}
