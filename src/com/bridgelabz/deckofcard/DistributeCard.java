package com.bridgelabz.deckofcard;

	public class DistributeCard {

		DeckOfCards deck;

		String[][] distributedCards;
		int noOfPlayers, noOfCardEach;

		public DistributeCard(int noOfPlayers, int noOfCardEach) {
			deck = new DeckOfCards();
			deck.initDeck();
			this.noOfPlayers = noOfPlayers;
			this.noOfCardEach = noOfCardEach;
			distributedCards = new String[noOfPlayers][noOfCardEach];
		}

		public void distribute() {
			for (int i = 0; i < noOfCardEach; i++) {
				for (int j = 0; j < noOfPlayers; j++) {
					int randomIndex = (int) (Math.random() * 52);
					while (deck.cards[randomIndex] == null) {
						randomIndex = (int) (Math.random() * 52);
					}
					distributedCards[j][i] = deck.cards[randomIndex];
					deck.cards[randomIndex] = null;
				}
			}
		}

		public void printDistributedCards() {
			for (int i = 0; i < noOfPlayers; i++) {
				for (int j = 0; j < noOfCardEach; j++) {
					System.out.print(distributedCards[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("--------------------");
			deck.printCards();
		}
	}