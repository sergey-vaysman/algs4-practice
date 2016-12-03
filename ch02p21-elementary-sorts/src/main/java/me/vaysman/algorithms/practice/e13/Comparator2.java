package me.vaysman.algorithms.practice.e13;

import java.util.Comparator;

import me.vaysman.algorithms.practice.e13.domain.Card;
import me.vaysman.algorithms.practice.e13.domain.Value;

public class Comparator2 implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		Value v1 = o1.getValue();
		Value v2 = o2.getValue();
		return v1.compareTo(v2);
	}

}
