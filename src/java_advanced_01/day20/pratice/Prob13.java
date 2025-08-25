package java_advanced_01.day20.pratice;

import java.io.*;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" , 불리언 true 를 data.dat에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) {


        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:/Temp/data.dat"));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:/Temp/data.dat"))){
            dataOutputStream.writeInt(100);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeUTF("Java");
            dataOutputStream.writeBoolean(Boolean.TRUE);
            dataOutputStream.flush();

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readBoolean());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    }
}
