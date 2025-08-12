package javabasic_03.day13.a;

public class Chicken extends Animal implements Cheatable {


    Chicken(int speed){
        this.speed = speed;
    }

    @Override
    void run(int hours) {
        distance += (double) speed*hours;
    }

    @Override
    public void fly() {
        super.speed*=2;         //super.speed = super.speed*2;
    }
}
