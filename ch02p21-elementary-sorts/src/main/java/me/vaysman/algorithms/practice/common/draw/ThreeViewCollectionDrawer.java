package me.vaysman.algorithms.practice.common.draw;

import java.awt.Color;

import edu.princeton.cs.algs4.StdDraw;
import me.vaysman.algorithms.practice.common.SortCollection;

public class ThreeViewCollectionDrawer extends VerticalCollectionDrawer {

	public ThreeViewCollectionDrawer(SortCollection<? extends DrawingSortItem> collection) {
		super(3);
		this.collection = collection;
		moveToMiddleView();
	}
	
	/**
	 * The flag detects was the collection already drawn at the top
	 */
	private boolean isInitialCollectionDrawn;
	
	private boolean isCollectionSorted;
	
	@Override
	public void execute() {
		StdDraw.show(drawingDelay);
		clearMiddleView();
		displayView();
		if (!isInitialCollectionDrawn) {
			drawInitialCollection();
		}
		if (isCollectionSorted) {
			drawSortedCollection();
		}
	}
	
	private void moveToMiddleView() {
		currentViewPos = 1;
	}
	
	private void moveToTopView() {
		currentViewPos = 2;
	}
	
	private void moveToBottomView() {
		currentViewPos = 0;
	}
	
	/**
	 * Draws initial collection on top,
	 * clean a middle view for next changes
	 */
	private void drawInitialCollection() {
		moveToTopView();
		displayView();
		clearMiddleView();
		isInitialCollectionDrawn = true;
		moveToMiddleView();
	}
	
	/**
	 * Draws sorted collection on bottom,
	 * clean a middle view for next changes
	 */
	private void drawSortedCollection() {
		moveToBottomView();
		displayView();
		StdDraw.show();
		clearMiddleView();
	}
	
	@Override
	public void setIsCollectionSorted(boolean isCollectionSorted) {
		this.isCollectionSorted = isCollectionSorted;
	}

	private void clearMiddleView() {
		moveToMiddleView();
		StdDraw.setPenColor(Color.WHITE);
		double yMiddle = calcY0() + maxHeight / 2;
		double xMiddle = (double) collection.size() / 2;
		double halfWidth = xMiddle + 2;
		double halfHeight = maxHeight / 2;
		StdDraw.filledRectangle(xMiddle, yMiddle, halfWidth, halfHeight);
	}
	

}
