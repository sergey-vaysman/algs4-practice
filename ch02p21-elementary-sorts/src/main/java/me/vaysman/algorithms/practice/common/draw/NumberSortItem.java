package me.vaysman.algorithms.practice.common.draw;

public class NumberSortItem implements DrawingSortItem {

	private Number number;
	
	@Override
	public double getWeight() {
		return number.doubleValue();
	}
	
}
