package me.vaysman.algorithms.practice.e12;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.lecture.common.RandomDoubleArrayCreator;
import me.vaysman.algorithms.practice.e12.ShellSortHOutputDoublePrimitive;

public class ShellSortHOutputDoublePrimitiveTest {

	public static void main(String args[]) {
		int size = 100;
		for (int i = 0; i < 10; i++) {
			
			// !! for i = 10, i > Integer.MAX, how to create an array?
			
			StdOut.printf("DEBUG: array size: %d%n", size);
			double[] array = RandomDoubleArrayCreator.createPrimitive(size);
			ShellSortHOutputDoublePrimitive sort = new ShellSortHOutputDoublePrimitive(array);
			sort.sort();
			size *= 10;
		}

	}

}
