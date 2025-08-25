package java_advanced_01.day20.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx02 {
    public static void main(String[] args) {

        // 바이트 배열을 통째로 출력하는 경우가 대부분
        try{
            OutputStream outputStream = new FileOutputStream("C:/Temp/test2.db");

            byte[] array = {10, 20, 30};

            // 배열의 모든 바이트를 출력
            outputStream.write(array);

            // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
            outputStream.flush();

            // 스트림을 닫는다.
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
