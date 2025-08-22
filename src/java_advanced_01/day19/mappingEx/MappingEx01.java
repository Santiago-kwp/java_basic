package java_advanced_01.day19.mappingEx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
@Builder
class Student{
    private String name;
    private int score;
}

public class MappingEx01 {

    public static void main(String[] args) {
        // 학생 3명을 리스트 컬렉션을 생성하여 순서대로 저장하세요.
        List<Student> students = Arrays.asList(
                Student.builder().name("홍길동").score(90).build(),
                Student.builder().name("김자바").score(70).build(),
                Student.builder().name("박디비").score(80).build()
        );

        // 학생들의 점수(score)를 stream() 방법으로 출력하세요.
        students.stream().mapToInt(Student::getScore).forEach(s-> System.out.print(s + " "));
        students.stream().forEach(student -> System.out.print(student.getScore()+ " "));

        // 학생들의 총점을 출력하세요.
        int totalScore = students.stream().mapToInt(Student::getScore).sum();
        System.out.println("total score : " + totalScore);

        // 학생들의 점수의 평균을 출력하세요. 80.1
        double avgScore = students.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.println("average score : " + avgScore);

    }

}
