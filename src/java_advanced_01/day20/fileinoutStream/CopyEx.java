package java_advanced_01.day20.fileinoutStream;

// 파일 복사 기능 : FileInputStream 읽은 바이트를 바로 FileOutputStream으로 출력 기능

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {

        String originalFileName = "C:/Temp/test.jpg";
        String newFileName = "C:/Temp/testCopy.jpg";

        try (
                // InputStream, OutputStream 객체 생성 => 파일을 대상으로 입출력 스트림 생성
                InputStream inputStream = new FileInputStream(originalFileName);
                OutputStream outputStream = new FileOutputStream(newFileName);
        ) {

            // 이미지 객체의 데이터를 바이트로 읽는다.
            byte[] buffer = new byte[1024]; // 읽은 바이트 수만큼 저장할 저장소 생성
            int numRead;
            while ((numRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, numRead);
            }

            // java9에서부터 입력스트림에서 출력 스트림으로 바이트를 복사하는 메소드 제공 trasferTo
//            inputStream.transferTo(outputStream);

            // 내부 비우기
            outputStream.flush();

            // 스트림 닫기
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
