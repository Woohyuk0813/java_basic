package javabasic_02.day12.exam04;
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class PromotionExample {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;  //상속관계이므로 b객체 변수에 저장된 주소값은 부모인 A타입의 a1에 담을 수 있다.
        A a2 = c;
        A a3 = d;

        B b1 = d;
        //C c2 = d;  상속관계가 아니다. 자동변환이 될 수 없다.

    }
}
