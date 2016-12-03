package me.vaysman.algorithms.practice.common.draw;

import me.vaysman.algorithms.practice.common.SortCollection;

public abstract class AbstractCollectionTracer extends VerticalCollectionDrawer {

	protected View[] viewRects;
	
	public AbstractCollectionTracer(SortCollection<? extends DrawingSortItem> collection, int views) {
		super(views);
		this.collection = collection;
		viewRects = initViews();
	}

	
	protected void moveToTopView() {
		currentViewPos = views - 1;
	}
	
	protected void moveNextView() {
		currentViewPos--;
	}
	
	protected void moveToPreviousView() {
		currentViewPos++;
	}
	
	protected void moveToBottomView() {
		currentViewPos = 0;
	}
	
	private View[] initViews() {
		View[] result = new View[views];
		moveToBottomView();
		for (int i = 0; i < views; i++) {
			result[i] = initView();
			moveToPreviousView();
		}
		moveToTopView();
		return result;
	}
	
	private View initView() {
		View view = new View();
		view.setWidth(collection.size());
		view.setHeight(maxHeight);
		view.setX0(0);
		view.setY0(calcY0());
		return view;
	}
	
}
