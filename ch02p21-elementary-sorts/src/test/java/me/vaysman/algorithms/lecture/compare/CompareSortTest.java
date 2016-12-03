package me.vaysman.algorithms.lecture.compare;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.lecture.compare.CompareSort;

public class CompareSortTest {

	public static void main(String args[]) {
		String alg1 = "Selection";
		String alg2 = "Insertion";
		int size = 10000;
		int count = 100;
		double time1 = new CompareSort(alg1).timeRandomInput(size, count);
		double time2 = new CompareSort(alg2).timeRandomInput(size, count);
		StdOut.printf("For %d random Doubles\n", size, alg1);
		StdOut.printf("%s: %f\n", alg1, time1);
		StdOut.printf("%s: %f", alg2, time2);
	}

}
