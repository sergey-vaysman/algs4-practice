package me.vaysman.algorithms.practice.common;

import java.util.Comparator;

public class SortChecker<T> {

	private SortCollection<T> collection;
	private Comparator<T> comparator;
	
	public SortChecker(SortCollection<T> collection, Comparator<T> comparator) {
		this.collection = collection;
		this.comparator = comparator;
	}

	public void execute() {
		if (!isSorted()) {
			String printView = getCollectionPrintView();
			throw new RuntimeException("Collection not sorted \n" + printView);
		}
	}
		
	private boolean isSorted() {
		T prevObj = null;
		for (T item : collection) {
			if (prevObj != null) {
				if (comparator.compare(prevObj, item) > 0) {
					return false;
				}
			}
			prevObj = item;
		}
		return true;
	}
	
	private String getCollectionPrintView() {
		if (collection instanceof PrintableSortCollection<?>) {
			PrintableSortCollection<?> printableCollection;
			printableCollection = (PrintableSortCollection<?>) collection;
			ObjectPrinter printer = printableCollection.getPrinter();
			return printer.execute();
		}
		return collection.toString();
	}

	
}
