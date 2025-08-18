package javabasic_03.day13.a;

public abstract class Animal {
    int speed;
    double distance;
    Animal(){}
    Animal (int speed){
        this.speed=speed;
    }
    abstract void run (int hours);

    double getDistance(){
        return distance;
    }
}


