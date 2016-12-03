package me.vaysman.algorithms.lecture.common;

import edu.princeton.cs.algs4.StdRandom;

public class RandomDoubleArrayCreator extends ArrayCreator<Double> {

	public RandomDoubleArrayCreator(int size) {
		this.size = size;
	}

	@Override
	public Double[] create() {
		Double[] result = new Double[size];
		for (int i = 0; i < size; i++) {
			setRandomValue(result, i);
		}
		return result;
	}
	
	protected void setRandomValue(Double[] array, int pos) {
		array[pos] = StdRandom.uniform();
	}
	
	public static double[] createPrimitive(int size) {
		double[] result = new double[size];
		for (int i = 0; i < size; i++) {
			result[i] = StdRandom.uniform();
		}
		return result;
	}
	
}
