package javabasic_02.day11.Quiz3;

public class Drink {
    private String name;
    private int price;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;
    }

    public void printTitle() {


    }

    public void printData() {
    }
}
