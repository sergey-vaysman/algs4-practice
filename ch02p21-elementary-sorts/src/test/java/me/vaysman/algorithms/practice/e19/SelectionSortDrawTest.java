package me.vaysman.algorithms.practice.e19;

import edu.princeton.cs.algs4.StdRandom;
import me.vaysman.algorithms.practice.common.CollectionPrinter;
import me.vaysman.algorithms.practice.common.SelectionSortAlgorithm;
import me.vaysman.algorithms.practice.common.draw.ThreeViewCollectionDrawer;
import me.vaysman.algorithms.practice.e17.DrawingDouble;
import me.vaysman.algorithms.practice.e17.DrawingDoubleComparator;
import me.vaysman.algorithms.practice.e17.DrawingDoubleSortCollection;

public class SelectionSortDrawTest extends BaseSortDrawTest<DrawingDouble> {

	public SelectionSortDrawTest() {
		algorithm = new SelectionSortAlgorithm<>();
		collection = new DrawingDoubleSortCollection(generate());
		comparator = new DrawingDoubleComparator();
		printer = new CollectionPrinter<>(collection);
		drawer = new ThreeViewCollectionDrawer(collection);
	}

	@Override
	protected DrawingDouble[] generate() {
		DrawingDouble[] result = new DrawingDouble[100];
		for (int i = 0; i < result.length; i++) {
			double value = StdRandom.uniform();
			result[i] = new DrawingDouble(value);
		}
		return result;
	}
	
	public static void main(String args[]) {
		SortDrawTest test = new SelectionSortDrawTest();
		test.run();
	}
	
}
