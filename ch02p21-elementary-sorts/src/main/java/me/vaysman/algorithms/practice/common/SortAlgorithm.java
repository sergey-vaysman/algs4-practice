package me.vaysman.algorithms.practice.common;

import java.util.Comparator;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.common.ObjectPrinter.NullObjectPrinter;
import me.vaysman.algorithms.practice.common.draw.CollectionDrawer;
import me.vaysman.algorithms.practice.e17.NullCollectionDrawer;

public abstract class SortAlgorithm<T> {

	protected SortArrayBasedCollection<T> collection;
	protected Comparator<T> comparator;
	protected SortStatistic statistic = new SortStatistic();
	protected ObjectPrinter printer = new NullObjectPrinter();
	protected CollectionDrawer drawer = new NullCollectionDrawer();
	
	public void importData(SortAlgorithm<T> sortAlgorithm) {
		if (sortAlgorithm.collection != null) {
			setCollection(sortAlgorithm.collection);
		}
		if (sortAlgorithm.comparator != null) {
			setComparator(sortAlgorithm.comparator);
		}
		if (sortAlgorithm.statistic != null) {
			setStatistic(sortAlgorithm.statistic);
		}
		setPrinter(sortAlgorithm.printer);
	}
	
	public void execute() {
		output("before sort");
		executeAlgorithm();
		checkSort();
		output("after sort");
	}
	
	protected abstract void executeAlgorithm();
	
	protected void checkSort() {
		new SortChecker<>(collection, comparator).execute();
	}
	
	
	protected boolean less(int pos1, int pos2) {
		statistic.increaseCompares();
		T item1 = collection.get(pos1);
		T item2 = collection.get(pos2);
		return comparator.compare(item1, item2) < 0;
	}
	
	protected void exch(int pos1, int pos2) {
		statistic.increaseExchanges();
		collection.exch(pos1, pos2);
	}

	
	public void setCollection(SortArrayBasedCollection<T> collection) {
		this.collection = collection;
	}

	public void setComparator(Comparator<T> comparator) {
		this.comparator = comparator;
	}

	public void setStatistic(SortStatistic statistic) {
		this.statistic = statistic;
	}

	public void setPrinter(ObjectPrinter printer) {
		this.printer = printer;
	}

	public void setDrawer(CollectionDrawer drawer) {
		this.drawer = drawer;
	}
	
	protected void output(String description) {
		StdOut.printf("%s: %s%n", description, printer.execute());
		StdOut.printf("statistics: %s%n", statistic);
		if (description.equals("after sort")) {
			drawer.setIsCollectionSorted(true);
		}
		drawer.execute();
	}

	
}
