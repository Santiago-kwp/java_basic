package java_advanced_01.day19.AggEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class Student {
    private String name;
    private int score;
}

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("ALice", 90),
                new Student("Boko",40),
                new Student("Coconut",98),
                new Student("Dono",60)
        );

        List<Student> students2 = Arrays.asList();

        // 합계
        int sum1 = students.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum1);
        int sum2 = students.stream().mapToInt(Student::getScore).reduce(0,(a, b) -> a+b);
        // reduce() 스트림에 요소가 없을 경우 예외가 발생하지만, identity 매개값이 주어지면 디폴트 값으로 리턴한다.
        System.out.println(sum2);
        int sum3 = students2.stream().mapToInt(Student::getScore).reduce(0, (a, b)->a+b);
        System.out.println(sum3);
        int sum4 = students2.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum4);

    }
}
