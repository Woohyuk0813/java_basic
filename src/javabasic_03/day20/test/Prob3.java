package javabasic_03.day20.test;
// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
import java.io.FileReader;
import java.io.IOException;

public class Prob3 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:/temp/hello.txt");

        int ch;
        int count = 0;

        while ((ch = reader.read()) != -1) {
            count++;
        }

        reader.close();

        System.out.println("hello.txt 파일의 문자 수: " + count);
    }
}