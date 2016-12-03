package me.vaysman.algorithms.practice.e12;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.common.AbstractSort;
import me.vaysman.algorithms.lecture.common.ArrayCreator;
import me.vaysman.algorithms.lecture.common.RandomDoubleArrayCreator;
import me.vaysman.algorithms.practice.e12.ShellSortHOutput;

public class ShellSortHOutputTest {

	public static void main(String args[]) {
		int size = 100;
		for (int i = 0; i < 10; i++) {
			StdOut.printf("DEBUG: array size: %d%n", size);
			ArrayCreator<Double> factory = new RandomDoubleArrayCreator(size);
			Double[] array = factory.create();
			AbstractSort<Double> sort = new ShellSortHOutput<>(array);
			sort.sort();
			size *= 10;
		}

	}

}
