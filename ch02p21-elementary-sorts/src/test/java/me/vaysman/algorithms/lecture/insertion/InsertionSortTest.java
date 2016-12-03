package me.vaysman.algorithms.lecture.insertion;

import me.vaysman.algorithms.common.AbstractSort;
import me.vaysman.algorithms.lecture.common.SortTest;
import me.vaysman.algorithms.lecture.common.SortTestImpl;
import me.vaysman.algorithms.lecture.insertion.InsertionSort;

public class InsertionSortTest {

	public static void main(String args[]) {
		String[] array = new String[] { "H", "E", "L", "L", "O" };
		AbstractSort<String> insertionSort = new InsertionSort<>(array);
		SortTest test = new SortTestImpl<>(insertionSort);
		test.execute();
	}

}
