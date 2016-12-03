package me.vaysman.algorithms.practice.e12;

import edu.princeton.cs.algs4.StdOut;


/**
 * 2.1.12 Instrument shellsort to print the number of compares divided 
 * by the array size for each increment. 
 * Write a test client that tests the hypothesis that this number is a small constant, 
 * by sorting arrays of random Double values, using array sizes 
 * that are increasing powers of 10, starting at 100.
 *
 */
public class ShellSortHOutputDoublePrimitive {

	private double[] array;
	
	/**
	 * Counts a number of compares for each h
	 */
	private long hCompareCounter;
	
	public ShellSortHOutputDoublePrimitive(double[] array) {
		this.array = array;
	}

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

	private int[] calcH() {
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
	
	private void outputCompareCounter(int h, long compares) {
		double result = (double) compares / array.length;
//		StdOut.printf("DEBUG: h = %d, compares = %d%n", h, compares);
		StdOut.printf("compares/arrays length for h = %d : %f%n", h, result);
	}
	
	private void resetCompareCounter() {
		hCompareCounter = 0;
	}
	
	private boolean less(double v, double w) {
		hCompareCounter++;
		return v < w;
	}
	
	private void exch(int i, int j) {
		double tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
