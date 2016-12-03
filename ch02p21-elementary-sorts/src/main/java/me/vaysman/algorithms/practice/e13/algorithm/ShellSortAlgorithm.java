package me.vaysman.algorithms.practice.e13.algorithm;

import me.vaysman.algorithms.practice.common.SortAlgorithm;

public class ShellSortAlgorithm<T> extends SortAlgorithm<T> {
	
	@Override
	public void executeAlgorithm() {
		int h = calcH();
		while (h >= 1) {
			for (int i = h; i < collection.size(); i++) {
				for (int j = i; j >= h && less(j, j - h); j -= h) {
					exch(j, j - h);
					output("exchange");
				}
			}
			output("\nh = " + h);
			h /= 3;	
		}
	}
	
	private int calcH() {
		int h = 1;
		while (h < collection.size() / 3) {
			h = 3 * h + 1;
		}
		return h;
	}
		
}
