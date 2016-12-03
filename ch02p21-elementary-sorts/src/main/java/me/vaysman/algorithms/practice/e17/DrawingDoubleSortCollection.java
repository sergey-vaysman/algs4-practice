package me.vaysman.algorithms.practice.e17;

import java.util.Iterator;

import me.vaysman.algorithms.practice.common.SortArrayBasedCollection;
import me.vaysman.algorithms.practice.e16.ArrayBasedIterator;

public class DrawingDoubleSortCollection implements SortArrayBasedCollection<DrawingDouble> {

	private DrawingDouble[] array;
	
	public DrawingDoubleSortCollection(DrawingDouble[] array) {
		this.array = array;
	}

	@Override
	public int size() {
		return array.length;
	}
	
	@Override
	public Iterator<DrawingDouble> iterator() {
		return new ArrayBasedIterator<>(array);
	}

	@Override
	public void exch(int pos1, int pos2) {
		DrawingDouble tmp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = tmp;
	}

	@Override
	public DrawingDouble get(int pos) {
		return array[pos];
	}

}
