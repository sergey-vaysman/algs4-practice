package me.vaysman.algorithms.practice.e17;

import java.util.Comparator;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import me.vaysman.algorithms.practice.common.CollectionPrinter;
import me.vaysman.algorithms.practice.common.ObjectPrinter;
import me.vaysman.algorithms.practice.common.SelectionSortAlgorithm;
import me.vaysman.algorithms.practice.common.SortAlgorithm;
import me.vaysman.algorithms.practice.common.SortArrayBasedCollection;
import me.vaysman.algorithms.practice.common.draw.CollectionDrawer;
import me.vaysman.algorithms.practice.common.draw.ThreeViewCollectionDrawer;
import me.vaysman.algorithms.practice.e17.DrawingDouble;
import me.vaysman.algorithms.practice.e17.DrawingDoubleComparator;
import me.vaysman.algorithms.practice.e17.DrawingDoubleSortCollection;

public class SelectionSortDrawTest {

	public static void main(String args[]) {
		SortAlgorithm<DrawingDouble> algorithm = new SelectionSortAlgorithm<>();
		SortArrayBasedCollection<DrawingDouble> collection = getCollection(1000);
		Comparator<DrawingDouble> comparator = new DrawingDoubleComparator();
		ObjectPrinter printer = new CollectionPrinter<>(collection);
		CollectionDrawer drawer = new ThreeViewCollectionDrawer(collection);
		drawer.setGraphicDrawDelay(50);
		algorithm.setCollection(collection);
		algorithm.setComparator(comparator);
		algorithm.setPrinter(printer);
		algorithm.setDrawer(drawer);
		
		StdDraw.setCanvasSize(1024, 650);
        StdDraw.setXscale(-0.5, collection.size());
        StdDraw.setPenRadius(0.01);
        StdDraw.show();
        
		algorithm.execute();
	}

	
	private static DrawingDouble[] generate(int size) {
		DrawingDouble[] result = new DrawingDouble[size];
		for (int i = 0; i < size; i++) {
			double value = StdRandom.uniform();
			result[i] = new DrawingDouble(value);
		}
		return result;
	}
	
	private static SortArrayBasedCollection<DrawingDouble> getCollection(int size) {
		DrawingDouble[] array = generate(size);
		return new DrawingDoubleSortCollection(array);
	}
	
}
