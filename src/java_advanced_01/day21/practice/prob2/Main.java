package java_advanced_01.day21.practice.prob2;

import java_advanced_01.day21.practice.prob1.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("소년이 간다", 20000));
        books.add(new Book("바른 마음", 22000));
        books.add(new Book("권력과 진보", 25000));

        String fileName = "C:/Temp/books.dat";

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){

            objectOutputStream.writeObject(books);

            Object object = objectInputStream.readObject();
            System.out.println(object);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
