package javabasic_03.day13.e;

public class CardPayment extends Payment {
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(String shopName, String productName, int productPrice,
                       String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public void pay() throws PayException {
        if (productPrice <= 0 || cardNumber == null || monthlyInstallment <= 0) {
            throw new PayException("결제 정보가 올바르지 않습니다.");
        }
        System.out.println(shopName + "에서 " + productName + "를 "
                + productPrice + "원 결제합니다. (카드 할부: " + monthlyInstallment + "개월)");
    }

    @Override
    public String toString() {
        return "CardPayment [shopName=" + shopName
                + ", productName=" + productName
                + ", productPrice=" + productPrice
                + ", cardNumber=" + cardNumber
                + ", cardPassword=" + cardPassword
                + ", monthlyInstallment=" + monthlyInstallment + "]";
    }
}
