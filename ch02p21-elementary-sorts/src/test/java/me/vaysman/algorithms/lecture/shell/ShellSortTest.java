package me.vaysman.algorithms.lecture.shell;

import me.vaysman.algorithms.common.AbstractSort;
import me.vaysman.algorithms.lecture.common.SortTest;
import me.vaysman.algorithms.lecture.common.SortTestImpl;
import me.vaysman.algorithms.lecture.shell.ShellSort;

public class ShellSortTest {

	public static void main(String args[]) {
		String[] array = {"E", "A", "S", "Y", "S", "O", "R", "T", "I", "N", "G"};
		AbstractSort<String> sort = new ShellSort<>(array);
		SortTest test = new SortTestImpl<>(sort);
		test.execute();
	}
	
}
