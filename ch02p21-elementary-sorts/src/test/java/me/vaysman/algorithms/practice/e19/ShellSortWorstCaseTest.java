package me.vaysman.algorithms.practice.e19;

import me.vaysman.algorithms.practice.common.CollectionPrinter;
import me.vaysman.algorithms.practice.common.draw.ThreeViewCollectionDrawer;
import me.vaysman.algorithms.practice.e13.algorithm.ShellSortAlgorithm;
import me.vaysman.algorithms.practice.e17.DrawingDouble;
import me.vaysman.algorithms.practice.e17.DrawingDoubleComparator;
import me.vaysman.algorithms.practice.e17.DrawingDoubleSortCollection;

public class ShellSortWorstCaseTest extends BaseSortDrawTest<DrawingDouble> {

	public ShellSortWorstCaseTest() {
		algorithm = new ShellSortAlgorithm<>();
		collection = new DrawingDoubleSortCollection(generate());
		comparator = new DrawingDoubleComparator();
		printer = new CollectionPrinter<>(collection);
		drawer = new ThreeViewCollectionDrawer(collection);
	}
	
	// TODO: extract to DrawingDouble collection generator
	@Override
	protected DrawingDouble[] generate() {
		DrawingDouble[] result = new DrawingDouble[100];
		double value = 0.5;
		for (int i = 0; i < result.length - 1; i += 2) {
			result[i] = new DrawingDouble(value);
			result[i + 1] = new DrawingDouble(value);
			value -= 0.01;
		}
		return result;
	}
	
	public static void main(String args[]) {
		SortDrawTest test = new ShellSortWorstCaseTest();
		test.run();
	}
	
}
