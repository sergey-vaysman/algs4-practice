package me.vaysman.algorithms.practice.e16;

import java.util.Comparator;

import edu.princeton.cs.algs4.StdOut;
import me.vaysman.algorithms.practice.common.SortAlgorithm;
import me.vaysman.algorithms.practice.common.SortArrayBasedCollection;
import me.vaysman.algorithms.practice.e13.Comparator1;
import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e16.Certification;
import me.vaysman.algorithms.practice.e16.DeckJdkSortAlgorithm;

public class CertificationJdkSortTest {

	public static void main(String args[]) {
		SortArrayBasedCollection<Card> collection = new ArrayBasedDeckFactory().newInstance();
		SortAlgorithm<Card> algorithm = new DeckJdkSortAlgorithm();
		Comparator<Card> checkComparator = new Comparator1();
		Certification<Card> certification;
		certification = new Certification<>(collection, algorithm, checkComparator);
		boolean result = certification.check();
		StdOut.printf("check: %b%n", result);
	}
	
}
