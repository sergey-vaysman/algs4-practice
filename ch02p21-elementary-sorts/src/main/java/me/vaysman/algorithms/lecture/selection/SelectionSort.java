package me.vaysman.algorithms.lecture.selection;

import me.vaysman.algorithms.common.AbstractSort;

public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T> {

	public SelectionSort(T[] array) {
		super(array);
	}

	@Override
	public void sort() {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (less(array[j], array[min])) {
					min = j;
				}
			}
			exch(i, min);
		}
	}

}
