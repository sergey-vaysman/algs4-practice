package me.vaysman.algorithms.practice.e11;

import me.vaysman.algorithms.common.AbstractSort;

/**
 * 2.1.11 Implement a version of shellsort that keeps the increment
 * sequence in an array, rather than computing it
 */
public class ShellSortHArray<T extends Comparable<T>> extends AbstractSort<T> {

	public ShellSortHArray(T[] array) {
		super(array);
	}

	@Override
	public void sort() {
		int[] hArr = calcH();
		for (int k = hArr.length - 1; k >= 0; k--) {
			int h = hArr[k];
			for (int i = h; i < array.length; i++) {
				for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
					exch(j, j - h);
				}
			}
		}
	}

	protected int[] calcH() {
		int size = 1;
		int h = 1;
		while (h < array.length / 3) {
			h = 3 * h + 1;
			size++;
		}
		int[] hArr = new int[size];
		for (int i = size - 1; i > -1; i--) {
			hArr[i] = h;
			h /= 3;
		}
//		StdOut.printf("DEBUG: hArr is %s%n", output(hArr));
		return hArr;
	}
	
}
