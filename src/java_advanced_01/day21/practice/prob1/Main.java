package java_advanced_01.day21.practice.prob1;

import javax.xml.xpath.XPathConstants;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:/Temp/person.dat";
        Path path = Paths.get("person.dat"); //

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path));
            ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){

            Person person = new Person("홍길동", 30);
            objectOutputStream.writeObject(person);

            Object object = objectInputStream.readObject();
            System.out.println(object);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        /*try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))){

            Person person = new Person("홍길동", 30);
            objectOutputStream.writeObject(person);

            Object object = objectInputStream.readObject();
            System.out.println(object);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
    }
}
