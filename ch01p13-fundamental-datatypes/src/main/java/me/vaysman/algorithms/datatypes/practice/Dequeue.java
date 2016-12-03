package me.vaysman.algorithms.datatypes.practice;

import java.util.Iterator;

public class Dequeue<Item> implements Iterable<Item> {

	private Node first;
	private Node last;
	private int size;

	private class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}

	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		size++;
	}
	
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		size++;
	}

	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		size--;
		if (isEmpty()) {
			last = null;
		}
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {

		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
		}
		
	}

	@Override
	public String toString() {
		StringBuilder strB = new StringBuilder("queue: [");
		int i = 0;
		for (Item item : this) {
			strB.append(item.toString());
			if (i++ < size - 1) {
				strB.append(",");
			}
		}
		strB.append("]");
		return strB.toString();
	}

	
}
