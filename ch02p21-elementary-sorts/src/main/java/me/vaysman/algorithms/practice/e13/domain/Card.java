package me.vaysman.algorithms.practice.e13.domain;

public class Card {

	private Suit suit;
	private Value value;
	
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Suit getSuit() {
		return suit;
	}

	public Value getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "{" + suit + ", " + value + "}";
	}
	
}
