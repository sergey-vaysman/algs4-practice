package me.vaysman.algorithms.practice.common.draw;

import java.util.Comparator;

public class DrawingSortItemComparator implements Comparator<DrawingSortItem> {

	@Override
	public int compare(DrawingSortItem o1, DrawingSortItem o2) {
		double v1 = o1.getWeight();
		double v2 = o2.getWeight();
		if (v1 < v2) {
			return -1;
		}
		if (v1 > v2) {
			return 1;
		}
		return 0;
	}
	
}
