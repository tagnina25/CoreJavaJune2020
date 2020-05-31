public class Stock {

	String stockName;
	int numberOfShares;
	double priceOfShare;

	public Stock(String name, int shares, double price) {
		stockName = name;
		numberOfShares = shares;
		priceOfShare = price;
	}

	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String pStockName) {
		stockName = pStockName;
	}

	/**
	 * @return the numberOfShares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}

	/**
	 * @param numberOfShares the numberOfShares to set
	 */
	public void setNumberOfShares(int pNumberOfShares) {
		numberOfShares = pNumberOfShares;
	}

	/**
	 * @return the priceOfShare
	 */
	public double getPriceOfShare() {
		return priceOfShare;
	}

	/**
	 * @param priceOfShare the priceOfShare to set
	 */
	public void setPriceOfShare(double pPriceOfShare) {
		priceOfShare = pPriceOfShare;
	}

	public double calculateStockValue() {
		double stockValue = (numberOfShares * priceOfShare);

		return stockValue;
	}

	public void printInfo() {
		System.out.println("Stock Name: " + stockName);
		System.out.println("Stock Quantity: " + numberOfShares);
		System.out.println("Stock Price: " + priceOfShare);


	}

}
