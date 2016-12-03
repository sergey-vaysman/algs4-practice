package me.vaysman.algorithms.common;

import edu.princeton.cs.algs4.StdOut;

public abstract class AbstractSort<T extends Comparable<T>> {

	protected T[] array;

	public AbstractSort(T[] array) {
		this.array = array;
	}

	public abstract void sort();

	protected boolean less(T v, T w) {
		return v.compareTo(w) < 0;
	}

	protected void exch(int i, int j) {
		T tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public void show() {
		for (int i = 0; i < array.length; i++) {
			StdOut.print(array[i] + " ");
		}
		StdOut.println();
	}

	public boolean isSorted() {
		for (int i = 1; i < array.length; i++) {
			if (less(array[i], array[i - 1])) {
				return false;
			}
		}
		return true;
	}

}
