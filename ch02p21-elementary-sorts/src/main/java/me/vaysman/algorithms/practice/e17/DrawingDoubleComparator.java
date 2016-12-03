package me.vaysman.algorithms.practice.e17;

import java.util.Comparator;

import me.vaysman.algorithms.practice.common.draw.DrawingSortItem;
import me.vaysman.algorithms.practice.common.draw.DrawingSortItemComparator;

public class DrawingDoubleComparator implements Comparator<DrawingDouble> {
	
	private Comparator<DrawingSortItem> comparator = new DrawingSortItemComparator();

	@Override
	public int compare(DrawingDouble o1, DrawingDouble o2) {
		return comparator.compare(o1, o2);
	}

}
