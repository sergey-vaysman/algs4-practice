package me.vaysman.algorithms.practice.e17;

import me.vaysman.algorithms.practice.common.SortCollection;
import me.vaysman.algorithms.practice.common.draw.DrawingSortItem;
import me.vaysman.algorithms.practice.common.draw.VerticalCollectionDrawer;

public class CollectionDrawerImpl extends VerticalCollectionDrawer {
	
	public CollectionDrawerImpl(SortCollection<? extends DrawingSortItem> collection) {
		super(2);
		this.collection = collection;
	}
	
}
