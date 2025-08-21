package java_advanced_01.day18.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class Member1 {
    private String name;
    private int age;

}
public class Prob6 {
    public static void main(String[] args) {
        List<Member1> list = Arrays.asList(
                new Member1("홍길동", 30),
                new Member1("홍길동", 40),
                new Member1("홍길동", 26)

        );

        double avg = list.stream()
                .mapToInt(member -> member.getAge())
                .average().getAsDouble();
        System.out.println("평균 나이: " + avg);
    }
}
