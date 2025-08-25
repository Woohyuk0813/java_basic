package javabasic_03.day20.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) throws IOException {
        FileInputStream a = new FileInputStream("C:/temp/test.jpg");
        FileOutputStream b = new FileOutputStream("C:/temp/testCopy.jpg");

        a.transferTo(b);

        a.close();
        b.close();

        System.out.println("이미지 복사 완료");
    }
}