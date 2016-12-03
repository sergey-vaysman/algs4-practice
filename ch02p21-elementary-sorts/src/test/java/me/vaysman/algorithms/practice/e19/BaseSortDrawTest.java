package me.vaysman.algorithms.practice.e19;

import java.util.Comparator;

import edu.princeton.cs.algs4.StdDraw;
import me.vaysman.algorithms.practice.common.ObjectPrinter;
import me.vaysman.algorithms.practice.common.SortAlgorithm;
import me.vaysman.algorithms.practice.common.SortArrayBasedCollection;
import me.vaysman.algorithms.practice.common.draw.CollectionDrawer;
import me.vaysman.algorithms.practice.common.draw.DrawingSortItem;

/**
 * Drawing sort test abstraction
 * @author Sergey Vaysman
 *
 * @param <T> Type of collection item
 */
public abstract class BaseSortDrawTest<T extends DrawingSortItem> implements SortDrawTest {

	protected SortAlgorithm<T> algorithm;
	protected SortArrayBasedCollection<T> collection;
	protected Comparator<T> comparator;
	protected ObjectPrinter printer;
	protected CollectionDrawer drawer;
	
	@Override
	public void run() {
		initAlgorithmLinks();
		initCanvas();
		algorithm.execute();
	}
	
	private void initAlgorithmLinks() {
		algorithm.setCollection(collection);
		algorithm.setComparator(comparator);
		algorithm.setPrinter(printer);
		algorithm.setDrawer(drawer);
	}

	private void initCanvas() {
		// TODO: move to drawer
		StdDraw.setCanvasSize(1024, 650);
		StdDraw.setXscale(-1, collection.size() + 1);
		StdDraw.setPenRadius(0.01);
		StdDraw.show();
	}
	
	protected abstract T[] generate();
	
}
