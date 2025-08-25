package java_advanced_01.day20.writer;

// Writer 클래스는 OutputStream과 사용법은 동일하지만, 출력단위가 문자(char)이다.
// 문자열을 출력하는 write(String str) 메소드가 추가 제공된다.
// FileWriter 클래스를 활용하여 하나의 문자, 문자 배열, 문자열 출력하는 기능 구현

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) throws Exception {

        Writer writer = new FileWriter("C:/Temp/testChar.txt");

        // 1. 한 문자씩 파일에 출력
        char ch1 = 'A';
        writer.write(ch1);
        char ch2 = 'B';
        writer.write(ch2);
        char ch3 = 'C';
        writer.write(ch3);

        // char 배열 파일에 출력
        char[] chars = {'\n','D','E','F','G'};
        writer.write(chars);

        // 문자열 파일 출력
        String string = "\nHello IO Stream";
        writer.write(string);

        writer.flush();
        writer.close();

    }
}
