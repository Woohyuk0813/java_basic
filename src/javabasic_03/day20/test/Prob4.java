package javabasic_03.day20.test;
// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
import java.io.FileOutputStream;
import java.io.IOException;

public class Prob4 {

    public static void main(String[] args) throws IOException {

        String text = "ABCDEF";


        FileOutputStream abc = new FileOutputStream("C:/temp/byte_output.txt");
        abc.write(text.getBytes());
        abc.close();

        System.out.println("저장완료");
    }
}