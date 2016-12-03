package me.vaysman.algorithms.lecture.common;

public abstract class ArrayCreator<T extends Comparable<T>> {

	protected int size;
	
	public abstract T[] create();
	
}
