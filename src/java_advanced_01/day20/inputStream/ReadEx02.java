package java_advanced_01.day20.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx02 {
    public static void main(String[] args) {

        try {
            // 1. 리소스 객체를 대상으로 입력 스트림을 생성
            InputStream inputStream = new FileInputStream("C:/Temp/test2.db");

            byte[] array = new byte[100];

            // 2. 리소스의 읽을 데이터가 존재한다면 읽어 온다.
            while(true) {
                int data = inputStream.read(array); // 최대 100 바이트를 읽고, 읽은 바이트 수만큼 정수 값 리턴해서 data에 저장

                // 파일은 끝이 있다. EOF (End of File) => -1
                if (data == -1) break;

                for (int i = 0; i < data; i++) {
                    System.out.println(array[i]);
                }
            }


            // 3. 다 읽었으면 입력 스트림 닫기
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
            throw new RuntimeException(e);
        } catch (IOException e1) {
            System.out.println("I/O Exception");
        } catch (Exception e2) {
            System.out.println("Exception");
        }
    }
}
