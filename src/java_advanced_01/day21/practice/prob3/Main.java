package java_advanced_01.day21.practice.prob3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:/Temp/students.dat";



        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))){

            Student student1 = new Student("김모씨",90);
            Student student2 = new Student("박모씨",80);

            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            while(true) {
                Object object = objectInputStream.readObject();
                System.out.println(object);
            }

        } catch (EOFException e) {
            System.out.println("파일의 끝 도달");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
