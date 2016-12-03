package me.vaysman.algorithms.practice.common.draw;

/**
 * An abstraction of a sort collection element
 * which should be graphically displayed.
 * 
 * @author Sergey Vaysman
 */
public interface DrawingSortItem {

	/**
	 * @return weight of element with difference 
	 * with other collection elements 
	 */
	double getWeight();
	
}
