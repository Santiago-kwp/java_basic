package java_advanced_01.day20.datainoutstream;

import java.io.*;

public class DataInputOutputEx {
    public static void main(String[] args) throws IOException {
        // 데이터 입출력 객체 생성
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;


        fileOutputStream = new FileOutputStream("C:/Temp/primitive.db");
        dataOutputStream = new DataOutputStream(fileOutputStream);


        dataOutputStream.writeUTF("hello world\n");
        dataOutputStream.writeInt(10);
        dataOutputStream.writeDouble(3.14);
        dataOutputStream.writeBoolean(Boolean.TRUE);

        dataOutputStream.flush();
        dataOutputStream.close();

        // fileOutputStream.flush(); 중복 작업임
        fileOutputStream.close();

        // DataInputStream 객체
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;

        fileInputStream = new FileInputStream("C:/Temp/primitive.db");
        dataInputStream = new DataInputStream(fileInputStream);

        String name = dataInputStream.readUTF();
        int age = dataInputStream.readInt();
        double price = dataInputStream.readDouble();
        boolean flag = dataInputStream.readBoolean();
        System.out.println(name + " " + age + " " + price + " " + flag);


        dataInputStream.close();
        fileOutputStream.close();

    }
}
