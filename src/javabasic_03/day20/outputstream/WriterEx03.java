package javabasic_03.day20.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterEx03 {
    public static void main(String[] args) throws Exception {

        //1. 출력스트림 생성 C:Temp/test.db에 1byte 데이터를 저장한다.
        OutputStream os = new FileOutputStream("C:/temp/test1.txt");

        //2. 내보낼 데이터를 지정
        byte[] array = {10,20,30,40,50};

        //3. 데이터를 스트림에 보내서 해당 목적지에 쓴다. 배열의 인덕세 1부터 시작하여 3개까지만 출력, 20,30,40
        os.write(array,1,3);

        //4. 스트림의 버퍼를 비운다 (내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움)
        os.flush();

        //5. 스트림을 닫는다.
        os.close();
    }
}
