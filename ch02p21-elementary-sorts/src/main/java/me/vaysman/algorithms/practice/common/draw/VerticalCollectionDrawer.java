package me.vaysman.algorithms.practice.common.draw;

import edu.princeton.cs.algs4.StdDraw;
import me.vaysman.algorithms.practice.common.SortCollection;

public class VerticalCollectionDrawer implements CollectionDrawer {

	protected SortCollection<? extends DrawingSortItem> collection;
	
	/**
	 * How much views should be displayed
	 */
	protected int views;
	
	/**
	 * The maximum height for an item
	 */
	protected double maxHeight;
	
	/**
	 * Current view position (from the top to the bottom)
	 */
	protected int currentViewPos;
	
	protected int drawingDelay;

	@Override
	public void setGraphicDrawDelay(int millis) {
		drawingDelay = millis;
	}

	public VerticalCollectionDrawer(int views) {
		this.views = views;
		maxHeight = (double) 1 / views - StdDraw.getPenRadius() * 2;
		currentViewPos = views - 1;
	}
	
	@Override
	public void execute() {
		displayView();
		currentViewPos--;
	}
	
	protected void displayView() {
		StdDraw.setPenColor(StdDraw.BLACK);
		double y0 = calcY0();
		int i = 0;
		for (DrawingSortItem item : collection) {
			double y1 = calcY1(item);
			StdDraw.line(i, y0, i, y1);
			i++;
		}
	}
	
	protected double calcY0() {
		if (views < 2) {
			return 0;
		}
		double k = (double) 1 / views;
		k *= currentViewPos;
		return k;
	}
	
	protected double calcY1(DrawingSortItem item) {
		double y0 = calcY0();
		double height = item.getWeight() * maxHeight;
		double y1 = y0 + height;
		return y1;
	}

	@Override
	public void initCanvas() {
		StdDraw.setCanvasSize(1024, 650);
        StdDraw.setXscale(-0.5, collection.size());
        StdDraw.setPenRadius(0.01);
        StdDraw.show();
	}

}
