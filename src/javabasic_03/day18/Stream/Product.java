package javabasic_03.day18.Stream;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Builder
public class Product {

    //제품은 제품번호(no), 제품이름(name), 제조사(company), 가격(price)란 속성을 가지고 있다.
    private int no;
    private String name;
    private String company;
    private int price;
}

