package me.vaysman.algorithms.practice.e13.algorithm;

import me.vaysman.algorithms.practice.common.SortAlgorithm;

public class NullSortAlgorithm<T> extends SortAlgorithm<T> {

	@Override
	public void executeAlgorithm() {
		throw new RuntimeException("Algorithm-null sort object");
	}

}
