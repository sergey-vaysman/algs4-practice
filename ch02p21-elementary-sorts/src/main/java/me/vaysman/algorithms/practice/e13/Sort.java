package me.vaysman.algorithms.practice.e13;

public interface Sort<T> {
	
	void sort();
	
	void compare(int pos1, int pos2);
	
	void exch(int pos1, int pos2);
	
	/**
	 * @return a collection which should be sorted
	 */
	T getCollection();

}
