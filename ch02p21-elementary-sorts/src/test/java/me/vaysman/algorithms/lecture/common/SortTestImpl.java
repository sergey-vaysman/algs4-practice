package me.vaysman.algorithms.lecture.common;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.common.AbstractSort;

public final class SortTestImpl<T extends Comparable<T>>
implements SortTest {

	private AbstractSort<T> sort;

	public SortTestImpl(AbstractSort<T> sort) {
		this.sort = sort;
	}
	
	@Override
	public void execute() {
		logBefore();
		sort.sort();
		logAfter();
		checkSortResult();
	}
	
	private void checkSortResult() {
		if (!sort.isSorted()) {
			throw new RuntimeException("the array was not sorted");
		} else {
			StdOut.println("is sorted");
		}
	}
	
	private void logBefore() {
		StdOut.print("before sort: ");
		sort.show();
	}
	
	private void logAfter() {
		StdOut.print("after sort: ");
		sort.show();
	}
	
}
