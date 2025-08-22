package java_advanced_01.day19.sortedEx;

// 스트림 내에서 요소를 오름차순 정렬(=nature ordering) 또는 사용자 정의 비교기에 따라 정렬할 수 있다.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "신세계", "김윤진", "정현주", "남기주"
        );

        // 2. 자연순으로 정렬하여 이름을 출력하세요.
        List<String> sortedNames = names.stream().sorted().toList();
        System.out.println(sortedNames);

        // 3. 내림차순 정렬
        List<String> sortedNames1 = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNames1);

        // 4. 중간 연산 체이닝
        List<String> names2 = Arrays.asList("Alice","Bob","Carl","Dan","Eve","David");

        // names2의 이름 중 "D"로 시작하는 이름을 대문자로 모두 바꾸어, 자연정렬하여 출력하세요.
        names2.stream().filter(s -> s.startsWith("D")).
                map(String::toUpperCase).sorted().forEach(s -> System.out.print(s+ " "));
    }


}
