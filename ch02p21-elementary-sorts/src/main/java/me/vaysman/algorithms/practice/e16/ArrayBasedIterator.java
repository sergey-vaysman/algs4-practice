package me.vaysman.algorithms.practice.e16;

import java.util.Iterator;

public class ArrayBasedIterator<T> implements Iterator<T> {

	private T[] array;
	int i;
	
	public ArrayBasedIterator(T[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return i < array.length;
	}

	@Override
	public T next() {
		return array[i++];
	}

}
