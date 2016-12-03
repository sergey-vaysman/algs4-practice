package me.vaysman.algorithms.practice.common.draw;

import me.vaysman.algorithms.practice.common.SortCollection;

public class SmartCollectionTracer extends AbstractCollectionTracer {

	public SmartCollectionTracer(SortCollection<? extends DrawingSortItem> collection, int views) {
		super(collection, views);
	}

	@Override
	public void execute() {
		if (currentViewPos == -1) {
			compressViews();
			// TODO: currentViewPos should be already on position
		}
		super.execute();
	}
	
	/**
	 * decrease the number of used views
	 */
	private void compressViews() {
		
	}

}
