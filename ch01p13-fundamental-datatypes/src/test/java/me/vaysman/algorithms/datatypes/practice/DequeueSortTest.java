package me.vaysman.algorithms.datatypes.practice;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.datatypes.practice.Dequeue;

public class DequeueSortTest {

	public static void main(String args[]) {
		String[] arr = {"a", "b", "c", "d", "e"};
		Dequeue<String> dequeue = new Dequeue<>();
		for (String item : arr) {
			dequeue.enqueue(item);
		}
		StdOut.printf("dequeue initial: %s%n", dequeue);
		String dequeued = dequeue.dequeue();
		StdOut.printf("dequeue after dequeue(): %s%n", dequeue);
		dequeue.enqueue(dequeued);
		StdOut.printf("dequeue after enqueue(): %s%n", dequeue);
		dequeued = dequeue.dequeue();
		StdOut.printf("dequeue after dequeue(): %s%n", dequeue);
		dequeue.push(dequeued);
		StdOut.printf("dequeue after push(): %s%n", dequeue);
	}
	
}
