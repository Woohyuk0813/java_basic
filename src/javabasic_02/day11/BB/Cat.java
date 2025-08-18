package javabasic_02.day11.BB;

public class Cat extends Animal{

    void meow(){
        System.out.println("야옹하고 울다");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.eat();
        obj.meow();

    }
}
