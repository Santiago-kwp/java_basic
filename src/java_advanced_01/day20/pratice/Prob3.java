package java_advanced_01.day20.pratice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) {

        try (Reader reader = new FileReader("C:/Temp/hello.txt")) {
            int charCount = 0;
            char[] cbuf = new char[1024];
            while(true) {
                int n = reader.read(cbuf);
                if (n == -1) break;
                charCount += n;
            }
            System.out.println("char count : " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
