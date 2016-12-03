package me.vaysman.algorithms.datatypes.lecture;

import edu.princeton.cs.algs4.StdOut;

public class QueueTest {

	public static void main(String args[]) {
		Queue<String> queue = new Queue<>();
		String[] arr = {"el1", "el2", "el3", "-"};
		for (String item : arr) {
			if (!item.equals("-")) {
				queue.enqueue(item);
			} else if (!queue.isEmpty()) {
				StdOut.printf("%s ", queue.dequeue());
			}
		}
		StdOut.printf("%n(%d left on queue)%n", queue.size());
	}

}