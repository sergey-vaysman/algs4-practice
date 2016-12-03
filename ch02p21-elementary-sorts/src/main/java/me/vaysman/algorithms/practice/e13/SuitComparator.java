package me.vaysman.algorithms.practice.e13;

import java.util.Comparator;

import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.Suit;

public class SuitComparator implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		Suit s1 = o1.getSuit();
		Suit s2 = o2.getSuit();
		return s1.compareTo(s2);
	}
	
}
