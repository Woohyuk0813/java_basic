package javabasic_03.day20.test;
// 문제 2: 텍스트 파일에 저장된 문자열 읽기
//         hello.txt 파일을 읽어 화면에 출력하세요.
import java.io.FileReader;
import java.io.IOException;

public class Prob2 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:/temp/hello.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}