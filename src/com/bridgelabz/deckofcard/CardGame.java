package com.bridgelabz.deckofcard;

public class CardGame {

	public static void main(String[] args) {

		DistributeCard distributeCard = new DistributeCard(4, 4);

		distributeCard.distribute();

		distributeCard.printDistributedCards();
	}

}
