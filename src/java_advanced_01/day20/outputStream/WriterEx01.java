package java_advanced_01.day20.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx01 {
    public static void main(String[] args) {

        try {
            // 1. 출력 스트림 생성 C:Temp/test1.db에 1byte 데이터를 저장한다.
            OutputStream outputStream = new FileOutputStream("C:/Temp/test1.db");

            // 2. 내보낼 데이터를 지정
            byte num1 = 10;
            byte num2 = 20;
            byte num3 = 30;


            // 3. 데이터를 스트림에 보내서 해당 목적지에 쓴다. 1byte 씩 쓴다.
            outputStream.write(num1);
            outputStream.write(num2);
            outputStream.write(num3);

            // 4. 스트림의 버퍼를 비운다 (내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
            outputStream.flush();

            // 5. 스트림을 닫는다.
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
