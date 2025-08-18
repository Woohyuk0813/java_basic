package javabasic_03.day13.e;

public abstract class Payment implements Payable {
    protected String shopName;
    protected String productName;
    protected int productPrice;

    public Payment(String shopName, String productName, int productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
