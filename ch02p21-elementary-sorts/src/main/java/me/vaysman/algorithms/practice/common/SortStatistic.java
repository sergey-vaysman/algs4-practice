package me.vaysman.algorithms.practice.common;

public class SortStatistic {

	private int compares;
	private int exchanges;
	
	public void increaseCompares() {
		compares++;
	}
	
	public void increaseExchanges() {
		exchanges++;
	}

	@Override
	public String toString() {
		return "SortStatistic [compares=" + compares + ", exchanges=" + exchanges + "]";
	}
	
}
