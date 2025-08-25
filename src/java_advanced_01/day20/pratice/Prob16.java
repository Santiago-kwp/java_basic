package java_advanced_01.day20.pratice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고
// 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args) {
        Student student1 = Student.builder().name("김철수").age(21).grade(3.5).build();
        Student student2 = Student.builder().name("이영희").age(22).grade(3.9).build();
        Student student3 = Student.builder().name("박민수").age(20).grade(3.2).build();



        String fileName = "C:/Temp/students.dat";
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {

            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.writeObject(student3);

            List<Student> studentList = new ArrayList<>();
            studentList.add((Student) objectInputStream.readObject());
            studentList.add((Student) objectInputStream.readObject());
            studentList.add((Student) objectInputStream.readObject());

            double totalGrade = studentList.stream().mapToDouble(Student::getGrade).reduce(0,Double::sum);
            double avgGrade = studentList.stream().mapToDouble(Student::getGrade).average().orElse(0.0);
            System.out.printf("반 총점 = %.1f\n",totalGrade);
            System.out.printf("반 평균 = %.1f\n",avgGrade);
            studentList.stream().sorted().forEach(System.out::println);







        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
