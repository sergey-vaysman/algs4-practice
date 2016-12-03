package me.vaysman.algorithms.lecture.shell;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.common.AbstractSort;

public class ShellSort<T extends Comparable<T>> extends AbstractSort<T> {

	public ShellSort(T[] array) {
		super(array);
	}

	@Override
	public void sort() {
		int h = calcH();
		while (h >= 1) {
			for (int i = h; i < array.length; i++) {
				for (int j = i; j >= h && less(array[j], array[j - h]); j-= h) {
					exch(j, j - h);
				}
			}
			h /= 3;
			StdOut.printf("DEBUG: h changed to %d%n", h);
		}
	}
	
	protected int calcH() {
		int size = array.length;
		int h = 1;
		while (h < size / 3) {
			h = 3 * h + 1;
		}
		StdOut.printf("DEBUG: h initial value: %d%n", h);
		return h;
	}

}
