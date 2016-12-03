package me.vaysman.algorithms.practice.e17;

import me.vaysman.algorithms.practice.common.draw.DrawingSortItem;

public class DrawingDouble implements DrawingSortItem {

	protected double value;
	
	public DrawingDouble(double value) {
		this.value = value;
	}

	@Override
	public double getWeight() {
		return value;
	}

	@Override
	public String toString() {
		return "DrawingDouble [value=" + value + "]";
	}
	
	
	
}
