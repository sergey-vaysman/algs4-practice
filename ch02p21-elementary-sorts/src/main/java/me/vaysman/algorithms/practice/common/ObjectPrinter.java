package me.vaysman.algorithms.practice.common;

public interface ObjectPrinter {

	String execute();
	
	class NullObjectPrinter implements ObjectPrinter {
		@Override
		public String execute() {
			return "";
		}
	}
	
}
