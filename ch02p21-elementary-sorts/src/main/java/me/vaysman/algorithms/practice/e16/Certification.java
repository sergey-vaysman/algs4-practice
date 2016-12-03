package me.vaysman.algorithms.practice.e16;

import java.util.Comparator;

import me.vaysman.algorithms.practice.common.SortAlgorithm;
import me.vaysman.algorithms.practice.common.SortArrayBasedCollection;

public class Certification<T> {

	private SortArrayBasedCollection<T> collection;
	private SortAlgorithm<T> algorithm;
	private Comparator<T> comparator;
	
	private Object[] initial;
		
	public Certification(SortArrayBasedCollection<T> collection, SortAlgorithm<T> algorithm, Comparator<T> comparator) {
		super();
		this.collection = collection;
		this.algorithm = algorithm;
		this.comparator = comparator;
		this.algorithm.setCollection(collection);
		this.algorithm.setComparator(comparator);
	}

	public boolean check() {
		initial = getInitialSet();
		algorithm.execute();
		return isSortOrderCorrect() && isCollectionSetSame();
	}
	
	private Object[] getInitialSet() {
		Object[] copy = new Object[collection.size()];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = collection.get(i);
		}
		return copy;
	}
	
	private boolean isSortOrderCorrect() {
		for (int i = 0; i < collection.size() - 1; i++) {
			T element1 = collection.get(i);
			T element2 = collection.get(i + 1);
			if (comparator.compare(element1, element2) > 0) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isCollectionSetSame() {
		boolean sameSize = initial.length == collection.size();
		if (!sameSize) {
			return false;
		}
		int size = initial.length;
		for (int i = 0; i < size; i++) {
			boolean isElementFound = false;
			Object initObj = initial[i];
			for (int j = 0; j < size; j++) {
				T sortedObj = collection.get(j);
				if (initObj == sortedObj) {
					isElementFound = true;
					break;
				}
			}
			if (!isElementFound) {
				return false;
			}
		}
		return true;
	}
	
}
