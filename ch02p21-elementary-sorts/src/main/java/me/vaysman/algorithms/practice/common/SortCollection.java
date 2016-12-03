package me.vaysman.algorithms.practice.common;

/**
 * Sort collection abstraction.
 * The responsibility is to store collection elements and get access
 * to edit elements number or its order.
 * 
 * @author Sergey Vaysman
 * @param <T> Collection element type
 */
public interface SortCollection<T> extends Iterable<T> {

	int size();
	
}
