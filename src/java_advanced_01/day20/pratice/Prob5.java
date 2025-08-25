package java_advanced_01.day20.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) {

        try(InputStream inputStream = new FileInputStream("C:/Temp/byte_output.txt")) {
            // 한 바이트씩 읽어서 출력하기
            while(true) {
                int n = inputStream.read();
                if (n == -1 ) break;
                System.out.print((char) n);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
