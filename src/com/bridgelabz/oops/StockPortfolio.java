package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {

    static Scanner scanner = new Scanner(System.in);

    List<Stock> stockList = new ArrayList<>();

    public void addStockDetails() {
        Stock stock = new Stock();

        System.out.println("Enter Share Name:");
        String shareName = scanner.next();
        stock.setShareName(shareName);

        System.out.println("Enter Number of Shares:");
        int numberOfShares = scanner.nextInt();
        stock.setNumberOfShares(numberOfShares);

        System.out.println("Enter Value Of Share:");
        int valueOfShare = scanner.nextInt();
        stock.setValueOfShare(valueOfShare);

        stockList.add(stock);
    }

    public void calculateTotalShareValue() {

            for (Stock stock : stockList) {

                int totalValueOfShare = stock.valueOfShare * stock.numberOfShares;
                stock.setTotalValueOfShare(totalValueOfShare);

            }
    }

    public void generatePortfolio() {

        int totalStockValue = 0;

        System.out.println("********** STOCK PORTFOLIO ************");
        System.out.println("You own stocks of "+stockList.size()+" organizations:");

        for (Stock stock : stockList) {

            System.out.println(stock.numberOfShares+" shares of "+stock.shareName+" worth "+stock.valueOfShare+" each. Total share :"+stock.totalValueOfShare);
            totalStockValue = totalStockValue + stock.totalValueOfShare;

        }
        System.out.println();
        System.out.println("Total Stock Value is :"+ totalStockValue);
        System.out.println("**************************************");
    }
}