package uk.co.artemiou.stockscraping;


import java.math.BigDecimal;

public class PortfolioItem {

  private String stockName;
  private double purchasePrice;
  private int quantity;

  public PortfolioItem(String stockName, double purchasePrice, int quantity) {
    this.stockName = stockName;
    this.purchasePrice = purchasePrice;
    this.quantity = quantity;
  }

  public String getStockName() {
    return stockName;
  }

  public void setStockName(String stockName) {
    this.stockName = stockName;
  }

  public double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public BigDecimal pnl(double currentValue){
    return bd(this.getPurchasePrice()).subtract(bd(currentValue)).multiply(bd(this.getQuantity()));
  }

  private BigDecimal bd(double bigDecimal) {
    return new BigDecimal(bigDecimal);
  }

}
