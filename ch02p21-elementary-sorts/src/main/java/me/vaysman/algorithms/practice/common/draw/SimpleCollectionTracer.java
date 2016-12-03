package me.vaysman.algorithms.practice.common.draw;

import me.vaysman.algorithms.practice.common.SortCollection;


/**
 * Collection Tracer simple implementation.
 * For each execution uses the next line to trace the collection
 * from the top to the bottom.
 * If it reaches the bottom, begins from the top.
 * 
 * @author Sergey Vaysman
 */
public class SimpleCollectionTracer extends AbstractCollectionTracer {
	
	
	public SimpleCollectionTracer(SortCollection<? extends DrawingSortItem> collection, int views) {
		super(collection, views);
	}

	@Override
	public void execute() {
		viewRects[currentViewPos].clear();
		super.execute();
		if (currentViewPos == -1) {
			moveToTopView();
		}
	}
	
}
