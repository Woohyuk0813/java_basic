package javabasic_03.day21.serialize.Test;

import java.io.*;

public class SerializableEx {
    public static void main(String[] args)throws Exception  {
        String fileName = "person.dat";

        try (ObjectOutputStream aaa = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // objectoutputstream aaa 참조변수에 새로운 ObjectOutputStream를 객체를 생성하고 FileOutputStream을 통해 person.dat을 받는다.
            Person person1 = new Person("홍길동", 30);
            // person1 객체에 홍길동이라는 이름과 30의 나이를 저장한다.
            aaa.writeObject(person1);
            //객체 person1을 직렬화해서 스트림에 쓴다.
        } catch (IOException e) {
            //try 블록에서 예외가 발생하면 e로 받는다.
            System.out.println(e.getMessage());
           // 예외가 발생하면 예외 객체 e에서 메시지를 가져와서 콘솔에 출력한다.

        }


        try (ObjectInputStream bbb = new ObjectInputStream(new FileInputStream(fileName))) {

            Person person2 = (Person) bbb.readObject();
            System.out.println(person2.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
