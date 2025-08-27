package javabasic_03.day21.serialize.Test;
//자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있다.
//객체를 입출력 할 수 있는 보조 스트림
//ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화
//ObjectOutStream(바이트 스트림과 연결되어 객체를 직렬화)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable {
    private String name;
    private int age;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable {
    private String pname;
    private int price;
}

public class ObjectInOutEx {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        //1. C:Temp/object.dat 에 파일 객체에 파일 입력스트림 객체를 생성.
        try {
            fos = new FileOutputStream("C:Temp/object.dat");
            //2. 생성된 파일 입력스트림 객체에 객체 출력스트림 객체를 끼워주세요.
            oos = new ObjectOutputStream(fos);

            //3. 객체 생성
            User user = new User("신세계", 20);
            Product product = new Product("삼성 노트북", 1500000);
            int[] arr1 = {10, 20, 30};
            List<Product> products = Arrays.asList(product);

            //4. 위 4개의 객체를 object.dat 파일에 저장
            oos.writeObject(products);
            oos.writeObject(arr1);
            oos.writeObject(product);
            oos.writeObject(user);
        } catch (Exception e) {
            throw new RuntimeException(e); //   
        } finally {
            oos.close();
            fos.close();
        }
        //파일에서 읽어서 객체를 복원시켜주세요
        FileInputStream aaa = new FileInputStream("C:Temp/object.dat");
        ObjectInputStream bbb = new ObjectInputStream(aaa);

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:Temp/object.dat"));

            List<Product> productsRead = (List<Product>) ois.readObject();
            int[] arr1Read = (int[]) ois.readObject();
            Object productRead = ois.readObject();
            Object userRead = ois.readObject();


            bbb.close();
            aaa.close();

            System.out.println("Products: " + productsRead);
            System.out.println("Array: " + (Arrays.toString(arr1Read)));
            System.out.println("Product: " + productRead);
            System.out.println("User: " + userRead);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
