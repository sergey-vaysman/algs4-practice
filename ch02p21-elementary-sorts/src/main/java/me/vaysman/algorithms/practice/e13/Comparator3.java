package me.vaysman.algorithms.practice.e13;

import java.util.Comparator;

import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.Suit;
import me.vaysman.algorithms.practice.e13.domain.Trump;
import me.vaysman.algorithms.practice.e13.domain.Value;

public class Comparator3 implements Comparator<Card> {

	private Trump trump;
	
	@Override
	public int compare(Card o1, Card o2) {
		Suit s1 = o1.getSuit();
		Suit s2 = o2.getSuit();
		if (s1 != s2) {
			if (isTrump(s1)) {
				return 1;
			}
			if (isTrump(s2)) {
				return -1;
			}
		}
		Value v1 = o1.getValue();
		Value v2 = o2.getValue();
		return v1.compareTo(v2);
	}
	
	boolean isTrump(Suit suit) {
		return trump.getSuit() == suit;
	}

}
