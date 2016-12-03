package me.vaysman.algorithms.datatypes.lecture;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.datatypes.lecture.Stack;

public class StackTest {

	public static void main(String args[]) {
		Stack<String> stack = new Stack<>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				stack.push(item);
			} else if (!stack.isEmpty()) {
				StdOut.print(stack.pop() + " ");
			}
		}
		StdOut.println("(" + stack.size() + " left on stack)");
	}

}