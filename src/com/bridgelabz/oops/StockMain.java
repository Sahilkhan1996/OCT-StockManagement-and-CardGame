package com.bridgelabz.oops;

import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Stock Management Program");

		StockPortfolio stockPortfolio = new StockPortfolio();

		System.out.println("How many stocks are you purchasing ?");
		int numberOfStocks = sc.nextInt();

		for (int i = 0; i < numberOfStocks; i++) {

			System.out.println("Enter stock details for organization " + (i + 1) + ":");
			stockPortfolio.addStockDetails();
			stockPortfolio.calculateTotalShareValue();

		}

		stockPortfolio.generatePortfolio();

		sc.close();
	}

}