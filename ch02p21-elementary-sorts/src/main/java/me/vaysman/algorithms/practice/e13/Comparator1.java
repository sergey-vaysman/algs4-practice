package me.vaysman.algorithms.practice.e13;

import java.util.Comparator;

import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.Suit;
import me.vaysman.algorithms.practice.e13.domain.Value;

public class Comparator1 implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		Suit s1 = o1.getSuit();
		Suit s2 = o2.getSuit();
		int suitCompare = s1.compareTo(s2);
		if (suitCompare == 0) {
			Value v1 = o1.getValue();
			Value v2 = o2.getValue();
			return v1.compareTo(v2);
		}
		return suitCompare;
	}
	
}
