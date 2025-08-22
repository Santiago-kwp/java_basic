package java_advanced_01.day19.filterEx;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class FilteringEx01 {
    public static void main(String[] args) {
        // List 컬렉션 ArrayList로 생성
        // List에 5명의 이름을 저장하세요

        List<String> names = Arrays.asList("홍길동", "김자바","팀쿡","잡스","홍길동","김자바");
        names.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        // 같은 이름 제거 필터링
        names.stream().distinct().forEach(s -> System.out.print(s + " "));
        System.out.println();
        // 같은 이름을 제거 하고, 이름에 "김"씨만 출력하세요.
        names.stream().distinct().filter(s -> s.startsWith("김")).forEach(s-> System.out.print(s + " "));



    }
}
