package me.vaysman.algorithms.practice.common.draw;

public interface CollectionDrawer {

	void initCanvas();
	
	void execute();
	
	default void execute(String description) {
		execute();
	}
	
	default void setIsCollectionSorted(boolean isSorted) {
	}
	
	default void setGraphicDrawDelay(int millis) {
	}
	
}
