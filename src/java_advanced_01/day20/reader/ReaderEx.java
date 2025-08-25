package java_advanced_01.day20.reader;

import org.w3c.dom.CDATASection;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws Exception{

        Reader reader = null;

        // 1. 문자 하나씩 읽기
        reader = new FileReader("C:/Temp/testChar.txt");
        while(true) {
            int data = reader.read();
            if (data == -1) break;
            System.out.print((char) data);
        }
        reader.close();

        System.out.println();
        // 2. 문자 배열로 읽기
        // 한 번 읽으면 내부에 카운터가 이미 파일의 끝을 가리키고 있어서 새로 생성해줘야 함?!
        reader = new FileReader("C:/Temp/testChar.txt");

        char[] dataArr = new char[100];

        while(true) {
            int numRead = reader.read(dataArr);
            if (numRead == -1) break;
            for (char c : dataArr) {
                System.out.print(c);
            }
        }

        // 3. 문자열로 읽기

        reader.close();


    }
}
