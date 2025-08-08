package javabasic_02.day13.Animal;

public abstract class Animal {
    //메소드 선언
    public void breathe(){
        System.out.println("동물은 숨을 쉰다.");
    }


    //추상 메소드 선언
    public abstract void sound();
}
