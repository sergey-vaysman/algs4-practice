package me.vaysman.algorithms.lecture.compare;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import me.vaysman.algorithms.common.AbstractSort;
import me.vaysman.algorithms.lecture.insertion.InsertionSort;
import me.vaysman.algorithms.lecture.selection.SelectionSort;

public class CompareSort {

	private String alg;

	public CompareSort(String alg) {
		this.alg = alg;
	}

	public double time(Double[] array) {
		Stopwatch timer = new Stopwatch();
		AbstractSort<Double> sortObject = getSortObject(array);
		if (sortObject != null) {
			sortObject.sort();
		}
		return timer.elapsedTime();
	}

	private AbstractSort<Double> getSortObject(Double[] array) {
		AbstractSort<Double> sortObject = null;
		switch (alg) {
		case "Insertion":
			sortObject = new InsertionSort<>(array);
			break;
		case "Selection":
			sortObject = new SelectionSort<>(array);
			break;
		case "Shell":
			// TODO:
			break;
		case "Merge":
			// TODO:
			break;
		case "Quick":
			// TODO:
			break;
		case "Heap":
			// TODO:
			break;
		}
		return sortObject;
	}

	public double timeRandomInput(int size, int count) {
		double total = 0;
		Double[] array = new Double[size];
		for (int arrayNumber = 0; arrayNumber < count; arrayNumber++) {
			for (int i = 0; i < size; i++) {
				array[i] = StdRandom.uniform();
			}
			total += time(array);
		}
		return total;
	}

}
