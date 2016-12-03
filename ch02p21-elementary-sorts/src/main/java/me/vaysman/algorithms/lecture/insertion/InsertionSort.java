package me.vaysman.algorithms.lecture.insertion;

import me.vaysman.algorithms.common.AbstractSort;

public class InsertionSort<T extends Comparable<T>> extends AbstractSort<T> {

	public InsertionSort(T[] array) {
		super(array);
	}

	@Override
	public void sort() {
		int size = array.length;
		for (int i = 1; i < size; i++) {
			for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
				exch(j, j - 1);
			}
		}
	}

}
