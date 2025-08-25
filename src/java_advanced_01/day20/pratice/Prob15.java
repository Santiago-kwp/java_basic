package java_advanced_01.day20.pratice;

import java.io.*;

//문제 : 학생 이름 "신세계" 나이 25 학점 3.8 을 student.dat파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob15 {
    public static void main(String[] args) {


        Student student = Student.builder().name("신세계").age(25).grade(3.8).build();

        String fileName = "C:/Temp/student.dat";
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {

            objectOutputStream.writeObject(student);

            Student studentRead = (Student) objectInputStream.readObject();

            System.out.println(studentRead);




        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
