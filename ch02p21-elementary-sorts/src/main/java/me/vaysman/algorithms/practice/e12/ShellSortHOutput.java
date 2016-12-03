package me.vaysman.algorithms.practice.e12;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.e11.ShellSortHArray;


/**
 * 2.1.12 Instrument shellsort to print the number of compares divided 
 * by the array size for each increment. 
 * Write a test client that tests the hypothesis that this number is a small constant, 
 * by sorting arrays of random Double values, using array sizes 
 * that are increasing powers of 10, starting at 100.
 *
 */
public class ShellSortHOutput<T extends Comparable<T>> extends ShellSortHArray<T> {
	
	/**
	 * Counts a number of compares for each h
	 */
	private int hCompareCounter;
	
	public ShellSortHOutput(T[] array) {
		super(array);
	}

	@Override
	public void sort() {
		int[] hArr = calcH();
		for (int hPos = hArr.length - 1; hPos >= 0; hPos--) {
			int h = hArr[hPos];
			for (int i = h; i < array.length; i++) {
				for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
					exch(j, j - h);
				}
			}
			outputCompareCounter(h, hCompareCounter);
			resetCompareCounter();
		}
	}

	private void outputCompareCounter(int h, int compares) {
		double result = (double) compares / array.length;
//		StdOut.printf("DEBUG: h = %d, compares = %d%n", h, compares);
		StdOut.printf("compares/arrays length for h = %d : %f%n", h, result);
	}
	
	private void resetCompareCounter() {
		hCompareCounter = 0;
	}
	
	@Override
	protected boolean less(T v, T w) {
		hCompareCounter++;
		return super.less(v, w);
	}

}
