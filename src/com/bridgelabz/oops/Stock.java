package com.bridgelabz.oops;

public class Stock {

	String shareName;
	int numberOfShares;
	int valueOfShare;

	int totalValueOfShare;

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public int getValueOfShare() {
		return valueOfShare;
	}

	public void setValueOfShare(int valueOfShare) {
		this.valueOfShare = valueOfShare;
	}

	public int getTotalValueOfShare() {
		return totalValueOfShare;
	}

	public void setTotalValueOfShare(int totalValueOfShare) {
		this.totalValueOfShare = totalValueOfShare;
	}

	@Override
	public String toString() {
		return "Stock{" + "shareName='" + shareName + '\'' + ", numberOfShares=" + numberOfShares + ", valueOfShare="
				+ valueOfShare + ", totalValueOfShare=" + totalValueOfShare + '}';
	}
}