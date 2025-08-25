package java_advanced_01.day20.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {
    public static void main(String[] args) {

        try {
            // 1. 리소스 객체를 대상으로 입력 스트림을 생성
            InputStream inputStream = new FileInputStream("C:/Temp/test1.db");


            // 2. 리소스의 읽을 데이터가 존재한다면 읽어 온다.
            while(true) {
                int data = inputStream.read();
                // 파일은 끝이 있다. EOF (End of File) => -1
                if (data == -1) break;
                System.out.println(data);
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
