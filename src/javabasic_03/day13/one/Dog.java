package javabasic_03.day13.one;

public class Dog extends Animal {

    Dog(int speed) {
        this.speed = speed;

    }

    @Override
    void run(int hours) {
        distance += speed*hours/2;

    }
}
