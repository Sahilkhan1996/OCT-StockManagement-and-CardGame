package com.bridgelabz.deckofcard;

public class DeckOfCards {

	String[] suits;
	String[] ranks;

	String[] cards;

	public DeckOfCards() {
		suits = new String[] { "S", "C", "D", "H" };
		ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
				"K", "A" };
		cards = new String[ranks.length * suits.length];
	}

	public void initDeck() {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				cards[ranks.length * i + j] = ranks[j] + suits[i];
				/*
				 * System.out.println("i:" + i + "\tj:" + j + "\tcard Index:" +
				 * (ranks.length * i + j) + "");
				 */
			}
		}
	}

	public void printCards() {
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
}