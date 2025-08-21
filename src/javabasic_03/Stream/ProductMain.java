package javabasic_03.Stream;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"a","집1",2200));
        products.add(new Product(2,"b","집2",3200));
        products.add(new Product(3,"c","집3",4200));
        products.add(new Product(4,"d","집4",5200));
        products.add(new Product(5,"e","집5",6200));


        products.stream()
                .forEach(System.out::println);
    }
}
