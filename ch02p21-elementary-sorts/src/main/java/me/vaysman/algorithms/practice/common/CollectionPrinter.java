package me.vaysman.algorithms.practice.common;

public class CollectionPrinter<T> implements ObjectPrinter {

	private SortCollection<T> collection;

	public CollectionPrinter(SortArrayBasedCollection<T> collection) {
		this.collection = collection;
	}

	@Override
	public String execute() {
		StringBuilder builder = new StringBuilder("Collection {");
		if (collection == null || collection.size() == -1) {
			builder.append("null");
		} else {
			builder.append("[ ");
			if (collection.size() > 0) {
				builder.append("\n");
			}
			int i = 0;
			for (T item : collection) {
				builder.append(i++);
				builder.append('=');
				builder.append(item);
				if (i != collection.size()) {
					builder.append(", ");
				}
			}
			builder.append("]");
		}
		builder.append("}");
		return builder.toString();
	}
	
}
