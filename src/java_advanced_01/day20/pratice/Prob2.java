package java_advanced_01.day20.pratice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 문제 2: 텍스트 파일에 저장된 문자열 읽기
//         hello.txt 파일을 읽어 화면에 출력하세요.
public class Prob2 {

    public static void main(String[] args) {

        try(Reader reader = new FileReader("C:/Temp/hello.txt");) {
            char[] cbuf = new char[1024];
            while(true) {
                int a = reader.read(cbuf);
                if (a == -1) break;
                System.out.print(cbuf);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
