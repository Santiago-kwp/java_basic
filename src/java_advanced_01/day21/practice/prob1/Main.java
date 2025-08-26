package java_advanced_01.day21.practice.prob1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:/Temp/person.dat";

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){

            Person person = new Person("홍길동", 30);
            objectOutputStream.writeObject(person);

            Object object = objectInputStream.readObject();
            System.out.println(object);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
