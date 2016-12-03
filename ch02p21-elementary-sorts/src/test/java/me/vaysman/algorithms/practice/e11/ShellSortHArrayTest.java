package me.vaysman.algorithms.practice.e11;

import me.vaysman.algorithms.common.AbstractSort;
import me.vaysman.algorithms.lecture.common.SortTest;
import me.vaysman.algorithms.lecture.common.SortTestImpl;
import me.vaysman.algorithms.practice.e11.ShellSortHArray;

public class ShellSortHArrayTest {

	public static void main(String args[]) {
		String[] array = {"E", "A", "S", "Y", "S", "O", "R", "T", "I", "N", "G"};
		AbstractSort<String> sort = new ShellSortHArray<>(array);
		SortTest test = new SortTestImpl<>(sort);
		test.execute();
	}
	
}
