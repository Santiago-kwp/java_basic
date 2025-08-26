package java_advanced_01.day21.practice.prob4;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:/Temp/accounts.dat";

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Account account = new Account("철수",10000);

            outputStream.writeObject(account);
            Object object = inputStream.readObject();
            System.out.println(object);



        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
