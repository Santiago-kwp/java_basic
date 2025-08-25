package java_advanced_01.day20.pratice;

import java.io.*;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:/Temp/numbers.dat"));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:/Temp/numbers.dat"))){
            dataOutputStream.writeInt(10);
            dataOutputStream.writeInt(20);
            dataOutputStream.writeInt(30);

            dataOutputStream.flush();

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
