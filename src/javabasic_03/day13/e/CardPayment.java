package javabasic_03.day13.e;

class CardPayment extends Payment {
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
        if (productPrice <= 0 || monthlyInstallment < 0) {
            throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
        }
        System.out.println("(신용카드) 결제되었습니다.");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "[ 결제 정보 ]\n" +
                "상점명 : " + shopName + "\n" +
                "상품명 : " + productName + "\n" +
                "상품가격 : " + productPrice + "\n" +
                "카드번호 : " + cardNumber + "\n" +
                "할부개월수 : " + monthlyInstallment;
    }
}
