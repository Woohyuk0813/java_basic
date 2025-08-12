package javabasic_03.day13.e;

public class CashPayment extends Payment {
    private String cashReceiptNumber; // 현금영수증 번호

    public CashPayment(String shopName, String productName, int productPrice, String cashReceiptNumber) {
        super(shopName, productName, productPrice); // 부모 클래스 멤버 초기화
        this.cashReceiptNumber = cashReceiptNumber; // 현금영수증 번호 초기화
    }

    @Override
    public void pay() throws PayException {
        if (productPrice <= 0) {
            throw new PayException("상품 가격이 올바르지 않습니다.");
        }
        System.out.println(shopName + "에서 " + productName + "를 "
                + productPrice + "원 현금 결제 완료 (영수증 번호: " + cashReceiptNumber + ")");
    }

    @Override
    public String toString() {
        return "CashPayment [shopName=" + shopName +
                ", productName=" + productName +
                ", productPrice=" + productPrice +
                ", cashReceiptNumber=" + cashReceiptNumber + "]";
    }
}
