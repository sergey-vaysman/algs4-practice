package me.vaysman.algorithms.practice.common;

public class SelectionSortAlgorithm<T> extends SortAlgorithm<T> {

	@Override
	public void executeAlgorithm() {
		for (int i = 0; i < collection.size() - 1; i++) {
			int min = findMin(i);
			exch(i, min);
			output("middle");
		}
	}

	private int findMin(int beginPos) {
		int min = beginPos;
		for (int i = beginPos + 1; i < collection.size(); i++) {
			if (less(i, min)) {
				min = i;
			}
		}
		return min;
	}
	
}
