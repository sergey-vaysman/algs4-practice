package me.vaysman.algorithms.practice.common;

/**
 * A sort collection of elements based on array implementation.
 * 
 * 
 * @param <T> A type of collection items
 * 
 * @author Sergey Vaysman
 */
public interface SortArrayBasedCollection<T> extends SortCollection<T> {
	
	/**
	 * Exchange two items in collection
	 * @param pos1 Position of item 1
	 * @param pos2 Position of item 2
	 */
	void exch(int pos1, int pos2);
	
	/**
	 * Returns a collection item by its position
	 * @param pos Position of an item
	 * @return An item by its position in a collection
	 */
	T get(int pos);
	
}
