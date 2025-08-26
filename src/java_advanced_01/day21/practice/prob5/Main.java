package java_advanced_01.day21.practice.prob5;

import java_advanced_01.day21.practice.prob4.Account;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:/Temp/order.dat";

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {

            Order order = new Order(1, new Product("아이폰17", 2000000));
            outputStream.writeObject(order);

            Object object = inputStream.readObject();
            System.out.println(object);



        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
