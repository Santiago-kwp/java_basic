package java_advanced_01.day18.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class Member {
    private String name;
    private String job;

}

public class Prob7 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(member -> member.getJob().equals("개발자"))
                .toList();

        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
