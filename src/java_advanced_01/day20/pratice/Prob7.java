package java_advanced_01.day20.pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) {

        int fileSize = 0;

        try(InputStream inputStream = new FileInputStream("C:/Temp/copy.jpg")) {
            byte[] bbuf = new byte[1024];
            while (true) {
                int n = inputStream.read(bbuf);
                if (n == -1) break;
                fileSize += n;
            }

            File file = new File("C:/Temp/copy.jpg");
            System.out.println("file size of copy.jpg : " + fileSize);
            System.out.println("file size of copy.jpg : " + file.length());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
