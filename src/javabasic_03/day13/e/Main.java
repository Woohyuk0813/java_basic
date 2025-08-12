package javabasic_03.day13.e;

public class Main {
    public static void main(String[] args) {
        try {
            CardPayment card = new CardPayment("ABC Mart", "노트북", 1500000,
                    "1234-5678-9876-5432", "12**", 12);
            card.pay();
            System.out.println(card);

            CashPayment cash = new CashPayment("XYZ Shop", "청바지", 50000,
                    "010-1234-5678");
            cash.pay();
            System.out.println(cash);

        } catch (PayException e) {
            System.out.println("결제 실패: " + e.getMessage());
        }
    }
}
