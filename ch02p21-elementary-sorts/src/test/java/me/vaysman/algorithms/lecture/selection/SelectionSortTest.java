package me.vaysman.algorithms.lecture.selection;

import me.vaysman.algorithms.common.AbstractSort;
import me.vaysman.algorithms.lecture.common.SortTest;
import me.vaysman.algorithms.lecture.common.SortTestImpl;
import me.vaysman.algorithms.lecture.selection.SelectionSort;

public class SelectionSortTest {

	public static void main(String args[]) {
		String[] array = new String[] { "H", "E", "L", "L", "O" };
		AbstractSort<String> selectionSort = new SelectionSort<>(array);
		SortTest test = new SortTestImpl<>(selectionSort);
		test.execute();
	}

}
